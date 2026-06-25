package dam.practicas.examen.examen3;

public class Dispositivo implements ElementoTaller {

    private String numeroSerie;

    public Dispositivo(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String getIdentificador() {
        return numeroSerie;
    }

    @Override
    public double calcularCosteTotal(double costeBase) {
        return costeBase + 10.00; // tasa de reciclaje tecnológico
    }
}
