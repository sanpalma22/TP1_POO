package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(10, "EN PREPARACION", 100000);
        Pedido pedido2 = new Pedido(11, "EN PREPARACION", 100000);
        Notificador notificador1 = new Notificador(
                "spalma@gmail.com",
                "El pedido está listo para retirar",
                "CORREO"
        );
        Notificador notificador2 = new Notificador(
                "11 3288-5722",
                "El pedido está listo para retirar",
                "SMS"
        );

        GestorPedido gestor = new GestorPedido();

        gestor.marcarComoListo(pedido1, notificador1);
        gestor.marcarComoListo(pedido2,notificador2);
    }
}
