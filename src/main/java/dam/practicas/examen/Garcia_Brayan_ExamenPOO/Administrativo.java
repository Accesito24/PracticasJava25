package dam.practicas.examen.Garcia_Brayan_ExamenPOO;


public class Administrativo extends Pas {

    private String puestoOficina;

    public Administrativo(String dni, String nombreCompleto, String zonaTrabajo, String puestoOficina) {
        super(dni, nombreCompleto, zonaTrabajo);
        this.puestoOficina = puestoOficina;
    }

    public String getPuestoOficina() {
        return puestoOficina;
    }

    @Override
    public void presentarse() {
        System.out.println("Me llamo " + getNombreCompleto() + " con DNI: " + getDni() + " y mi zona es: " + getZonaTrabajo() + ". del puesto: " + puestoOficina);
    }
}