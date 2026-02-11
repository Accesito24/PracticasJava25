package dam.practicas.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AppGestionMatriculas {
    public static void mostrarEstudiantes (ArrayList<Estudiante> estus){
        for (Estudiante e : estus) {
            System.out.println(e.getNumeMatricula() + "-" + e.getNombre());

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Materia> materias = new ArrayList<>();
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        int opcion;

        do{

            System.out.println("\n¿Qué deseas hacer?");
            System.out.println("1-Añadir una matrícula");
            System.out.println("2-Listar las matrículas");
            System.out.println("3-Matricular a un estudiante");
            System.out.println("4-Listar las materias");
            System.out.println("5-Listar los estudiantes");
            System.out.println("6-Ver reporte total de estudiantes");
            System.out.println("0-Salir");

            System.out.print("¿Qué eliges?: ");
            respuesta = sc();




        }
    }


public static void añadirMatricula (ArrayList<Persona> pers) {


}
}
