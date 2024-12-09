import java.util.Scanner;

public class RelacionString_ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        // Eliminar espacios y convertir a minúsculas para ignorar diferencias
        String cadenaNormalizada = cadena.replaceAll("\\s+", "").toLowerCase();

        String cadenaInvertida = new StringBuilder(cadenaNormalizada).reverse().toString();

        if (cadenaNormalizada.equals(cadenaInvertida)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }

        scanner.close();
    }
}