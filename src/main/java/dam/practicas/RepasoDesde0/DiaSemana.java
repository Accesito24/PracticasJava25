package dam.practicas.randomsss;
import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7 y le dire el dia de la semana donde Lunes es 1 y Domingo es 7");
        int opcion = sc.nextInt();

        switch (opcion){
          case 1 -> System.out.println("Lunes");
          case 2 -> System.out.println("Martes");
          case 3 -> System.out.println("Miercoles");
          case 4 -> System.out.println("Jueves");
          case 5 -> System.out.println("Viernes");
          case 6 -> System.out.println("Sabado");
          case 7 -> System.out.println("Domingo");
          default -> System.out.println("Dia no valido");
        }
        sc.close();
    }
}
