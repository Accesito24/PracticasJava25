package dam.practicas.Apps;

public class Lampara {
    String color;
    String marca;
    boolean estaEncendida;

    public Lampara(String color, String marca) {
        this.color = color;
        this.marca = marca;
        this.estaEncendida = false;
    }

    public void estado() {
        System.out.println("aqui tenemos una lampara " + marca + " de color " + color);
        if (estaEncendida) {
            System.out.println(" y esta encendida");
        } else {
            System.out.println(" y esta apagada");
        }
    }
    public void encender() {
        this.estaEncendida = true;
    }

    public void apagar() {
        this.estaEncendida = false;
    }
}