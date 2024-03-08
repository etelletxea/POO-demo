package herencia;

public class Main {
    public static void main(String[] args) {
    /* Ejemplos herencia
      Animal animal = new Animal("pulga", 1, 1);
      Dog dog = new Dog("Maxi", 2, 5, 2, 4, 1);
      dog.eat();
         Dog dog=new Dog(2,4,1);
    */
    /* Ejemplos Herencia
        Circulo cir1 = new Circulo(2);
        Cilindro cil2 = new Cilindro(4,3);
        System.out.println(cil2.toString());

        System.out.println("Radio circulo: "+cir1.getRadio());
        System.out.println("Area circulo: "+cir1.getArea());
        System.out.println("Altura cilindro: "+cil2.getAltura());
        System.out.println("Volumen cilindro: "+cil2.getVolumen());
     */

        // Pelicula obj2 = new Pelicula("ET",120,"Spielberg",10);

        //System.out.println(obj1.toString());

        //System.out.println(obj2.toString());


        Procesador procesador = new Procesador("Intel", 2, 3);
        Monitor monitor = new Monitor("Philips", "1024x900", 24);
        Teclado teclado = new Teclado("Negro",90);

        Ordenador ordenador = new Ordenador(procesador, teclado, monitor);
        ordenador.encender();




    }

}
