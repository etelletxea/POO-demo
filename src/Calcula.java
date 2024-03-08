public class Calcula {
    Alfombra alfombra;
    Suelo suelo;
    public Calcula(Alfombra alfombra,Suelo suelo)
    {
        this.alfombra=alfombra;
        this.suelo=suelo;

    }
    public double getCosteTotal()
    {
        return(this.suelo.getArea()*this.alfombra.getCoste());
    }
}
