import java.util.Scanner;

public class Array5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[10];
        int numeroPositivo = 0;
        int numeroNegativo = 0;
        int contadorPositivo= 0;
        int contadorNegativo = 0;


        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            numeros[i]= entrada.nextInt();

            if (numeros[i] >= 0) {
                numeroPositivo +=  numeros[i];
                contadorPositivo ++;
            }

            else { numeroNegativo +=  numeros[i];
                contadorNegativo ++;
            }
           }

           System.out.println("La suma de los numeros positivos es: " + (numeroPositivo / contadorPositivo));
           System.out.println("La suma de los numeros negativos es: " + (numeroNegativo / contadorNegativo));

           entrada.close();
        } 
    }
    
