package dam.practicas.ejerciciosExcepciones;
import java.util.Scanner;

public class ErrorAritmetico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número 1: ");
        int a = sc.nextInt();
        System.out.print("Introduce el número 2: ");
        int b = sc.nextInt();

        try {
            int resultado = a / b;  // ← aquí puede lanzarse ArithmeticException
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("ERROR: No se puede dividir entre cero.");
        }

        sc.close();
    }
} 
