import java.util.Random;

public class Array7 {
    public static void main(String[] args) {
        // Definir los arrays
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        // Generar números aleatorios y calcular cuadrados y cubos
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numero[i] = random.nextInt(101); // Generar número aleatorio entre 0 y 100
            cuadrado[i] = numero[i] * numero[i]; // Calcular el cuadrado
            cubo[i] = numero[i] * numero[i] * numero[i]; // Calcular el cubo
        }

        // Mostrar los arrays en tres columnas
        System.out.printf("%-10s %-10s %-10s%n", "Número", "Cuadrado", "Cubo");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%-10d %-10d %-10d%n", numero[i], cuadrado[i], cubo[i]);
        }
    } 
}
