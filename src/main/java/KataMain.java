
import java.util.Scanner;

public class KataMain {

    public static void main(String[] args) {
        int numeroEntrada;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número entre el 1 y 3000");
        numeroEntrada = teclado.nextInt();
        String respuesta= convertirNumero(numeroEntrada);
        System.out.println(respuesta);


    }


    public static String convertirNumero (int numero){
        String numeroEnRomano = "";
        String unoRomano ="I";

        if (numero == 9) {
            numeroEnRomano = numeroEnRomano + "IX";
        } else if (numero >= 5) {
            numeroEnRomano = numeroEnRomano + "V";
            for (int i = 6; i <= numero; i++) {
                numeroEnRomano = numeroEnRomano + unoRomano;
            }
        } else if (numero == 4) {
            numeroEnRomano = numeroEnRomano + "IV";
        } else {
            for (int i = 1; i <= numero; i++) {
                numeroEnRomano = numeroEnRomano + unoRomano;
            }
        }

        return numeroEnRomano;
    }

}
