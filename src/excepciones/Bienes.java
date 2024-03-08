package excepciones;

public class Bienes {
    private String nombre;
    boolean peligrosa;

    public Bienes(String nombre, boolean peligrosa) {
        this.nombre = nombre;
        this.peligrosa = peligrosa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPeligrosa() {
        return peligrosa;
    }

    public void setPeligrosa(boolean peligrosa) {
        this.peligrosa = peligrosa;
    }
}
