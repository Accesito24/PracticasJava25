package dam.practicas.Validacion.Documentos;

public abstract class Video implements Validable {
    int length;

    public Video(int length) {
        this.length = length;
    }

    public int getLength() { return length; }

    public void setLength(int length) { this.length = length; }

}
