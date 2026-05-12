package dam.practicas.ejercicios;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de terminos de la serie Fibonacci que desea ver: ");
        int terminos = leer.nextInt();
        int antepenultimo = 0;
        int penultimo = 1;
        int actual;

        System.out.println("El termino numero 1 es: 0 \n El termino numero 2 es 1");

        for (int i = 3; i <= terminos; i++) {
            actual = antepenultimo + penultimo;
            System.out.println("El termino numero " + i + " es: " + actual);

            antepenultimo = penultimo;
            penultimo = actual;

        }
    }
} 
