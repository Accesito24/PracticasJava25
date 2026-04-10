package dam.practicas.Validacion;

public class ImagenJPG extends Imagen {
    int ancho;
    int alto;
    boolean valido;

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public String obtenerErrores() {
        return "";
    }
}
