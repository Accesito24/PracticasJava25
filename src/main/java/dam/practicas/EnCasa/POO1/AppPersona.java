package dam.practicas.EnCasa.POO1;

public class AppPersona {
    public static void main(String[] args) {

        // ========los int, double, no van con comillas, solo los String========

        // 1. llamo al metodo NO a la clase. 2. nombre. 3. se guarda "=" en:. 4. los atributos
        Persona persona1 = new Persona("ANA", 20);
        Persona persona2 = new Persona("KEVIN", 56);

        // 1. nombre. 2. metodo al que llamo

        persona1.saludar();
        persona2.saludar();

    }
}
