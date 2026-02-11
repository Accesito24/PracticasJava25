package dam.practicas.Objetos;

public class AppEdificios {

    public static void main(String[] args) {
        Edificio torreCentral = new Edificio("Torre Central", 0, 10);
        Edificio parkingSub = new Edificio("Parking Subterraneo ", -3, 0);

        torreCentral.ordenarSubida(6);
        torreCentral.ordenarSubida(8);

        parkingSub.ordenarBajada(2);
        parkingSub.ordenarSubida(1);
        parkingSub.ordenarBajada(5);


    }
}
