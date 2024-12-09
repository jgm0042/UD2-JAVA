import java.util.Random;

public class Array12 {
    public static void main(String[] args) {
        int filas = 4, columnas = 5;
        int[][] numeros = new int[filas][columnas];
        Random random = new Random();

        // Generar números aleatorios entre 1 y 100
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numeros[i][j] = random.nextInt(100) + 1;
            }
        }

        // Mostrar la tabla con las sumas
        int sumaTotal = 0;
        int[] sumaColumnas = new int[columnas];

        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%4d", numeros[i][j]);
                sumaFila += numeros[i][j];
                sumaColumnas[j] += numeros[i][j];
            }
            sumaTotal += sumaFila;
            System.out.printf("  |%5d%n", sumaFila);
        }

        // Mostrar sumas de columnas
        for (int j = 0; j < columnas; j++) {
            System.out.printf("%4d", sumaColumnas[j]);
        }
        System.out.printf("  |%5d%n", sumaTotal);
    }
}
