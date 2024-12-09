import java.util.Random;

public class Array13 {
    public static void main(String[] args) {
        String[] paises = {"España", "Rusia", "Japón", "Australia"};
        int filas = 4, columnas = 10;
        int[][] estaturas = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                estaturas[i][j] = random.nextInt(71) + 140;
            }
        }

        for (int i = 0; i < filas; i++) {
            int suma = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            System.out.printf("%-10s", paises[i] + ":");
            for (int j = 0; j < columnas; j++) {
                int estatura = estaturas[i][j];
                System.out.printf("%4d", estatura);
                suma += estatura;
                if (estatura < min) min = estatura;
                if (estatura > max) max = estatura;
            }

            int media = suma / columnas;
            System.out.printf("  |  %3d %3d %3d%n", media, min, max);
        }
    }
}
