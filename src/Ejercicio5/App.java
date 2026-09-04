package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        CuentaAhorro CA = new CuentaAhorro("123456", "octavio", 0d, 100.0d );
        CuentaCorriente CC = new CuentaCorriente("123", "octavio", 0d,  100.0, 100.0);
        CA.depositar(1000d);
        CC.depositar(500d);
        double dineroLiquido = CA.extraer(300d);
        dineroLiquido += CC.extraer(300d);
        List<CuentaBancaria> cuenta = new ArrayList<>();
        cuenta.add(CA);
        cuenta.add(CC);
        for (CuentaBancaria c : cuenta){
            double saldofinal = c.calcularSaldoFinal();
            System.out.println(saldofinal);
        };

    };
}
