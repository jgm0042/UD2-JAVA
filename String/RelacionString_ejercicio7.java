import java.util.Scanner;
public class RelacionString_ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadena1;
        char letra1;
        char letra2;


        System.out.println("Introduce una cadena de texto: ");
        cadena1= entrada.nextLine();

        System.out.println("Introduce la letra que quieres sustituir");
        letra1= entrada.next().charAt(0);

        System.out.println("Introduce la letra por la que quieres que sea sustituida: ");
        letra2= entrada.next().charAt(0);

        for (int i = 0; i < cadena1.length(); i++) {

            if (cadena1.charAt(i)== letra1); {
                cadena1 = cadena1.replace(letra1, letra2);
            }
        }
        System.out.println("La cadena resultante es: "+ cadena1);
        entrada.close();
    }
    
}


    
