package dam.practicas.practicaBorrable.practicaBorrable2;

public class Animal {
    int edad;
    String nombre;
    String sonido;


    public Animal(int edad, String nombre, String sonido) {
        this.edad = edad;
        this.nombre = nombre;
        this.sonido = sonido;

    }
    public void emitir (){
        System.out.println("Tengo " + edad + " años y mi nombre es " + nombre + "y hago " + sonido);


    }
}
