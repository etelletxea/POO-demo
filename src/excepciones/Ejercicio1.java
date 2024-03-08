package excepciones;

import abstractas.Dog;

public class Ejercicio1 {

        public static void main(String[] args) throws MyException {
            String texto="45";
            ConviertoANumero(texto);
            MuestroOperacion();
            }

            public static void ConviertoANumero(String entrada) throws MyException{
              try{
                 int divisor= Integer.parseInt(entrada);
              } catch (NumberFormatException e){
                throw new MyException("Error al convertir la cadena a entero",e,ErrorCode.INVALID_INPUT);
              }
            }

            public static void MuestroOperacion() throws MyException {
                try {
                    System.out.println(3 / 0);
                } catch (ArithmeticException e) {
                    throw new MyException("Error aritmético, operacion incorrecta", e, ErrorCode.INVALID_INPUT);
                }
            }
    }

