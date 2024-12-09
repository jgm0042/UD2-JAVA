
import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
               Scanner entrada = new Scanner(System.in);
                int ene[]= new int[5];
                int respuesta;
                int contador = 0;
                ene[0]=1;
                ene[1]=2;
                ene[2]=3;
                ene[3]=3;
                ene[4]=4;

                System.out.println("Ingrese el número");
                respuesta = entrada.nextInt();
                for (int i = 0; i < ene.length; i++) {
                    if (ene[i]==respuesta) {
                        contador++;
                        
                    }
                }
                System.out.println("Se repite " + contador + " veces");
               entrada.close();
    }
}