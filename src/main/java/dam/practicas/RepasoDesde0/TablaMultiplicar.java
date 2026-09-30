package dam.practicas.randomsss;
import  java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingre un numero del 1 al 10 y le mostrare su tabla de multiplicar");
        int numero = sc.nextInt();


        for(int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

        }

        sc.close();

    }
}
