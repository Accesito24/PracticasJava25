package dam.practicas.enums_records_generico.recordsBasicos;

import java.util.Objects;

public class CancionLegacy {
    private String titulo;
    private String artista;
    private int duracionSegundos;

    public CancionLegacy(String titulo, String artista, int duracionSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
    }

    public String getTitulo() {return titulo;}
    public String getArtista(){return artista;}
    public int getDuracionSegundos(){return duracionSegundos; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CancionLegacy that = (CancionLegacy) o;
        return duracionSegundos == that.duracionSegundos && Objects.equals(titulo, that.titulo) && Objects.equals(artista, that.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, artista, duracionSegundos);
    }

    @Override
    public String toString() {
        return "CancionLegacy{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", duracionSegundos=" + duracionSegundos +
                '}';
    }
}
