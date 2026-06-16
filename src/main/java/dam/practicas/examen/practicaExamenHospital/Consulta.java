package dam.practicas.examen.practicaExamenHospital;

import java.util.ArrayList;

public class Consulta {
    private String nomCons;
    private int limCap;
    private Medico medicoResponsable;
    private ArrayList<Paciente> listaPacientes;

    public Consulta(String nomCons, int limCap, Medico medicoResponsable) {
        this.nomCons = nomCons;
        this.limCap = limCap;
        this.medicoResponsable = medicoResponsable;
        this.listaPacientes = new ArrayList<>();
    }

    public String getNomCons() { return nomCons; }
    public int getLimCap() { return limCap; }
    public ArrayList<Paciente> getListaPacientes() { return listaPacientes; }

    public void agregarPaciente(Paciente p) throws AforoCompletoException {
        if (listaPacientes.size() >= limCap) {
            throw new AforoCompletoException("¡Error! La consulta " + nomCons + " ha superado su aforo máximo de " + limCap + " personas.");
        }
        listaPacientes.add(p);
        System.out.println("Paciente " + p.getNombreCompleto() + " asignado correctamente a " + nomCons);
    }

    @Override
    public String toString() {
        return "Consulta: " + nomCons + " | Médico: " + medicoResponsable.getNombreCompleto() + " | Capacidad: " + limCap;
    }
}