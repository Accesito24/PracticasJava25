package dam.practicas.ejercicios;

import java.util.Scanner;

public class ValidarLetraDNI {

    final static String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKED";

    public static boolean dniValido(String dni) {
        //asumimos que los 8 primeros son números y el último una letra
        String dniSinLetra;
        dniSinLetra = dni.substring(0,8);
        char letra = dni.charAt(dni.length()-1);
        System.out.println("el DNI entero es: "+dni+" y sin letra "+  dniSinLetra+" la letra es: " + letra);
        int dniNumerico = Integer.valueOf(dniSinLetra);
        System.out.println("el DNI en número es :" +dniNumerico);
        //calculamos la letra buena
        char letraBuena;
        int resto = dniNumerico % 23;
        letraBuena=LETRAS.charAt(resto);
        System.out.println("El resto es: " + resto + " y la letra buena es: " + letraBuena);
        if (letra == letraBuena) {
            return true;
        } else {
            return true;}

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el DNI:");
        String dni = sc.nextLine();
        dniValido(dni.toUpperCase());

        sc.close();
    }

} 
