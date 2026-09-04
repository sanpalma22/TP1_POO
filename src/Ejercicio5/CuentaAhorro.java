package Ejercicio5;

public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteres;
    public CuentaAhorro(String numeroCuenta, String titular, double saldo, double tasaInteres){
        super(numeroCuenta, titular, saldo);
        this.tasaInteres = tasaInteres;
    };

    @Override
    public double calcularSaldoFinal(){
        return getSaldo() + this.tasaInteres;
    };
}
