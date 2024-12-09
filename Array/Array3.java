
import java.util.Scanner;
public class Array3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca el array de Strings
        System.out.println("Introduce el número de palabras:");
        int n = scanner.nextInt();
        
        scanner.nextLine(); // Limpiar el buffer

        String[] palabras = new String[n];
        System.out.println("Introduce las palabras:");
        for (int i = 0; i < n; i++) {
            palabras[i] = scanner.nextLine();
        }

        // Pedimos al usuario que introduzca el carácter
        System.out.println("Introduce un carácter:");
        char caracter = scanner.next().charAt(0);

        // Mostrar las palabras cuya primera letra coincida con el carácter
        System.out.println("Palabras que comienzan con '" + caracter + "':");
        for (String palabra : palabras) {
            if (!palabra.isEmpty() && palabra.charAt(0) == caracter) {
                System.out.println(palabra);
            }
        }

        scanner.close();
    }
}
