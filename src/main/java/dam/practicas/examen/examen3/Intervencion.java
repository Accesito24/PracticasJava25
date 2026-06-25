package dam.practicas.examen.examen3;

public class Intervencion {

    private ElementoTaller elemento;
    private String descripcion;
    private double horas;
    private double costesMateriales;

    public Intervencion(ElementoTaller elemento, String descripcion,
                        double horas, double costesMateriales) {
        this.elemento = elemento;
        this.descripcion = descripcion;
        this.horas = horas;
        this.costesMateriales = costesMateriales;
    }

    public ElementoTaller getElemento() {
        return elemento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getHoras() {
        return horas;
    }

    public double getCostesMateriales() {
        return costesMateriales;
    }

    // Calcula el coste final delegando en el propio elemento (polimorfismo)
    public double calcularCoste(double precioPorHora) {
        double costeBase = (horas * precioPorHora) + costesMateriales;
        return elemento.calcularCosteTotal(costeBase);
    }
}
