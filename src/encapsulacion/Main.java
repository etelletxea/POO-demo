package encapsulacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numpag, toner,num;
        impresora impr=new impresora(50,23,true);

        Scanner sc1 = new Scanner(System.in);
        boolean salir = false;

        do{
            try {
                System.out.printf("Ejercicio: Impresora \n");
                System.out.println(("0 - Salir"));
                System.out.println(("1 - Introducir páginas a imprimir"));
                System.out.println(("2 - Aumentar toner"));
                System.out.println(("3 - Volver al menú"));
                System.out.print("Elija opciones de 0 al 3: ");
                num = sc1.nextInt();
                switch (num){
                    case 0: System.out.println("Salir de la lista");salir=true;break;
                    case 1: imprimir(impr);break;
                    case 2: ponertoner(impr);break;
                    case 3: System.out.println("Volver al menú");break;
                    default:System.out.println("Opción inválida, elija opciones de 0 al 3 ");
                }
            } catch(Exception ex) {
                System.out.println("No ha introducido un número, elija opción válida. ");
                salir=false;
                sc1.next();
            }
        }while (!salir);
        System.out.println("Salgo del programa ");

        ;}
    public static void imprimir(impresora imp)
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca páginas a imprimir: ");
        int npag = sc.nextInt();
        imp.pageaimprimir(npag);
        System.out.println(imp.toString());
        ;}
    public static void ponertoner(impresora imp)
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Poner toner: ");
        int ntoner = sc.nextInt();
        imp.setToner(imp.addToner(ntoner));;
        System.out.println(imp.toString());
        ;}

}
