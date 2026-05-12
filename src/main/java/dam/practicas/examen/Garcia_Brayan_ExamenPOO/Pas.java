package dam.practicas.examen.Garcia_Brayan_ExamenPOO;

public abstract class Pas extends Personal {

    private String zonaTrabajo;

    public Pas(String dni, String nombreCompleto, String zonaTrabajo) {
        super(dni, nombreCompleto);
        this.zonaTrabajo = zonaTrabajo;
    }

    public String getZonaTrabajo() {
        return zonaTrabajo;
    }
}
 
