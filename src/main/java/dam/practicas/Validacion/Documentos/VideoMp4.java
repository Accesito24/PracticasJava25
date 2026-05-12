package dam.practicas.Validacion.Documentos;

public class VideoMp4 extends Video {

    // Constant name following Java naming conventions (MAX_DURACION)
    private static final int DURACION_MAX = 300;

    public VideoMp4(int length) {
        super(length);
    }

    @Override
    public boolean isValid() {
        // Removed the semicolon from inside the if condition
        if (getLength() <= DURACION_MAX) {
            return true;
        } else {
            System.out.println("El tamaño es superior a lo permitido");
            return false;
        }
    }
} 
