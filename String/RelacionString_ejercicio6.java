import java.util.Scanner;

public class RelacionString_ejercicio6 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        String cadena, cadenaInvertida="";
        int i; 
        char caracter;

        System.out.print("Introduce una cadena de caracteres: ");
        cadena = entrada.nextLine();

        for(i=cadena.length()-1;i>=0;i--){
                caracter=cadena.charAt(i);
                cadenaInvertida = cadenaInvertida + caracter ;
        }
        System.out.println("La cadena invertida es :" + cadenaInvertida);

        entrada.close();
    }
} 