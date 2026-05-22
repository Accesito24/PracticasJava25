package dam.practicas.pooEjercicios.abstraccion;

public class PlanFamiliar extends Suscripcion {
    private static final int PERFILES_PERMITIDOS = 5;

    public PlanFamiliar(String nombreUsuario, double precioBase) {
        super(nombreUsuario, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase + precioBase * 0.40;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Usuario:" + nombreUsuario + "\n" + "Perfiles permitidos: " + PERFILES_PERMITIDOS + "\n" + "Precio final: " + calcularPrecioFinal() + "\n");

    }
}

