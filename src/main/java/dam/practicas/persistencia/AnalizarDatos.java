package dam.practicas.persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnalizarDatos {
    public static void main(String[] args) {
        File archivo = new File("datos.txt");

        Scanner sc = null;
        int sumaTotal = 0;
        int errores = 0;

        try {

            sc = new Scanner(archivo);

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                try {
                    int numero = Integer.parseInt(linea);
                    sumaTotal += numero;
                } catch (NumberFormatException e) {
                    errores++;
                }
            }
            System.out.println("La suma total es: " + sumaTotal);
            System.out.println("Lineas corruptas ignoradas: " + errores);
        } catch (FileNotFoundException e){
            System.out.println("Error: No se encuentra el archivo datos.txt");
        } finally {
            if (sc != null){
                sc.close();
            }
        }
    }

}

