package dam.practicas.ejercicios;

import java.util.Scanner;

public class NPrimerosPrimos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("¿Cuántos números primos quieres ver? ");
        int num = scan.nextInt();

        if (num <= 0) {
            System.out.println("Debe ser un número positivo");
        } else if (num == 1) {
            System.out.println("Los primeros " + num + " números primos son: 2");
        } else {
            int contadorPrimos = 2;
            int contadorNumeros = 3;

            System.out.print("Los primeros " + num + " números primos son: 2, 3");

            contadorNumeros = 5; // Empezar desde 5 (siguiente impar después del 3)

            while (contadorPrimos < num) {
                boolean esPrimo = true;

                // Verificar si es divisible por algún número desde 3 hasta su raíz cuadrada
                for (int i = 3; i <= Math.sqrt(contadorNumeros); i += 2) {
                    if (contadorNumeros % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo) {
                    contadorPrimos++;
                    System.out.print(", " + contadorNumeros);
                }

                contadorNumeros += 2; // Solo revisar números impares
            }

            System.out.println(); // Salto de línea final
        }

        scan.close();
    }
}