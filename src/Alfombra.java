// Modificaoo el 9-3-2024
public class Alfombra {
    private double coste;
    public Alfombra(double coste)
    { if (coste<0) coste=0;
        this.coste=coste;}

    public double getCoste() {
        return coste;
    }
}
