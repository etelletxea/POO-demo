package hoja5;

public class maincubo {
    public static void main(String[] args) {
        Cubo c1 = new Cubo();
        c1.setLado(8);

        CalcularDatosReferencia(c1);

        System.out.println("¿ Paso por referencia ? ");
        System.out.println(" El valor del area es "+ c1.getArea());
        System.out.println(" El valor del area es "+ c1.getVolumen());

    }

    public static int CalculoArea (int lado)
    {
        return (lado*6);
    }
    public static int CalculoVolumen (int lado)
    {
        return (lado*lado*lado);
    }
    public static void CalcularDatosReferencia(Cubo cubo)
    {
        int lado=cubo.getLado(); // leo lado del cubo con get

        int area= CalculoArea(lado);
        int volumen=CalculoVolumen(lado);


        cubo.setArea(area);
        cubo.setVolumen(volumen);

        System.out.println(" El valor del area es "+ cubo.getArea());
        System.out.println(" El valor del area es "+ cubo.getVolumen());

    }

}
