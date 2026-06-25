package dam.practicas.examen.examen3;

public class Camion extends Vehiculo {

    private double tonelaje;

    public Camion(String matricula, double tonelaje) {
        super(matricula);
        this.tonelaje = tonelaje;
    }

    public double getTonelaje() {
        return tonelaje;
    }

    @Override
    public double calcularCosteTotal(double costeBase) {
        return costeBase + 50.00; // ecotasa vehículo pesado
    }
}
