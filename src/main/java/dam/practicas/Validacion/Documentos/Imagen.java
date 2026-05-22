package dam.practicas.Validacion.Documentos;

public abstract class Imagen implements Validable {

    private int width;
    private int height;

    public Imagen(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }
}