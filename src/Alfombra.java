public class Alfombra {
    private double coste;
    public Alfombra(double coste)
    { if (coste<0) coste=0;
        this.coste=coste;}

    public double getCoste() {
        return coste;
    }
}
