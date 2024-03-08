package abstractas;

public class Dog extends Animal{
    public Dog(String nombre) {
        super(nombre);
    }

    @Override
    public void alimentar() {

        System.out.println("El perro "+this.getNombre()+" está comiendo");

    }

    @Override
    public void mover() {
        System.out.println("El perro "+this.getNombre()+" se está moviendo");

    }
}
