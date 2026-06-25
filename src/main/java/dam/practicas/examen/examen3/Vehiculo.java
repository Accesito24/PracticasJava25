package dam.practicas.examen.examen3;

public abstract class Vehiculo implements ElementoTaller {

    private String matricula;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getIdentificador() {
        return matricula;
    }
}
