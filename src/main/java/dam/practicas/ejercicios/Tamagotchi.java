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
        System.out.println(" Tu mascota 2 " + nombre + " tiene " + hambre + " de hambre y " + energia + " de energia");
    }

    public void comer(){
        if (hambre <= 10){
            this.hambre = 0;
        }else {
            this.hambre -= 10;
        }

    }
    public void jugar(){
        if (this.energia >= 20) {
            if (this.hambre < 85){
                this.hambre += 15;
            } else {
                this.hambre = 100
            }


    }
    public void dormir(){
        this.energia = 100;

    }


}
