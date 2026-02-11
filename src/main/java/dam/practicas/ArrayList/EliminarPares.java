package dam.practicas.ArrayList;
import java.util.ArrayList;

public class EliminarPares {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);


        for (int i = 0; i < numeros.size(); i++) {
            int numActual = numeros.get(i);

            if (numActual % 2 == 0) {
                System.out.println(numActual + " es un número par.");
            } else {
                System.out.println(numActual + " es un número impar.");
            }
        }


        }


    }

