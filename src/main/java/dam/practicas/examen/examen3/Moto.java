package dam.practicas.examen.examen3;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String matricula, int cilindrada) {
        super(matricula);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public double calcularCosteTotal(double costeBase) {
        return costeBase * 0.90; // descuento 10%
    }
}
