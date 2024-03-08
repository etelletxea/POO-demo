package excepciones;

public class Equipaje {
    int nombre;
    Bienes[] miArray;

    public Equipaje(int nombre, Bienes[] miArray) {
        this.nombre = nombre;
        this.miArray = miArray;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public Bienes[] getMiArray() {
        return miArray;
    }

    public void setMiArray(Bienes[] miArray) {
        this.miArray = miArray;
    }
}
