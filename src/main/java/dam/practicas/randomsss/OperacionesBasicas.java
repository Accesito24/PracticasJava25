package dam.practicas.randomsss;
import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Dame dos numero y te mostrare su suma, resta, multiplicacion y division: ");

        System.out.println("Numero 1: ");
        int num1 = sc.nextInt();

        System.out.println("Numero 2: ");
        int num2 = sc.nextInt();

        int SUMA = num1 + num2;
        int RESTA = num1 - num2;
        int MULTIPLICACION = num1 * num2;
        int DIVISION = num1 % num2;

        System.out.println("SUMA: " + num1 + " + " + num2 + " = " + SUMA);
        System.out.println("RESTA: " + num1 + " - " + num2 + " = " + RESTA);
        System.out.println("MULTIPLICACION: " + num1 + " X " + num2 + " = " + MULTIPLICACION);
        System.out.println("DIVISION: " + num1 + " % " + num2 + " = " + DIVISION);




    }
}
