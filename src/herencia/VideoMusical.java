package herencia;
public class VideoMusical extends Video{
    String artista;
    String categoria;
    float precio;

    public VideoMusical(String titulo, int minutos, float precio, String artista, String categoria) {
        super(titulo, minutos);
        this.artista = artista;
        this.categoria = categoria;
        this.precio=precio;
    }
}
