package dam.practicas.examen.examen3;

public class Coche extends Vehiculo {

    private TipoCombustible combustible;

    public Coche(String matricula, TipoCombustible combustible) {
        super(matricula);
        this.combustible = combustible;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    @Override
    public double calcularCosteTotal(double costeBase) {
        switch (combustible) {
            case ELECTRICO:
                return costeBase * 1.20;
            case DIESEL:
                return costeBase + 15.00;
            case GASOLINA:
            default:
                return costeBase;
        }
    }
}
