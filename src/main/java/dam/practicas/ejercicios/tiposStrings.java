package dam.practicas.ejercicios;

import java.util.Scanner;

public class tiposStrings {

    public static void main(String[] args) {

        String a = "Hola";
        String b = " Mundo";

        // CONCATENACIÓN
        String HolaMundo = a + "" + b;
        System.out.println(HolaMundo);

        // USO DE String.format
        String holaMundo = String.format("¡%s,%s!", a, b);
        System.out.println(holaMundo);

        // LLAMAR AL METODO PARA MOSTRAR EN PANTALLA
        MinusculasMayusculas();
        PasarEnteroADecimal();
        arrays();
        String dia = diaSemana(4);
        System.out.println(dia);

        System.out.println(remplazar("gorra",'r','t'));


    }

    // =====================METODO SEPARADO=======================================
    public static void MinusculasMayusculas() {

        String a = "Hola";
        String b = "Mundo";

        // ===================LONGITUD DEL STRING b================================
        System.out.println(b.length());

        // ===================MAYÚSCULAS Y MINÚSCULAS==============================
        System.out.println(a.toLowerCase()); // hola
        System.out.println(a.toUpperCase()); // HOLA

        System.out.println(b.toLowerCase()); // mundo
        System.out.println(b.toUpperCase()); // MUNDO

    }
    public static void arrays() {

        // Un array es una estructura que guarda varios valores del mismo tipo.
        // Para declararlo se usa: tipo[] nombre = new tipo[tamaño];

        // Creamos un array de 6 posiciones para guardar datos de una fecha de nacimiento
        int[] fechaNac = new int[6];
    }
    public static void PasarEnteroADecimal() {

        int x = 5;
        double y = x;
        System.out.println(y);

        double f = 5.5;
        int e = (int) f;
        System.out.println(e);


    }
    public static String diaSemana(int dia) {
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            default:
                nombreDia = "Día no válido";
        }
        return nombreDia;
    }
    public static String remplazar(String f, char c1, char c2) {
        String cambiado= f.replace(c1,c2);
        return cambiado;
    }
}