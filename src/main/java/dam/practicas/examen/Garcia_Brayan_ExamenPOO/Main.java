package dam.practicas.examen.Garcia_Brayan_ExamenPOO;

public class Main {

    public static void main(String[] args) {

        Instituto instituto = new Instituto("IES Galileo");

        Aula aulaPequena = new Aula("Aula pequeña", 2);
        Aula aulaGrande  = new Aula("Aula grande",  30);
        instituto.añadirAula(aulaPequena);
        instituto.añadirAula(aulaGrande);

        System.out.println("== AFORO ==");
        Alumno a1 = new Alumno("1", "Jhoshua Galileo", 7.5);
        Alumno a2 = new Alumno("2", "Isabel Galileo",  9.4);
        Alumno a3 = new Alumno("3", "Lucas Galileo",   8.2);

        instituto.matricularAlumno(a1, aulaPequena);
        instituto.matricularAlumno(a2, aulaPequena);
        instituto.matricularAlumno(a3, aulaPequena); // error de aforo

        instituto.matricularAlumno(a3, aulaGrande);

        //===========PERSONAL===========
        Profesor prof  = new Profesor("4",         "Eduardo Galileo",   "Programacion");
        Administrativo admin = new Administrativo("5",   "Alejandro Galileo", "Secretaria", "...");
        PersonalLimpieza limp  = new PersonalLimpieza("6", "Oliver Galileo",    "Gimnasio",   "mañana");

        instituto.añadirPersonal(prof);
        instituto.añadirPersonal(admin);
        instituto.añadirPersonal(limp);

        instituto.mostrarAlumnoExcelente();
        instituto.mostrarAprobados(5.0);
    }
}