package Ejercicio4;

public class GestorPedido {
    public void marcarComoListo(Pedido ped, Notificador not){
        if(ped.getEstado()!="LISTO"){
            ped.setEstado("LISTO");
            not.enviar();
        }
    }
}
