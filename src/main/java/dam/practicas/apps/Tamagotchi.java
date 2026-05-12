package dam.practicas.Apps;

public class Tamagotchi {
    // ATRIBUTOS (variables de instancia - datos que tendrá cada objeto Tamagotchi)
    private String nombre;   // El nombre de la mascota
    private int hambre;      // Nivel de hambre (0-100)
    private int energia;     // Nivel de energía (0-100)

    // CONSTRUCTOR 1 (sobrecarga de constructores)
    // Este constructor solo recibe el nombre y establece valores por defecto
    public Tamagotchi(String nombre) {
        this.nombre = nombre;    // Asigna el nombre recibido
        this.hambre = 0;         // Inicia sin hambre
        this.energia = 100;      // Inicia con energía máxima
    }

    // CONSTRUCTOR 2 (sobrecarga de constructores)
    // Este constructor recibe todos los valores personalizados
    public Tamagotchi(String nombre, int hambre, int energia) {
        this.nombre = nombre;      // Asigna el nombre recibido
        this.hambre = hambre;      // Asigna el hambre recibido
        this.energia = energia;    // Asigna la energía recibida
    }

    // Metodo: Muestra el estado actual de la mascota
    public void status(){
        System.out.println("Tu mascota " + nombre + " tiene " + hambre + " de hambre y " + energia + " de energia");
    }

    // MÉTODO: La mascota saluda al usuario
    public void saludar(){
        System.out.println("Hola, soy " + nombre + "!");
    }

    // MÉTODO: La mascota se despide
    public void salir(){
        System.out.println("Adiós! " + nombre + " se despide.");
    }

    // MÉTODO: La mascota come (reduce su hambre en 10)
    public void comer(){
        if (hambre <= 10){
            // Si el hambre es menor o igual a 10, lo ponemos a 0
            this.hambre = 0;
        } else {
            // Si no, reducimos el hambre en 10 puntos
            this.hambre -= 10;
        }
        System.out.println(nombre + " ha comido. Hambre: " + hambre);
    }

    // MÉTODO: La mascota juega (aumenta hambre y reduce energía)
    public void jugar(){
        // Verifica si tiene suficiente energía para jugar (mínimo 20)
        if (this.energia >= 20) {
            // Aumenta el hambre cuando juega
            if (this.hambre < 85){
                this.hambre += 15;  // Aumenta hambre en 15
            } else {
                this.hambre = 100;  // Si ya está cerca del máximo, lo pone en 100
            }
            this.energia -= 20;  // Reduce la energía en 20 por jugar
            System.out.println(nombre + " ha jugado! Energia: " + energia + ", Hambre: " + hambre);
        } else {
            // No tiene suficiente energía para jugar
            System.out.println(nombre + " está muy cansado para jugar.");
        }
    }

    // MÉTODO: La mascota duerme (recupera toda su energía)
    public void dormir(){
        this.energia = 100;  // Restaura la energía al máximo
        System.out.println(nombre + " ha dormido. Energia: " + energia);
    }
} 
