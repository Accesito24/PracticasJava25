package dam.practicas.ejerciciosExcepciones.CuentaBancaria;

import java.lang.IllegalArgumentException;

public class CuentaBancaria {
    double saldo;
    double cantidad;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }


    public void retirar(double cantidad) throws IllegalArgumentException, ArithmeticException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("No se puede retirar una cantidad negativa");
        }
        if (cantidad >= this.saldo) {
            throw new ArithmeticException("Saldo insuficiente para realizar la operacion");
        }
        this.saldo = saldo - cantidad;
        System.out.println("Se ha retirado " + cantidad + " correctamente");
    }
}
