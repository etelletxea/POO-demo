package hoja5;

public class Tester {
    public static void main(String[] args) {
        Punto pt=new Punto();
        System.out.println("x: "+pt.x+" y: "+pt.y);
        Puntotester tester =new Puntotester();
        tester.print(pt);
        System.out.println("x: "+pt.x+" y: "+pt.y);
    }
}
