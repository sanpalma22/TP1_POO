package Ejercicio4;

public class Pedido {
    private int numPedido;
    private String estado;
    private int total;

    public Pedido(int numPedido, String estado, int total) {
        this.numPedido = numPedido;
        this.estado = estado;
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
