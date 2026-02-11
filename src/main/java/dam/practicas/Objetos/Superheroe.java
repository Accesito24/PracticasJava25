package dam.practicas.Objetos;

public class Superheroe {

    // ATRIBUTOS
    private String nombre;
    private String superPoder;
    private boolean capa;

    public Superheroe(String nombre, String superPoder){
        this.nombre = nombre;
        this.superPoder = superPoder;
        this.capa = true;
    }

    public void describir(){
        // Condicional para mostrar si lleva o no capa
        if (capa){
            System.out.println("Soy " + nombre + ", mi poder es " + superPoder + " y lleva capa");
        } else {
            System.out.println("Soy " + nombre + ", mi poder es " + superPoder + " y no lleva capa");
        }
    }
}