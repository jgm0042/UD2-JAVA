import java.util.Scanner;
public class RelacionString_ejercicio3{
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String cadena1;
        char caracter;
        int contador = 0;

        System.out.println("Introduce una cadena de caracteres:");
            cadena1 = entrada.nextLine();
        System.out.println("Introduce un caracter: ");
            caracter = entrada.next().charAt(0);
        
            for (int i = 0; i < cadena1.length(); i++) {

                if (cadena1.charAt(i) == caracter) {
                    contador ++;
                 }
                 
            }System.out.println("El caracter se repite " + contador + " veces");
            entrada.close();

    }
}
