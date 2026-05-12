package dam.practicas.Validacion.Documentos;

public  abstract class Documento implements Validable {

    private long size;

    public Documento(long size) {
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

}
 
