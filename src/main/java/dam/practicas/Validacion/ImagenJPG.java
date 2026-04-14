package dam.practicas.Validacion;

public class ImagenJPG extends Imagen {

    public ImagenJPG(int width, int height) {
        super(width, height);
    }

    @Override
    public boolean isValid() {
        long resolucion = (long) getWidth() * getHeight();
        if ( resolucion < 5000000) {
            return true;
        }
        return false;

        }
    }


