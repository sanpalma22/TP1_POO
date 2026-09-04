package Ejercicio4;

public class Notificador {
    private String destinatario;
    private String mensaje;
    private String via;

    public Notificador(String destinatario, String mensaje, String via) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.via=via;
    }
    public void enviar(){
        if(via=="SMS"){
            System.out.println("Enviando SMS a " + destinatario);
            System.out.println(mensaje);
        }else if(via=="CORREO"){
            System.out.println("Enviar correo a " + destinatario);
            System.out.println(mensaje);
        }
    }
}
