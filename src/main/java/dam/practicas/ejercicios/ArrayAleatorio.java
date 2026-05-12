package dam.practicas.ejercicios;

import java.util.Scanner;

public class ArrayAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //un programa que defina un arrat llamado "arraynumero" de 10 posiciones y lo rellene con números aleatorios del 1 al 10
        int[] arraynumero = new int[10];
        for (int i = 0; i < arraynumero.length; i++) {
            arraynumero[i] = (int) (Math.random() * 10) + 1;
        }
        //Luego debe mostrar el contenido del array por pantalla
        System.out.println("Contenido del array:");
        for (int i = 0; i < arraynumero.length; i++) {
            System.out.print(arraynumero[i] + " ");


        }
    }
} 
