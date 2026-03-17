package dam.practicas.pooEjercicios.abstraccion;

public class PlanEstudiante extends Suscripcion {
    private static final int PERFILES_PERMITIDOS = 1;

    private String universidad = "Cundinamarca";

    public String getUniversidad() {
        return universidad;
    }

    public PlanEstudiante(String nombreUsuario, double precioBase, String universidad) {
        super(nombreUsuario, precioBase);
        this.universidad = universidad;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase - precioBase * 0.50;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Usuario:" + nombreUsuario + "\n" + "Perfiles permitidos: " + PERFILES_PERMITIDOS + "\n" + "Precio final: " + calcularPrecioFinal() + "\n" + "Nombre de Universidad: " + getUniversidad() + "\n" );

    }
}
