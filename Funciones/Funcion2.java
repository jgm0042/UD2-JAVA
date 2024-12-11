
import java.util.Scanner;

public class Funcion2{

    public static String convierteEnPalabras(int numero1){

        String numeroStr = String.valueOf(numero1);
        String solucion = "";

        for (int i = 0; i < numeroStr.length(); i++) {

            switch (numeroStr.charAt(i)) {

            case '0':
                solucion += "cero, ";
                break;
            case '1':
                solucion += "uno, ";
                break;
            case '2':
                solucion += "dos, ";
                break;
            case '3':
                solucion += "tres, "; 
                break;
            case '4':
                solucion += "cuatro, ";
                break;
            case '5':
                solucion += "cinco, ";
                break;
            case '6':
                solucion += "seis, ";
                break;
            case '7':
                solucion += "siete, ";
                break;
            case '8':
                solucion += "ocho, ";
                break;
            case '9':
                solucion += "nueve, ";
                break;
            default:
                break;
            }
            
        }
        return solucion;
    }



    public static void main(String[] args) {

         Scanner entrada = new Scanner(System.in);

         int numero1 = 0;
         String Salida = "";

         System.out.println("Introduce un numero");
         numero1 = entrada.nextInt();
         Salida = convierteEnPalabras(numero1);

         System.out.println("Su numero es:" + Salida);



        entrada.close();
    }
}