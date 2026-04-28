package dam.practicas.examen.examen1;

import java.util.Scanner;

public class NumerosPerfectos {

    public static boolean esNumeroPerfecto(int numero) {
        if (numero <=1) return false;

        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        return suma == numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una serie de números separados por comas (ej: 6, 28, 12, 496):");

        String entrada = scanner.nextLine();
        String[] numerosComoTexto = entrada.split(",");

        System.out.println("\n--- Analizando los números ---");

        for (String texto : numerosComoTexto) {
            String textoLimpio = texto.trim();
            try {
                int numero = Integer.parseInt(textoLimpio);

                boolean esPerfecto = esNumeroPerfecto(numero);

                if (esPerfecto) {
                    System.out.println("El número " + numero + " SÍ es un número perfecto.");
                } else {
                    System.out.println("El número " + numero + " NO es un número perfecto.");
                }

            } catch (NumberFormatException e) {
                System.err.println("'" + textoLimpio + "' no es un número válido y ha sido ignorado.");
            }
        }

        scanner.close();
        System.out.println("\n--- Análisis completado ---");
    }

}