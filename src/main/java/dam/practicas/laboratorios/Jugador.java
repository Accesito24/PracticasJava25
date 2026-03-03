package dam.practicas.laboratorios;

public class jugador {

    private static int numeroJugadores = 0;
    private static int puntuacionMaxima = 0;

    private String nombre;
    private int puntuacionActual;
    private String id;

    public Jugador(String nombre, int puntuacionActual) {
        numeroJugadores++;
        this.id = String.format("J%03d", numeroJugadores);
        this.nombre = nombre;
        this.puntuacionActual = puntuacionActual;
        if (this.puntuacionActual > puntuacionMaxima) {
            puntuacionMaxima = this.puntuacionActual;
        }
    }

    // Getters de instancia
    public String getNombre() {
        return nombre;
    }

    public int getPuntuacionActual() {
        return puntuacionActual;
    }

    public String getId() {
        return id;
    }

    // Setters de instancia
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntuacionActual(int puntuacionActual) {
        this.puntuacionActual = puntuacionActual;
        if (this.puntuacionActual > puntuacionMaxima) {
            puntuacionMaxima = this.puntuacionActual;
        }
    }

    // Getters estáticos
    public static int getNumeroJugadores() {
        return numeroJugadores;
    }

    public static int getPuntuacionMaxima() {
        return puntuacionMaxima;
    }

    // Métodos estáticos
    public static void mostrarResumen() {
        System.out.println("Hay " + numeroJugadores + " jugadores");
        System.out.println("Puntuación máxima: " + puntuacionMaxima);
    }

    // toString para mostrar info del jugador
    @Override
    public String toString() {
        return "Jugador [id=" + id +
                ", nombre=" + nombre +
                ", puntuacionActual=" + puntuacionActual + "]";
    }
}
