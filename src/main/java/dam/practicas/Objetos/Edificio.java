package dam.practicas.Objetos;

public class Edificio {


    private String nombre;

    private int pisoMinimo;

    private int pisoMaximo;


    private Ascensor ascensorPrincipal;


    public Edificio(String nombre, int min, int max) {

        this.nombre = nombre;

        this.pisoMinimo = min;

        this.pisoMaximo = max;


        this.ascensorPrincipal = new Ascensor();

    }


    public void ordenarSubida(int cuantosPisos) {

        System.out.println("\n[SISTEMA " + nombre + "]: Petición de subir " + cuantosPisos + " pisos.");


        int destinoFinal = ascensorPrincipal.getPisoActual() + cuantosPisos;


        if (destinoFinal <= pisoMaximo) {

// DELEGACIÓN: Si es seguro, el edificio le da la orden al objeto ascensor

            ascensorPrincipal.subir(cuantosPisos);

        } else {

            System.out.println("ERROR SEGURIDAD: El piso " + destinoFinal + " excede el límite de la " + nombre);

        }

    }


    public void ordenarBajada(int cuantosPisos) {

        System.out.println("\n[SISTEMA " + nombre + "]: Petición de bajar " + cuantosPisos + " pisos.");


        int destinoFinal = ascensorPrincipal.getPisoActual() - cuantosPisos;


        if (destinoFinal >= pisoMinimo) {

            ascensorPrincipal.bajar(cuantosPisos);

        } else {

            System.out.println("ERROR SEGURIDAD: El piso " + destinoFinal + " está por debajo del sótano.");

        }

    }

}