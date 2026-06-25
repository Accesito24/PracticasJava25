package dam.practicas.examen.examen3;

public class Main {

    public static void main(String[] args) {

        // ---------------------------------------------------------------
        // PRUEBA 1 — Intervención sobre una moto y generación de informe
        // ---------------------------------------------------------------
        System.out.println("=== PRUEBA 1: Moto ===");

        Taller taller = new Taller(40.0);

        Moto moto = new Moto("MOTO-123", 125);
        Intervencion intervencionMoto = new Intervencion(
                moto,
                "Revisión general y cambio de aceite",
                1.0,
                20.0
        );
        taller.registrarIntervencion(intervencionMoto);

        try {
            taller.generarInforme("MOTO-123");
            // Coste esperado: base=(1*40)+20=60 → 60*0.9 = 54.0 €
        } catch (ElementoNoEncontradoException e) {
            System.out.println("Atención: " + e.getMessage());
        }

        // ---------------------------------------------------------------
        // PRUEBA 2 — Varias intervenciones sobre un coche Diésel
        // ---------------------------------------------------------------
        System.out.println("\n=== PRUEBA 2: Coche Diésel ===");

        Coche cocheDiesel = new Coche("DIESEL999", TipoCombustible.DIESEL);

        Intervencion intervencion1Diesel = new Intervencion(
                cocheDiesel,
                "Cambio de filtro de combustible",
                2.0,
                50.0
        );
        Intervencion intervencion2Diesel = new Intervencion(
                cocheDiesel,
                "Revisión de frenos",
                1.5,
                80.0
        );
        taller.registrarIntervencion(intervencion1Diesel);
        taller.registrarIntervencion(intervencion2Diesel);

        try {
            taller.generarInforme("DIESEL999");
            // Intervención 1: base=(2*40)+50=130 → 130+15 = 145.0 €
            // Intervención 2: base=(1.5*40)+80=140 → 140+15 = 155.0 €
            // Total: 300.0 €
        } catch (ElementoNoEncontradoException e) {
            System.out.println("Atención: " + e.getMessage());
        }

        // ---------------------------------------------------------------
        // PRUEBA 3 — Identificador inexistente
        // ---------------------------------------------------------------
        System.out.println("\n=== PRUEBA 3: Identificador inexistente ===");

        try {
            taller.generarInforme("INVENTADA-00");
        } catch (ElementoNoEncontradoException e) {
            System.out.println("Atención: no hay historial registrado para este elemento.");
        }

        System.out.println("\n=== Fin de pruebas ===");
    }
}
