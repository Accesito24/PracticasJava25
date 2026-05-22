package dam.practicas.ejercicios;

import java.util.Scanner;

public class PalabraVertical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la palabra al usuario
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();

        // Mostrar la palabra en vertical
        System.out.println("\nPalabra en vertical:");
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }

        scanner.close();
    }
}