package dam.practicas.EnCasa.POO1;

public class Persona {
    String nombre;
    int edad;

// CONSTRUCTOR
    //El constructor toma los atributos de clase principal
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

// METODO
    public void saludar () {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad);
    }

}
