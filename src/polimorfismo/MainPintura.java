package polimorfismo;
// Aquí modifico para probar el commit de nuevo
import java.text.DecimalFormat;
import java.util.Scanner;

public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura;
        pintura=new Pintura(250);
        Rectangulo rectangulo=new Rectangulo("rectangulo",20,35);
        Esfera  esfera=new Esfera("esfera",15);
        Cilindro cilindro= new Cilindro("cilindro",10,30);
        Scanner sc1 = new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("#.00");
        int num;
        boolean salir = false;
        do{
            try {
                System.out.printf("Ejercicio Pintura \n");
                System.out.println(("0 - Salir"));
                System.out.println(("1 - Forma Rectángulo (20,35)"));
                System.out.println(("2 - Forma Esfera (15) "));
                System.out.println(("3 - Forma Cilindro(10,30) "));
                System.out.println(("4 - Volver al menú"));
                System.out.print("Elija opciones de 0 al 4: ");
                num = sc1.nextInt();
                switch (num){
                    case 0: System.out.println("Salir de la lista");salir=true;break;
                    case 1: CalculoArea(rectangulo);break;
                    case 2: CalculoArea(esfera);break;
                    case 3: CalculoArea(cilindro);break;
                    case 4: System.out.println("Volver al menú");break;
                    default:System.out.println("Opción inválida, elija opciones de 0 al 4");
                }
            } catch(Exception ex) {
                System.out.println("No ha introducido un número, elija opción válida. ");
                salir=false;
                sc1.next();
            }
        }while (!salir);


        //Cilindro cilindro=
    }
    public static void CalculoArea(Forma forma)
    {
        DecimalFormat df= new DecimalFormat("#.00");
        System.out.println(forma.getNombre()+" "+forma.toString()+" Area: "+df.format(forma.calculoArea()));}
}
