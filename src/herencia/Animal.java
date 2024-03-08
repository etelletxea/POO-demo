package herencia;

public class Animal {

        private String name;
        private int size;
        private int weight;
        public Animal(){
            this.name="";
            this.size=0;
            this.weight=0;
        }
        public Animal(String name, int size, int weight) {
            this.name = name;
            this.size = size;
            this.weight = weight;
        }

    public void eat() {
        //código
        System.out.println("Animal Comiendo");
    }

    public void move() {
        //código
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
//getters y setters

}
