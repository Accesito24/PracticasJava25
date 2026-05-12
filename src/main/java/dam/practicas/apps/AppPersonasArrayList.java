package dam.practicas.Apps;

import dam.practicas.ArrayList.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class AppPersonasArrayList {
    static Scanner sc = new Scanner(System.in);

    public static void agregarPersonas(ArrayList<Persona> pers) {
        String nombre;
        int edad;

        System.out.println("¿Cómo te llamas?");
        nombre = sc.nextLine();
        System.out.println("¿Qué edad tienes?");
        edad = sc.nextInt();
        sc.nextLine();

        Persona per = new Persona(nombre, edad);
        pers.add(per);
        System.out.println("Persona agregada correctamente.");
    }

    public static void eliminarPersonas(ArrayList<Persona> pers) {
        if (pers.isEmpty()) {
            System.out.println("No hay personas para eliminar.");
            return;
        }

        System.out.println("\n=== LISTA DE PERSONAS ===");
        for (int i = 0; i < pers.size(); i++) {
            System.out.println(i + ". " + pers.get(i));
        }

        System.out.print("\n¿Qué persona desea eliminar? (introduce el número): ");
        int numero = sc.nextInt();
        sc.nextLine();

        if (numero >= 0 && numero < pers.size()) {
            Persona eliminada = pers.remove(numero);
            System.out.println("Persona eliminada: " + eliminada);
        } else {
            System.out.println("Número inválido.");
        }
    }

    public static void mostrarTodasLasPersonas(ArrayList<Persona> pers) {
        if (pers.isEmpty()) {
            System.out.println("No hay personas registradas.");
            return;
        }

        System.out.println("\n=== TODAS LAS PERSONAS ===");
        for (Persona persona : pers) {
            System.out.println(persona);
        }
    }

    public static void mostrarMayoresDeEdad(ArrayList<Persona> pers) {
        System.out.println("\n=== PERSONAS MAYORES DE EDAD ===");
        boolean hayMayores = false;

        for (Persona persona : pers) {
            if (persona.getEdad() >= 18) {
                System.out.println(persona);
                hayMayores = true;
            }
        }

        if (!hayMayores) {
            System.out.println("No hay personas mayores de edad.");
        }
    }

    public static void main(String[] args) {
        // ArrayList con datos iniciales
        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Ana García", 25));
        personas.add(new Persona("Carlos López", 17));
        personas.add(new Persona("María Rodríguez", 30));
        personas.add(new Persona("Juan Martínez", 16));
        personas.add(new Persona("Laura Pérez", 22));

        int opcion;

        do {
            System.out.println("\n========== MENÚ ==========");
            System.out.println("1. Agregar persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Mostrar todas las personas");
            System.out.println("0. Salir");
            System.out.println("==========================");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarPersonas(personas);
                    break;
                case 2:
                    eliminarPersonas(personas);
                    break;
                case 3:
                    mostrarTodasLasPersonas(personas);
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println(" Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
} 
