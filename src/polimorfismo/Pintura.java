package polimorfismo;

public class Pintura {
    private double cobertura;
    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }
    public double CalculoPintura (Forma forma)
    {
        double result;
        result= forma.calculoArea()/cobertura;
        return result;}

}
