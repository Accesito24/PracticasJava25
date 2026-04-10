package dam.practicas.Validacion;

public class DocumentoPDF extends Documento{

    public DocumentoPDF (long size){
        super (size);
    }

    @Override
    public boolean isValid() {
        return getSize() < 1048576;
    }

    @Override
    public String obtenerErrores() {
        return "Tamaño Invalido";
    }
}