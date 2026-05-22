package dam.practicas.persistencia;

import java.io.*;
import java.util.Scanner;

public class ConversorPrecios {
    public static final double IVA = 1.21;
    public static void main(String[] args) {

        File leer = new File("precios.txt");
        // Scanner lector = null;
        File escribir = new File("factura.txt");

        try{
            Scanner sc = new Scanner(leer);
            PrintWriter escrib = new PrintWriter(new FileWriter(escribir));
                while(sc.hasNextLine()){
                    double precio = sc.nextDouble();
                    double precioConIva = precio * IVA;
                    escrib.println(precioConIva);
                }
        } catch (IOException e) {
            System.out.println("Error: No se encuentra el archivo precios.txt");

        }finally {

        }
    }
}

