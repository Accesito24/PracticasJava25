package dam.practicas.practicaBorrable;

public class Materiales {
    private String isbn;
    private String titulo;
    private String autor;
    private int ejemplarDispo;
    private int ejemplarMax;


    public Materiales(String isbn, String titulo, String autor, int ejemplarDispo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplarDispo = ejemplarDispo;
    }
    public void pestar (){
        if (ejemplarDispo > 0){
            ejemplarDispo --;
            System.out.println("Ejemplar prestado. Quedan " + ejemplarDispo);
        }else {
            System.out.println("No hay ejemplares disponibles");
        }
    }
    public void devolver () {
        if (ejemplarDispo < ejemplarMax) {
            ejemplarDispo ++;
            System.out.println("Ejemplar devuelto. Quedan " + ejemplarDispo);
        } else {
            System.out.println("Ya estan todos los ejemplares disponibles");
        }
    }
}
