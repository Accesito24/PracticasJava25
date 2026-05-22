package dam.practicas.ejercicios;

import java.util.Scanner;

public class SumarArray {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};
        int suma = 0;

        for(int i = 0; i < arr.length; i++) {
            suma += arr[i];
            System.out.println("Suma parcial después de añadir el elemento en el índice " + i + " (" + arr[i] + "): " + suma);
        }

        // Mostrar la suma total al final
        System.out.println("Suma total: " + suma);

        leer.close(); // Cerrar el Scanner FUERA del bucle
    }
}