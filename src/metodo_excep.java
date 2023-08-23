import java.util.Scanner;

public class metodo_excep extends Exception {
    public static char caracterEn (String cadena, int numero) throws Exception {

        if (numero <= cadena.length() && numero >0){
                return cadena.charAt(numero);
        }
        else {
            throw new Exception("entero mayor a longitud del String ");
        }
    }
    public metodo_excep(){

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres:");
        String lectTeclado = sc.nextLine();
        sc.close();

        try {
            String respuesta= String.valueOf(caracterEn(lectTeclado,7));
            System.out.println("el caracter en la posicion dada es: "+ respuesta);
        }catch (Exception e){
            System.out.println("es string no tiene tantos caracteres");
        }



    }

}