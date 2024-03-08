// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Coche car=new Coche();
        car.setMarca("Ford");
        car.setModelo("Fiesta");
        car.setColor("Azul metal");
        car.setPeso(1600);
        car.setPrecio(25000);
        car.setPuertas(5);

        System.out.println("Marca: "+car.getMarca());
        System.out.println("Modelo: "+car.getModelo());
        System.out.println("Color: "+car.getColor());
        System.out.println("Peso: "+car.getPeso());
        System.out.println("Precio: "+car.getPrecio());
        System.out.println("Puertas: "+car.getPuertas());

        Coche car1=new Coche("Clio","Renault",1300,5,"Rojo",16900);
        System.out.println("Marca: "+car1.getMarca());
        System.out.println("Modelo: "+car1.getModelo());
        System.out.println("Color: "+car1.getColor());
        System.out.println("Peso: "+car1.getPeso());
        System.out.println("Precio: "+car1.getPrecio());
        System.out.println("Puertas: "+car1.getPuertas());
        System.out.println("------------------------------------------------");

        Calculadora calculator=new Calculadora();
        calculator.setPrimerNumero(5.0);
        calculator.setSegundoNumero(4.0);
        System.out.println("Suma= "+calculator.getResultadoSuma());
        System.out.println("Resta= "+calculator.getResultadoResta());
        calculator.setSegundoNumero(0);
        System.out.println("Producto= "+calculator.getMultiplicationResult());
        System.out.println("División= "+calculator.getDivisionResult());
        calculator.setSegundoNumero(1);
        System.out.println("Producto= "+calculator.getMultiplicationResult());
        System.out.println("División= "+calculator.getDivisionResult());
        System.out.println("------------------------------------------------");

        Persona person=new Persona();
        person.setNombre("");
        person.setApellidos("");
        person.setEdad(10);
        System.out.println("Full name= "+person.getFullName());
        System.out.println("Adolescente= "+person.esAdolescente());
        person.setNombre("Eduardo");
        person.setApellidos("Telletxea");
        person.setEdad(19);
        System.out.println("Full name= "+person.getFullName());
        System.out.println("adolescente= "+person.esAdolescente());
        System.out.println("------------------------------------------------");
        Alfombra alfombra=new Alfombra(3.5);
        Suelo suelo=new Suelo(2.75,4.0);
        Calcula calculadora=new Calcula(alfombra, suelo);
        System.out.println("Coste total alfombra:" +calculadora.getCosteTotal());
        Alfombra alfombra1=new Alfombra(1.5);
        Suelo suelo1=new Suelo(5.4,4.5);
        Calcula calculadora1=new Calcula(alfombra1, suelo1);
        System.out.println("Coste total alfombra:" +calculadora1.getCosteTotal());
    }
}