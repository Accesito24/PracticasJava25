package dam.practicas.examen.examen3;

public class ElementoNoEncontradoException extends Exception {

    public ElementoNoEncontradoException(String identificador) {
        super("No hay historial registrado para el elemento: " + identificador);
    }
}
