import java.util.Random;
import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        
        int[] lista = new int[100];
        int num1 = 0;
        int num2 = 0;


        for (int i = 0; i < 100; i++) {
            Random random = new Random();
             int randomInt = random.nextInt(20);
             lista[i] = randomInt;
             System.out.println(randomInt);  
        }
        System.out.println("Introduce el valor que quieres remplazar:");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        System.out.println("Introduce el valor que quieres que sea reemplazado:");
        num2 = scanner.nextInt();

        for (int f = 0; f < lista.length; f++) {
            if (lista[f] == num1) {
                lista[f] = num2;
            }

            System.out.println( lista[f]);
        }
        
        scanner.close();
    }
}