import java.util.Random;
import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numeros = new int[20];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            numeros[i] = rand.nextInt(401);
        }

        System.out.println("Array original:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("¿Quieres resaltar los múltiplos de 5 o de 7? (introduce 5 o 7):");
        int opcion = entrada.nextInt();

        System.out.println("Array con los múltiplos resaltados:");
        for (int i = 0; i < 20; i++) {
            if ((opcion == 5 && numeros[i] % 5 == 0) || (opcion == 7 && numeros[i] % 7 == 0)) {
                System.out.print("[" + numeros[i] + "] ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        } 
        entrada.close();
        
    }
}
