import java.util.Scanner;

public class RelacionString_ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadena1;
        String cadenaFinal = "";

        System.out.println("Introduce una cadena de texto: ");
        cadena1 = entrada.nextLine();

        for (int i = 0; i < cadena1.length(); i++) {

            char letra1 = cadena1.charAt(i);


            if (Character.isUpperCase(letra1)) {
                cadenaFinal += Character.toLowerCase(letra1);
            } 
            else if  (Character.isLowerCase(letra1)) {
                cadenaFinal += Character.toUpperCase(letra1);
            } 
        }

        System.out.println("Cadena convertida: " + cadenaFinal);
        entrada.close();
    }
}



