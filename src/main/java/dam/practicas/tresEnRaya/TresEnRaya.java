package tresEnRaya;

import java.util.Scanner;

public class TresEnRaya {
    private Tablero tablero;
    private Jugador j1, j2;
    private Jugador jugadorActivo;

    public TresEnRaya(String nombre1, char ficha1, String nombre2, char ficha2) {
        this.tablero = new Tablero();
        this.j1 = new Jugador (nombre1, ficha1);
        this.j2 = new Jugador (nombre2, ficha2);
        this.jugadorActivo = j1;
    }

    public void inicio() {
        Scanner sc = new Scanner(System.in);
        boolean finPartida=false;

        while (!finPartida) {
            tablero.mostrar();
            System.out.println("\nTurno de " + jugadorActivo.getNombre() + " (" + jugadorActivo.getFicha()+")");

            boolean fichaColocada=false;
            while (!fichaColocada) {
                System.out.println("Elige una fila");
                int f = sc.nextInt()-1;
                System.out.println("Elige una columna");
                int c = sc.nextInt()-1;
                fichaColocada = tablero.colocarFicha(f, c, jugadorActivo.getFicha());
            }

            //Comprobar si hemos terminado (ganando o empatando)
            if (tablero.hayGanador()) {
                tablero.mostrar();
                System.out.println("Enhorabuena " + jugadorActivo.getNombre() + " has ganado");
                finPartida=true;
            } else if(tablero.hayEmpate()){
                tablero.mostrar();
                System.out.println("Empate!! No quedan movimientos");
                finPartida=true;
            }else {
                //Cambio de jugador
                cambiarTurno();
            }
        }

        sc.close();
    }

    private void cambiarTurno() {
        this.jugadorActivo = (jugadorActivo == j1) ? j2 : j1;
    }

}