package herencia;

public class Cilindro extends Circulo{
    int altura;

    public Cilindro(double radio, int altura) {
        super(radio);
        if (altura==0) this.altura=0;
        else this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }
    public double getVolumen(){
        return this.altura*getArea();
    }
}
