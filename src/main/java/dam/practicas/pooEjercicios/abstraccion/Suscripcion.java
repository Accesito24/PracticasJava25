package dam.practicas.pooEjercicios.abstraccion;

public abstract class Suscripcion {
    protected String nombreUsuario;
    protected double precioBase;

    public abstract double calcularPrecioFinal();
    public abstract void mostrarDetalle();

    public Suscripcion (String nombreUsuario, double precioBase){
        this.nombreUsuario = nombreUsuario;
        this.precioBase = precioBase;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public double getPrecioBase() {
        return precioBase;
    }


}
 
