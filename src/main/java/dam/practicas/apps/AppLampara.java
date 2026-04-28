package dam.practicas.Apps;

public class AppLampara {
    public static void main(String[] args) {


        Lampara lamparaPhilips = new Lampara("Rojo", "Philips");
        Lampara lamparaIkea = new Lampara("Blanco", "IKEA");


        lamparaPhilips.estado();
        lamparaIkea.estado();

    }
}