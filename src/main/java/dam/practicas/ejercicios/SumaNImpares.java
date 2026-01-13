package dam.practicas.ejercicios;

import java.util.Scanner;

public class SumaNImpares {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Dame un numero entero positivo y te mostrare");
        System.out.print(" los numeros impares desde el 1 hasta el numero");
        System.out.println(" que me digas: ");

        int num1 = leer.nextInt();

        if (num1 <= 0) {
            System.out.println("El numero es negativo o cero");
        } else {
            int suma = 0;

            System.out.println("Números impares desde 1 hasta " + num1 + ":");

            for (int i = 1; i <= num1; i++) {
                if (i % 2 != 0) { // Si es impar
                    System.out.print(i + " ");
                    suma += i;
                }
            }

            System.out.println("\nLa suma de todos los impares es: " + suma);
        }

        leer.close();
    }
}
