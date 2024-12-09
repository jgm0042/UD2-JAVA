import java.util.Scanner;
public class RelacionString_ejercicio4 {
    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
        String cadena1;
        int contador = 0;

        System.out.println("Introduce una cadena de texto: ");
        cadena1 = entrada.nextLine();

        for (int i = 0; i < cadena1.length(); i++) {

            if( cadena1.charAt(i) == ' ' ){
            contador++;
            }
        }
        contador++;
        System.out.println(" Hay " + contador+ " palabras en la cadena");
        entrada.close();
    }
 }
