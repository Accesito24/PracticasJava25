package dam.practicas.examen.practicaExamenHospital;

public class Enfermero extends Persona implements Calculable {
    private String planta;
    private int guardias;

    public Enfermero(String dni, String nombreCompleto, String planta, int guardias) {
        super(dni, nombreCompleto);
        this.planta = planta;
        this.guardias = guardias;
    }

    @Override
    public String presentarse() {
        return "Enfermero: " + getNombreCompleto() + " - Planta: " + planta;
    }

    @Override
    public double calcularSueldoFinal() {
        return 1400 + (guardias * 60);
    }
}