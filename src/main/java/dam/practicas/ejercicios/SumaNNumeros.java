package dam.practicas.ejercicios;

import java.util.Scanner;

public class SumaNNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dame un numero entero positivo y te dire la suma de todos los numeros desde 1 hasta el numero que me digas");
        int num1 = leer.nextInt();

        if (num1 <= 0) {
            System.out.println("No es un numero positivo");
        } else {
            int suma = 0;

            for (int i = 1; i <= num1; i++) {
                suma += i;
            }

            System.out.println("El numero es positivo y la suma de los numeros es: " + suma);
        }
    }
}