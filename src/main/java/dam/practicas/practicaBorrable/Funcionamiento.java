package dam.practicas.practicaBorrable;

import java.util.ArrayList;

public class Funcionamiento {
    static void main(String[] args) {


        Materiales l1 = new Materiales("001", "El Quijote", "Cervantez", 5);
        Materiales l2 = new Materiales("002", "El Quijote2", "Cervantez2", 6);
        Materiales l3 = new Materiales("003", "El Quijote3", "Cervantez3", 23);
        Materiales l4 = new Materiales("004", "El Quijote4", "Cervantez4", 4);
        Materiales l5 = new Materiales("005", "El Quijote5", "Cervantez5", 55);
        Materiales l6 = new Materiales("006", "El Quijote6", "Cervantez6", 8);


        ArrayList<Materiales> lista = new ArrayList<>();
        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(l4);
        lista.add(l5);
        lista.add(l6);

        l1.pestar();
        l1.pestar();
        l1.devolver();



    }
} 
