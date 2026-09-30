package dam.practicas.randomsss;
import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese un año y le digo si es bisiesto o no");
            System.out.println("año: " + i);
            int año = sc.nextInt();


            if (año % 4 == 0) {
                if (año % 100 == 0) {
                    if (año % 400 == 0) {
                        System.out.println("===Es bisiesto===");
                        System.out.println("");
                    } else {
                        System.out.println("===No es bisiesto===");
                        System.out.println("");
                    }
                } else {
                    System.out.println("===Es bisiesto===");
                    System.out.println("");
                }

            } else {
                System.out.println("===No es bisiesto===");
                System.out.println("");
            }
        }
        sc.close();
    }
}

