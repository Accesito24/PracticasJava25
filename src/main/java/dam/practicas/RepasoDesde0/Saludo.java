package dam.practicas.randomsss;
import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("Ingrese su Nombre: ");
        String nombre = sc.next();

        System.out.println("Bienvenido/a " + nombre + " su edad es: " + edad);





    }
}