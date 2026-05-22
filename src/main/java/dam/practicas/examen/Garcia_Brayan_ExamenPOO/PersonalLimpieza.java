package dam.practicas.examen.Garcia_Brayan_ExamenPOO;

public class PersonalLimpieza extends Pas {

    private String turno;

    public PersonalLimpieza(String dni, String nombreCompleto, String zonaTrabajo, String turno) {
        super(dni, nombreCompleto, zonaTrabajo);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy " + getNombreCompleto() + " con DNI: " + getDni() + " y mi zona es: " + getZonaTrabajo() + ". con turno: " + turno);
    }
}
