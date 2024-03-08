package hoja4;

public class mainstring {
    public static void main(String[] args) {
        String cadena = "Esto es una prueba";
        String cadena1 = "Esto Es una Prueba";
        boolean valor;
        String resultado=new String("");
        char car = findchar(10, cadena);
        System.out.println("Carácter: " + car);
        int codigouni = findcharunicode(10, cadena);
        /*
        System.out.println("Código unicode: " + codigouni);
        System.out.println("¿ Son iguales la cadena " + cadena + " y la cadena: " + cadena1 + " ? " + comparaCadena(cadena, cadena1));
        System.out.println("¿ Son iguales la cadena sin distinguir mayus y minus: " + cadena + " y la cadena: " + cadena1 + " ? " + comparaCadenaIgnoreCase(cadena, cadena1));
        resultado=comparaLex("Hola que tal","hola que tal");
        System.out.println(resultado);
        resultado=comparaLexIgnoreCase("Hola que tal","hola que tal");
        System.out.println(resultado);

        valor=contiene("Hola que tal","Tal");
        System.out.println(valor);

        valor=comienza("Hola que tal","Tal");
        System.out.println(valor); */
        imprimeString("Hola que tal");
    }

    public static char findchar(int indice, String cadena) {
        char car = ' ';
        car = cadena.charAt(indice);
        return (car);
    }

    public static int findcharunicode(int indice, String cadena) {
        int codigo;
        int i;
        if (indice < 0) i = 0;
        else if (indice >= cadena.length()) i = cadena.length() - 1;
        else i = indice - 1;
        codigo = cadena.codePointAt(i);
        return (codigo);
    }

    public static boolean comparaCadena(String cad, String cad1) {
        return (cad.equals(cad1));
    }

    public static boolean comparaCadenaIgnoreCase(String cad, String cad1) {
        return (cad.equalsIgnoreCase(cad1));
    }
    public static String comparaLex(String cadena1, String cadena2){
        String texto= new String("");
        if(cadena1.compareTo(cadena2)>0) texto=cadena1+" es mayor que "+cadena2;
        else if (cadena1.compareTo(cadena2)<0) texto=cadena1+" es menor que "+cadena2;
        else texto=cadena1+" y "+cadena2+" son iguales";
        return(texto);
    }
    public static String comparaLexIgnoreCase(String cadena1, String cadena2){
        String texto= new String("");
        if(cadena1.compareToIgnoreCase(cadena2)>0) texto=cadena1+" es mayor que "+cadena2;
        else if (cadena1.compareToIgnoreCase(cadena2)<0) texto=cadena1+" es menor que "+cadena2;
        else texto=cadena1+" y "+cadena2+" son iguales";
        return(texto);
    }
    public static boolean contiene(String cadena1,String cadena2)
    {   String texto1= cadena1.toLowerCase();
        String texto2=cadena2.toLowerCase();
        boolean valor;
        if(texto1.contains(texto2))valor=true;
        else valor=false;
        return valor;
    }
    public static boolean comienza(String cadena, String subcadena)
    {
        return(cadena.startsWith(subcadena));
    }
    public static void imprimeString(String cadena)
    { for (int i=0;i<cadena.length();i++)
      {
        System.out.print(findchar(i,cadena)+" indice "+i+" -> ");
      }
        System.out.println();
    }
}

