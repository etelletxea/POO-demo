package abstractas;

public abstract class Ejercicio1 {
    public Ejercicio1() {
        System.out.println("Este es un constructor de clase abstracta");
    }
    public abstract void abstract_method();
    public void noabstract_method(){
        System.out.println("Este es un metodo normal de clase abstracta");
     }
}
