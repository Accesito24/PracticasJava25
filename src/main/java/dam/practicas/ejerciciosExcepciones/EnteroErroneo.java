package dam.practicas.ejerciciosExcepciones;
import java.util.Scanner;
import java.util.InputMismatchException;

public class EnteroErroneo {

    static Scanner sc = new Scanner(System.in); // ← static

    public static int leerEntero() {
        int enteroLeido;
        while (true) {
            System.out.print("Introduce un número entero: ");
            try {
                enteroLeido = sc.nextInt();
                return enteroLeido;
            } catch (InputMismatchException e) {          // ← catch obligatorio
                System.out.println("ERROR: dato incorrecto. Usa un número entero.");
                sc.nextLine(); // ← limpia el buffer
            }
        }
    }

    public static void main(String[] args) {
        int entero = leerEntero();
        System.out.println(entero + " SÍ es un número entero.");
    }
}