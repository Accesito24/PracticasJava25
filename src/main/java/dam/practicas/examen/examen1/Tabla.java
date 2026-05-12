package dam.practicas.examen.examen1;

import java.util.Scanner;

public class Tabla {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de filas y columnas: : ");
        int FC = sc.nextInt();



        for (int f = 1; f <= FC; f++) {
            for (int c = 1; c <= FC; c++) {

                if (f == c) {
                    System.out.print("X\t");
                } else if (f > c) {
                    System.out.print((f + c) + "\t");
                } else if (f < c) {
                    System.out.print((f - c) + "\t");
                }


            }
            System.out.println();

        }
        sc.close();
    }
} 
