package herencia;
public class Ordenador {
    private Procesador procesador;
    private Teclado teclado;
    private Monitor monitor;

    public Ordenador(Procesador procesador, Teclado teclado, Monitor monitor) {
        this.procesador = procesador;
        this.teclado = teclado;
        this.monitor = monitor;
    }
    public void encender() {
       // procesador.presionarBotonEncendido();
        getProcesador().presionarBotonEncendido();
        dibujarLogo();
    }
    private void dibujarLogo() {
        //monitor.
        getMonitor().dibujarPixel(12, 23);
    }
    private Procesador getProcesador() {
        return procesador;
    }
    private Teclado getTeclado() {
        return teclado;
    }
    private Monitor getMonitor() {
        return monitor;
    }
}
