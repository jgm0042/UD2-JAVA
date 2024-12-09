import java.util.Random;

public class Array9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contadorPares = 0, contadorImpares = 0;

        for (int i = 0; i < 20; i++) {
            numeros[i] = rand.nextInt(101);
        }

        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                pares[contadorPares++] = numeros[i];
            } else {
                impares[contadorImpares++] = numeros[i];
            }
        }

        for (int i = 0; i < contadorPares; i++) {
            numeros[i] = pares[i];
        }
        for (int i = 0; i < contadorImpares; i++) {
            numeros[contadorPares + i] = impares[i];
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
