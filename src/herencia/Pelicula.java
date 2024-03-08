package herencia;

public class Pelicula extends Video{
    String director;
    int valoracion;

    public Pelicula(String titulo, int minutos, String director, int valoracion) {
        super(titulo, minutos);
        this.director = director;
        this.valoracion = valoracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "director='" + director + '\'' +
                ", valoracion=" + valoracion +
                '}';
    }
}
