package dam.practicas.examen.examen3;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Taller {

    private double precioPorHora;
    private ArrayList<Intervencion> historial;

    public Taller(double precioPorHora) {
        this.precioPorHora = precioPorHora;
        this.historial = new ArrayList<>();
    }

    public void registrarIntervencion(Intervencion intervencion) {
        historial.add(intervencion);
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    // Filtra el historial por identificador y genera el informe en fichero
    public void generarInforme(String identificador) throws ElementoNoEncontradoException {

        ArrayList<Intervencion> encontradas = new ArrayList<>();
        for (Intervencion intervencion : historial) {
            if (intervencion.getElemento().getIdentificador().equals(identificador)) {
                encontradas.add(intervencion);
            }
        }

        if (encontradas.isEmpty()) {
            throw new ElementoNoEncontradoException(identificador);
        }

        String nombreFichero = "informe_" + identificador + ".txt";
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(nombreFichero);

            pw.println("==================================================");
            pw.println(" MULTIFIX SOLUTIONS - INFORME CLIENTE ");
            pw.println("==================================================");
            pw.println("Identificador del Elemento: " + identificador);
            pw.println("--------------------------------------------------");

            double totalFacturado = 0.0;
            for (Intervencion intervencion : encontradas) {
                double coste = intervencion.calcularCoste(precioPorHora);
                totalFacturado += coste;
                pw.println("- Avería: " + intervencion.getDescripcion());
                pw.println("  Coste de la intervención: " + coste + " €");
            }

            pw.println("--------------------------------------------------");
            pw.println("TOTAL FACTURADO AL CLIENTE: " + totalFacturado + " €");
            pw.println("==================================================");

            System.out.println("Informe generado correctamente: " + nombreFichero);

        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
