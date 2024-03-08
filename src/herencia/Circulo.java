package herencia;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        if (radio<0) this.radio=0;
        else this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getArea(){
        double resultado;
        resultado = Math.PI*Math.pow(radio,2);
        return resultado;
    }
}

