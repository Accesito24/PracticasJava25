package dam.practicas.ejercicios;

public class Tamagotchi {
    private String nombre;
    private int hambre;
    private int energia;

    public Tamagotchi(String nombre) {
        this.nombre = nombre;
        this.hambre = 0;
        this.energia = 100;
    }

    public Tamagotchi(String nombre, int hambre, int energia) {
        this.nombre = nombre;
        this.hambre = hambre;
        this.energia = energia;
    }

    public void status(){
        System.out.println("Tu mascota " + nombre + " tiene " + hambre + " de hambre y " + energia + " de energia");
    }

    public void saludar(){
        System.out.println("Hola, soy " + nombre + "!");
    }

    public void salir(){
        System.out.println("Adiós! " + nombre + " se despide.");
    }

    public void comer(){
        if (hambre <= 10){
            this.hambre = 0;
        } else {
            this.hambre -= 10;
        }
        System.out.println(nombre + " ha comido. Hambre: " + hambre);
    }

    public void jugar(){
        if (this.energia >= 20) {
            if (this.hambre < 85){
                this.hambre += 15;
            } else {
                this.hambre = 100;  // ← FALTABA PUNTO Y COMA
            }
            this.energia -= 20;  // ← FALTABA REDUCIR LA ENERGÍA
            System.out.println(nombre + " ha jugado! Energia: " + energia + ", Hambre: " + hambre);
        } else {
            System.out.println(nombre + " está muy cansado para jugar.");
        }
    }  // ← FALTABA CERRAR EL MÉTODO

    public void dormir(){
        this.energia = 100;
        System.out.println(nombre + " ha dormido. Energia: " + energia);
    }
}