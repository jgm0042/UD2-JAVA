import java.util.Scanner;
public class RelacionString_ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String cadena1;
        String cadena2;
        Boolean comprobacion;

        System.out.println("Introduce la primera cadena: ");
        cadena1 = entrada.nextLine();
        System.out.println("Introduce la segunda cadena: ");   
        cadena2 = entrada.nextLine();
        
        comprobacion = cadena1.startsWith(cadena2);
        if (comprobacion==true) {
        System.out.println("Las cadenas se parecen");            
            
        }

        else{
            System.out.println("Las cadenas no se parecen");
        }
        entrada.close();
    }
    
}

