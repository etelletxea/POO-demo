public class Calculadora {
    double primerNumero;
    double segundoNumero;

    public double getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(double primerNumero) {
        this.primerNumero = primerNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
    public double getResultadoSuma(){
        return(this.primerNumero+this.segundoNumero);
    }
    public double getResultadoResta(){
        return(this.primerNumero-this.segundoNumero);
    }
    public double getMultiplicationResult(){
        return(this.primerNumero*this.segundoNumero);
    }
    public double getDivisionResult(){
        if (this.segundoNumero==0) {return 0;}
        else
        return(this.primerNumero/this.segundoNumero);
    }
}
