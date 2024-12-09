
import java.util.Scanner;

class RelacionString_ejercicio1{

    public static void main(String arg[]) {
        String frase;
        char caracter;

        System.out.print("Introduzca una frase: ");
        Scanner entrada = new Scanner(System.in); 
        frase = entrada.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            System.out.println(caracter);
        }
        entrada.close();
    }

}