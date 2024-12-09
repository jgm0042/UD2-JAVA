public class Array11 {
    public static void main(String[] args) {
        int[][] num = new int[3][6];

        // Asignación de valores específicos
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;

        num[1][0] = 75;
        num[1][2] = 0;
        num[1][3] = 0;
        num[1][5] = 0;

        num[2][1] = 0;
        num[2][2] = 0;
        num[2][3] = -2;
        num[2][4] = 9;

        // Mostrar el contenido en forma de tabla
        System.out.println("Array num en forma de tabla:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%5d", num[i][j]);
            }
            System.out.println();
        }
    }
}
