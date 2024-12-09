import java.util.Scanner;

public class RelacionString_ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la primera cadena
        System.out.print("Introduce la cadena principal: ");
        String cadenaPrincipal = scanner.nextLine();

        // Pedir la subcadena
        System.out.print("Introduce la subcadena a buscar: ");
        String subcadena = scanner.nextLine();

        // Comprobar si la subcadena está contenida en la cadena principal
        if (cadenaPrincipal.contains(subcadena)) {
            System.out.println("La subcadena está en la cadena principal.");
        } else {
            System.out.println("La subcadena no está en la cadena principal.");
        }

        scanner.close();
    }
}