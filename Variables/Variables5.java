package Variables;
public class Variables5 {
    public static void main(String[] args) {
        int x = 10, y = 5;
        double n = 3.5, m = 1.2;

        System.out.println("Valor de X: " + x);
        System.out.println("Valor de Y: " + y);
        System.out.println("Valor de N: " + n);
        System.out.println("Valor de M: " + m);

        System.out.println("Suma X + Y: " + (x + y));
        System.out.println("Diferencia X - Y: " + (x - y));
        System.out.println("Producto X * Y: " + (x * y));
        System.out.println("Cociente X / Y: " + ((double) x / y));
        System.out.println("Resto X % Y: " + (x % y));

        System.out.println("Suma N + M: " + (n + m));
        System.out.println("Diferencia N - M: " + (n - m));
        System.out.println("Producto N * M: " + (n * m));
        System.out.println("Cociente N / M: " + (n / m));
        System.out.println("Resto N % M: " + (n % m));

        System.out.println("Suma X + N: " + (x + n));
        System.out.println("Cociente Y / M: " + (y / m));
        System.out.println("Resto Y % M: " + (y % m));

        System.out.println("El doble de X: " + (2 * x));
        System.out.println("El doble de Y: " + (2 * y));
        System.out.println("El doble de N: " + (2 * n));
        System.out.println("El doble de M: " + (2 * m));

        System.out.println("Suma de todas las variables: " + (x + y + n + m));
        System.out.println("Producto de todas las variables: " + (x * y * n * m));
    }
}
