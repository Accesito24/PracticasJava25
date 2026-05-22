package dam.practicas.examen.Garcia_Brayan_ExamenPOO;

public class Profesor extends Personal {

    private String especialidad;

    public Profesor(String dni, String nombreCompleto, String especialidad) {
        super(dni, nombreCompleto);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy " + getNombreCompleto() + " con DNI: " + getDni() + " y mi especialidad es: " + especialidad);
    }
}