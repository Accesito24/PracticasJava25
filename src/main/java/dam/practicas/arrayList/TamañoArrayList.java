package dam.practicas.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TamañoArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("introduce numeros (escribe -1 para terminar)");

        int numero = sc.nextInt();

        while (numero != -1){
            lista.add(numero);
            numero = sc.nextInt();
        }

        System.out.println();



    }
}
 
