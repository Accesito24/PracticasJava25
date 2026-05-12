package dam.practicas.ejercicios;

import java.util.Scanner;

public class SiONo {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Dime dos numeros, con ellos te hare una multiplicacion, resta y suma");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
        System.out.println("La resultado de la multiplicacion es: ");


    }

} 
