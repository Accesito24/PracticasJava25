package dam.practicas.examen.Garcia_Brayan_ExamenPOO;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private String nombre;
    private List<Aula> aulas;
    private List<Personal> personalCentro;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.aulas = new ArrayList<>();
        this.personalCentro = new ArrayList<>();
    }

    public void añadirAula(Aula aula) {
        aulas.add(aula);
    }

    public void añadirPersonal(Personal p) {
        personalCentro.add(p);
    }

    public void matricularAlumno(Alumno alumno, Aula aula) {
        aula.añadirAlumno(alumno);
    }

    public void mostrarAlumnoExcelente() {
        Alumno mejor = null;
        Aula aulaMejor = null;
        for (Aula aula : aulas) {
            for (Alumno alumno : aula.getAlumnos()) {
                if (mejor == null || alumno.getNotaMedia() > mejor.getNotaMedia()) {
                    mejor = alumno;
                    aulaMejor = aula;
                }
            }
        }
        System.out.println("Mejor alumno: " + mejor.getNombreCompleto() + " con " + mejor.getNotaMedia() + " en " + aulaMejor.getNombre());
    }

    public void mostrarAprobados(double notaMinima) {
        System.out.println("Alumnos aprobados:");
        for (Aula aula : aulas) {
            for (Alumno alumno : aula.getAlumnos()) {
                if (alumno.getNotaMedia() >= notaMinima) {
                    System.out.println("  " + alumno.getNombreCompleto() + " (" + alumno.getNotaMedia() + ")");
                }
            }
        }
    }
} 
