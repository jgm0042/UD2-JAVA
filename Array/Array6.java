import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce el número de alumnos: ");
        int numAlumnos = scanner.nextInt();

        double[] notas = new double[numAlumnos];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular la nota media
        double sumaNotas = 0;
        for (double nota : notas) {
            sumaNotas += nota;
        }
        double notaMedia = sumaNotas / numAlumnos;

        // Mostrar la nota media
        System.out.printf("La nota media del grupo es: " + notaMedia);
        System.out.println(" ");
        System.out.println(" ");


        System.out.println("Alumnos con notas superiores a la media:");
        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i] > notaMedia) {
                System.out.printf("Alumno %d: %.2f%n", i + 1, notas[i]);
            }
        }

        scanner.close();
    }
}
