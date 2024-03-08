package encapsulacion;

public class impresora {
    private int toner;
    private int npagimpresas;
    private boolean doblecara;

    public impresora(int toner, int npagimpresas, boolean doblecara) {
        this.toner = toner;
        this.npagimpresas = npagimpresas;
        this.doblecara = doblecara;
    }

    public int getToner() {
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }

    public int getNpagimpresas() {
        return npagimpresas;
    }

    public void setNpagimpresas(int npagimpresas) {
        this.npagimpresas = npagimpresas;
    }

    public boolean isDoblecara() {
        return doblecara;
    }

    public void setDoblecara(boolean doblecara) {
        this.doblecara = doblecara;
    }

    public int addToner(int toner) {
        int ltoner;
        ltoner = this.toner + toner;
        if (ltoner > 100)
            return (-1);
        else return (ltoner);
    }

    public int pageaimprimir(int numpag) {
        int nhojas, resto;
        nhojas = numpag;
        if (this.doblecara) {
            nhojas = numpag / 2;
            resto = numpag % 2;
            nhojas += resto;
        }
        this.npagimpresas=nhojas;
        return (nhojas);
    }

    @Override
    public String toString() {
        return "impresora{" +
                "toner=" + toner +
                ", npagimpresas=" + npagimpresas +
                ", doblecara=" + doblecara +
                '}';
    }
}

