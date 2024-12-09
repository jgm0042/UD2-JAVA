

public class Array2 {
    
    public static void main(String[] args) {

String[] fruta = new String[4];
fruta[0]="Naranja";
fruta[1]="Fresa";
fruta[2]="melom";
fruta[3]="Pera";


int resultado;
String larga = "";

for (int i = 0; i < fruta.length; i++) {
    resultado = fruta[i].length();

    if (resultado >= larga.length()) {
        larga = fruta[i];
        System.out.println("La cadena mas larga es: " + fruta[i]);
    }
    
    
        }


    }
}
