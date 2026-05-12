package dam.practicas.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BuscarContarArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();


        numeros.add(6);
        numeros.add(7);
        numeros.add(20);
        numeros.add(3);
        numeros.add(80);


        // econtrar el menor y mayor
        int mayor = numeros.get(0);
        int menor = numeros.get(0);
        int suma = 0;

        for(int n : numeros) {
            suma += n;
            if (n < menor){
                menor = n;
                continue;

            }
            if (n > mayor){
                mayor = n;

            }
            System.out.println("El mayor es : " + mayor + " y el menor es  " + menor );
            //encontrar el mayor y menor con Collections
            System.out.println("Segun Collections, el maximo es " + Collections.max(numeros) + " y el minimo " + Collections.min(numeros));

            //sumarlos
            System.out.println("Y la suma de todos ellos es: " + suma);

        }



    }
}
 
