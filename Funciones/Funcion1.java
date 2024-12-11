

import java.util.Scanner;

public class Funcion1 {
    public static String funcion1(String numero1) {
        String salida="";
        
    for (int i = 0; i < numero1.length(); i++) {

        switch (numero1.charAt(i)) {
            case '1':
                salida = salida + " |";
                break;
            case '2':
                salida = salida + " ||";
                 break;
            case '3':
                salida = salida + " |||";
                break;
            case '4':
                salida = salida + " ||||";
                break;
            case '5':
                salida = salida + " |||||";
                break;
            case '6':
                salida = salida + " ||||||";
                break;
            case '7':
                salida = salida + " |||||||";
                break;
            case '8':
                salida = salida + " ||||||||";
                break;
            case '9':
                salida = salida + " |||||||||";
                break;
            case '0':
                salida = "-";
                break;
            default:
                break;
            
        }
     }
     return salida;
 }

         
    public static void main(String[] args) {

    int numero;
    String salida1="";

    Scanner entrada = new Scanner(System.in);
    

    System.out.println("Introduce un número:");
    numero = entrada.nextInt();

    String numero1 = String.valueOf(numero);
        salida1 = funcion1(numero1);
    
        System.out.println("La solucion es : " + salida1 );
    
    entrada.close();
    }    
}
