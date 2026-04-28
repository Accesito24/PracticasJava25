package dam.practicas.EnCasa.POO1;

public class Coche {
    String marca;
    String modelo;
    int velocidad = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }
    public void acelerar(){
        velocidad += 10;
        System.out.println("Acelerando...   velocidad: " + velocidad);

    }
    public void frenar(){
        velocidad -= 10;
        System.out.println("Frenando...  velocidad: " + velocidad);

    }

    public void mostrarInfo (){
        System.out.println("Coche: " + marca + modelo + velocidad);
    }


}
