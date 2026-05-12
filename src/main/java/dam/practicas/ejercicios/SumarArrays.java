import java.util.Scanner;

public class SumarArrays {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Programa que declare tres Arrays 'Array1', 'Array2' y 'Array3' de cinco enteros cada uno,
        // pida valores para 'Array1' y 'Array2' y calcule Array3=Array1+Array2.

        int[] Array1 = new int[5];
        int[] Array2 = new int[5];
        int[] Array3 = new int[5];

        // Pedir valores para Array1
        System.out.println("Introduce 5 números para el Array1:");
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = leer.nextInt();
        }

        // Pedir valores para Array2
        System.out.println("Introduce 5 números para el Array2:");
        for (int i = 0; i < Array2.length; i++) {
            Array2[i] = leer.nextInt();
        }

        // Calcular Array3 = Array1 + Array2
        for (int i = 0; i < Array3.length; i++) {
            Array3[i] = Array1[i] + Array2[i];
        }

        // Mostrar el resultado
        System.out.println("Array3 (resultado de la suma):");
        for (int i = 0; i < Array3.length; i++) {
            System.out.print(Array3[i] + " ");
        }

        leer.close();
    }
}


 
