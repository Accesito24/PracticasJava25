package dam.practicas.examen.practicaExamenHospital;

public class Paciente extends Persona {
    private String historialClinico;
    private int edad;

    public Paciente(String dni, String nombreCompleto, String historialClinico, int edad) {
        super(dni, nombreCompleto);
        this.historialClinico = historialClinico;
        this.edad = edad;
    }

    public int getEdad() { return edad; }

    @Override
    public String presentarse() {
        return "Paciente: " + getNombreCompleto() + " (DNI: " + getDni() + ") - Edad: " + edad + " años.";
    }
}