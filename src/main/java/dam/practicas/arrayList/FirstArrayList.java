import java.util.ArrayList;  // ← También falta este import

public class FirstArrayList {

    public static void main(String[] args) {

        ArrayList<String> nombres;

        nombres = new ArrayList<>();

        nombres.add("isa");
        nombres.add("jhoshua");
        nombres.add("violeta");
        nombres.add("unai");
        nombres.add("sito");

        for(int i = 0; i < nombres.size(); i++)  // Sin punto y coma
            System.out.println(nombres.get(i));

        for(String nombre : nombres)
            System.out.println(nombre);
    }
}
 
