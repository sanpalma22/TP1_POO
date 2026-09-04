package Ejercicio5;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;
    public CuentaBancaria(String numeroCuenta, String titular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    };

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto){
        this.saldo += monto;
    };

    public double extraer(double monto){
        if (monto > 0){
            if (this.saldo >= monto){
                this.saldo -= monto;
                return monto;
            }
            else{
                System.out.println("Saldo insuficiente");
            };
        }
        else {
            System.out.println("Ingrese un monto correcto");
        };
        return -1;
    };

    public double calcularSaldoFinal(){
        return this.saldo;
    };

    public void mostarInformacion(){
        System.out.println("CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}');
    };
};
