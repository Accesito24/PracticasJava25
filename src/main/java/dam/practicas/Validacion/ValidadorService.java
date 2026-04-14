package dam.practicas.Validacion;

public class ValidadorService {
    private Validable[] ficheros;

    public ValidadorService(Validable[] ficheros) {
        this.ficheros = ficheros;
    }
    public boolean validarTodo() {
        for (Validable f : ficheros) {
            if (!f.isValid()) {
                return false; // Found an error, stop immediately
            }
        }
        return true; // All files passed validation
    }
   public static boolean validarFichero(Validable fichero) {
        // Adding a null check is always a good safety measure
        return fichero != null && fichero.isValid();
    }
}