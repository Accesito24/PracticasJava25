package dam.practicas.pooEjercicios.abstraccion;

public class PlanEstandar extends Suscripcion {
    private static final int PERFILES_PERMITIDOS = 1;

    public PlanEstandar(String nombreUsuario, double precioBase) {
        super(nombreUsuario, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase();
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Usuario:" + nombreUsuario + "\n" + "Perfiles permitidos: " + PERFILES_PERMITIDOS + "\n" + "Precio final: " + precioBase + "\n" );

    }
}
