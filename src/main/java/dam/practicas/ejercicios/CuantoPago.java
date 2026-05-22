package dam.practicas.ejercicios;

import java.util.Scanner;  // ← DESPUÉS los imports

public class CuantoPago {  // ← FINALMENTE la clase

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el precio original de la compra: " );
        double PrecioOriginal  = leer.nextDouble();

        System.out.println("Ingrese en cuantos meses: " );
        double Meses = leer.nextDouble();

        System.out  .println("Ingrese el interes mensual (en porcentaje): " );
        double Intereses = leer.nextDouble();

        //PAGO MENSUAL ________________________________________________________-----
        double porcentaje = Intereses / 100;
        double factorCrecimiento = 1 + porcentaje;
        double montoTotal = PrecioOriginal * Math.pow(factorCrecimiento, Meses);
        double pagoMensual = montoTotal / Meses;
        //PAGO TOTAL ________________________________________________________-----
        double pagoTotal = pagoMensual * Meses;

        System.out.printf("El pago mensual es: $%.2f%n", pagoMensual);
        System.out.printf("El pago total es de: $%.2f%n", pagoTotal);


    }

}