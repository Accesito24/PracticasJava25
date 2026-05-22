package dam.practicas.ejercicios;

import java.util.Scanner;

public class ContarCaracter {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();

        System.out.println("Ingrese un caracter y te dire cuantas veces aparece:");
        String caracter = leer.nextLine();

        // Validar que solo sea un carácter
        if (caracter.length() != 1) {
            System.out.println("Error: Debes ingresar solo UN caracter");
        } else {
            char c = caracter.charAt(0);
            int contador = 0;

            // Contar apariciones del carácter en la frase
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == c) {
                    contador++;
                }
            }

            System.out.println("El caracter '" + c + "' aparece " + contador + " veces en la frase");
        }

        leer.close();
    }
}