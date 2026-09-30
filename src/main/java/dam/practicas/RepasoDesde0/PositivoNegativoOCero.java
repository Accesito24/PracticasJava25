package dam.practicas.randomsss;
import java.util.Scanner;

public class PositivoNegativoOCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y te dire si es positivo, negativo o cero: ");
        int num1 = sc.nextInt();

        if (num1 < 0){
            System.out.println("El numero es negativo");
        } else if (num1 > 0){
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es 0");
        }
    }
}
