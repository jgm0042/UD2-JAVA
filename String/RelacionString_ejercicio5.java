import java.util.Scanner;

public class RelacionString_ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        char letra;
        String nombre;
        String subnombre= " " ;


        System.out.println("Introduce tu nombre en minusculas: ");
         nombre = entrada.nextLine();

        for (int i = 0; i < nombre.length() ; i++) {

                letra = nombre.charAt(i);

            if ( letra == ' ') {
            
                letra ++;
                char mayuscula = Character.toUpperCase(letra);
                subnombre +=  mayuscula;
            }
            else{ subnombre += letra; };
           
        }
        System.out.println("Tu nombre con las iniciales en mayuscula es:" + subnombre  );
        entrada.close();
    }
}

