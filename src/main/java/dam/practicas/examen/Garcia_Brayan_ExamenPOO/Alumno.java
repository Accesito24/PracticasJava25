package dam.practicas.examen.Garcia_Brayan_ExamenPOO;

    public class Alumno extends Persona {

        private double notaMedia;

        public Alumno(String dni, String nombreCompleto, double notaMedia) {
            super(dni, nombreCompleto);
            this.notaMedia = notaMedia;
        }

        public double getNotaMedia() {
            return notaMedia;
        }

        public void setNotaMedia(double notaMedia) {
            this.notaMedia = notaMedia;
        }

        @Override
        public void presentarse() {
            System.out.println("Hola, me llamo " + getNombreCompleto() + " con DNI: " + getDni() + " y Mi nota media es: " + notaMedia);
        }
    }

 
