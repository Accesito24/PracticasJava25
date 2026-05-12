package dam.practicas.examen.Garcia_Brayan_ExamenPOO;

import java.util.ArrayList;
import java.util.List;

public class Aula {

    private String nombre;
    private int capacidadMaxima;
    private List<Alumno> alumnos;

    public Aula(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public boolean añadirAlumno(Alumno alumno) {
        if (alumnos.size() >= capacidadMaxima) {
            System.out.println("ERROR: El aula " + nombre + " esta llena. No se puede añadir a " + alumno.getNombreCompleto());
            return false;
        }
        alumnos.add(alumno);
        return true;
    }
} 
