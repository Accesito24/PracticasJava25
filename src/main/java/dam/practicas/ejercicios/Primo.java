package dam.practicas.ejercicios;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean esPrimo;

        System.out.println("Dime un número (positivo) y te digo si es o no primo:");
        int num = scan.nextInt();

        esPrimo = true;

        if (num > 2) {
            if (num % 2 == 0) {
                esPrimo = false;
            } else {

                for (int i = 3; i <= (num / 2); i += 2) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
        }


        if (esPrimo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número NO es primo");
        }


    }
} 
