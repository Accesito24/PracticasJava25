package dam.practicas.pooEjercicios.abstraccion;

public class AppStreamMaster {

    public static void main(String[] args) {

        Suscripcion s1 = new PlanEstandar("carlos99", 10.00);
        Suscripcion s2 = new PlanFamiliar("Kevin", 10.00);
        Suscripcion s3 = new PlanEstudiante("Brayan", 10.00, "Cundinamarca");
        s1.mostrarDetalle();
        s2.mostrarDetalle();
        s3.mostrarDetalle();

    }



}
 
