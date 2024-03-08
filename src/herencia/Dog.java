package herencia;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail) {

        super(name, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
    }
    public Dog(int eyes, int legs, int tail) {


        // llama por defecto a Animal();
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
    }

    private void chew(){
     System.out.println("El perro "+super.getName()+"  Mastica ");
    }
    @Override
    public void eat() {
        super.eat();
        chew();
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }
}
