package dam.practicas.persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AlmacenPrimos {

    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        FileWriter fichero = null;
        PrintWriter escritor = null;
        Scanner sc = new Scanner(System.in);

        try {
            fichero = new FileWriter("primos.txt", true);
            escritor = new PrintWriter(fichero);

            while (true) {
                System.out.println("Dame un número entero positivo y vemos si es primo, o uno negativo y salimos");
                try {
                    int num = sc.nextInt();
                    if (num > 0) {
                        if (esPrimo(num)) {
                            escritor.println(num);
                            escritor.flush();
                            System.out.println(num + " es primo, guardado.");
                        } else {
                            System.out.println(num + " no es primo, descartado.");
                        }
                    } else {
                        System.out.println("Hasta la próxima");
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: introduce un número entero, no texto.");
                    sc.nextLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        } finally {
            if (escritor != null) escritor.close();
        }

        sc.close();
    }
}