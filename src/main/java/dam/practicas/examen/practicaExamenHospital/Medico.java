package dam.practicas.examen.practicaExamenHospital;

public class Medico extends Persona implements Calculable {
    private String especialidad;
    private double sueldoBase;

    public Medico(String dni, String nombreCompleto, String especialidad, double sueldoBase) {
        super(dni, nombreCompleto);
        this.especialidad = especialidad;
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String presentarse() {
        return "Médico: " + getNombreCompleto() + " - Especialidad: " + especialidad;
    }

    @Override
    public double calcularSueldoFinal() {
        if (especialidad.equalsIgnoreCase("Urgencias")) {
            return sueldoBase + 500;
        }
        return sueldoBase;
    }
}

