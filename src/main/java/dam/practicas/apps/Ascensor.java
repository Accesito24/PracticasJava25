package dam.practicas.Apps;

public class Ascensor {


    private int pisoActual;



    public Ascensor() {

        this.pisoActual = 0;

    }


    public void subir(int n) {


       this.pisoActual += n;

        System.out.println("Subiendo " + n + " plantas...");

        System.out.println("Posición actual en planta " + this.pisoActual);

    }


    public void bajar(int n) {

        this.pisoActual -= n;

        System.out.println("Bajando " + n + " plantas...");

        System.out.println("Posición actual en planta " + this.pisoActual);

    }


    public int getPisoActual() {

        return this.pisoActual;

    }

}