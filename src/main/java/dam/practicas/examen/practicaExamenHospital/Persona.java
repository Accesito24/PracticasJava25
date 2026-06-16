package dam.practicas.examen.practicaExamenHospital;

public abstract class Persona {
    private String dni;
    private String nombreCompleto;

    public Persona(String dni, String nombreCompleto) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() { return dni; }
    public String getNombreCompleto() { return nombreCompleto; }

    // Método polimórfico abstracto
    public abstract String presentarse();
}
