import java.io.FileWriter;
import java.io.IO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public static void main(String[] args) {
    PrintWriter escritor = null;
    Scanner sc = new Scanner(System.in);

    try {
        escritor = new PrintWriter(new FileWriter("registro.txt", false));

        while (true) {
            System.out.println("Escribe una frase o escribe FIN");
            String frase = sc.nextLine();

            if (frase.equalsIgnoreCase("FIN")) {
                break;
            } else {
                escritor.println(frase);
            }
        }

    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        if (escritor != null) {
            escritor.close();
        }
        sc.close();
        System.out.println("Programa finalizado");
    }
} 
