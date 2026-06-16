package dam.practicas.examen.practicaExamenHospital;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Hospital {
    private String nombre;
    private ArrayList<Consulta> consultas;
    private ArrayList<Persona> personal; // Guarda médicos y enfermeros

    public Hospital(String nombre) {
        this.nombre = nombre;
        this.consultas = new ArrayList<>();
        this.personal = new ArrayList<>();
    }

    public void agregarConsulta(Consulta c) { consultas.add(c); }
    public void agregarPersonal(Persona p) { personal.add(p); }

    // 3.2 - Buscador de Pacientes de Riesgo
    public void mostrarPacienteMasMayor() {
        Paciente masMayor = null;
        Consulta consultaDelPaciente = null;

        for (Consulta c : consultas) {
            for (Paciente p : c.getListaPacientes()) {
                if (masMayor == null || p.getEdad() > masMayor.getEdad()) {
                    masMayor = p;
                    consultaDelPaciente = c;
                }
            }
        }

        if (masMayor != null) {
            System.out.println("\n--- PACIENTE DE RIESGO ---");
            System.out.println("Nombre: " + masMayor.getNombreCompleto() + " (" + masMayor.getEdad() + " años) en la " + consultaDelPaciente.getNomCons());
        } else {
            System.out.println("No hay pacientes en el hospital.");
        }
    }

    // 3.3 - Estadísticas de Nóminas (Uso de Interfaz y Polimorfismo)
    public double calcularTotalNominas() {
        double total = 0;
        for (Persona p : personal) {
            if (p instanceof Calculable) {
                total += ((Calculable) p).calcularSueldoFinal();
            }
        }
        return total;
    }

    // 3.4 - Exportación de Datos a Fichero
    public void exportarPacientes() {
        String nombreFichero = "informe_hospital.txt";

        // Try-with-resources: se encarga de cerrar el fichero automáticamente
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero))) {
            bw.write("=== INFORME DE PACIENTES POR CONSULTA ===");
            bw.newLine();

            for (Consulta c : consultas) {
                bw.newLine();
                bw.write("Consulta: " + c.getNomCons());
                bw.newLine();
                bw.write("---------------------------------------");
                bw.newLine();

                if (c.getListaPacientes().isEmpty()) {
                    bw.write("   (Sin pacientes en espera)");
                    bw.newLine();
                } else {
                    for (Paciente p : c.getListaPacientes()) {
                        bw.write("   - " + p.getNombreCompleto() + " | Edad: " + p.getEdad());
                        bw.newLine();
                    }
                }
            }
            System.out.println("\nFichero '" + nombreFichero + "' exportado con éxito.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }
}
