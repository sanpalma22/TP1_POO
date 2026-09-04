package Ejercicio5;

public class CuentaCorriente extends CuentaBancaria {
    double limiteDescubierto;
    double costoMantenimiento;
    public CuentaCorriente(String numeroCuenta, String titular, double saldo, double limiteDescubierto, double costoMantenimiento){
        super(numeroCuenta, titular, saldo);
        this.limiteDescubierto = limiteDescubierto;
        this.costoMantenimiento = costoMantenimiento;
    };
    @Override
    public double extraer(double monto){
        double extraccion = super.extraer(monto);
        if (getSaldo() < this.limiteDescubierto){
            return extraccion;
        };
        return -1;
    };

    @Override
    public double calcularSaldoFinal(){
        return getSaldo() - this.costoMantenimiento;
    }
}
