package dam.practicas.Apps;

import java.util.Scanner;

public class AppTamagotchi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        System.out.print("¿Cómo quieres que se llame tu mascota?");

        String nombre = sc.nextLine();

        Tamagotchi mascota = new Tamagotchi(nombre);

        mascota.saludar();

        //Hacer menú
        do {
            System.out.println("Menú de opciones (elige una)");
            System.out.println("------------------");
            System.out.println("1.Jugar");
            System.out.println("2.Comer");
            System.out.println("3.Dormir");
            System.out.println("0.Salir");

            menu = sc.nextInt();

            // ejecutamos la accion
            switch(menu){
                case 0:
                    mascota.salir();
                    break;  // ← FALTABA ESTE BREAK
                case 1:
                    mascota.jugar();
                    break;
                case 2:
                    mascota.comer();
                    break;
                case 3:
                    mascota.dormir();
                    break;
                default:
                    System.out.println("La opcion es incorrecta");
            }

        }while(menu!=0);
    }
} 
