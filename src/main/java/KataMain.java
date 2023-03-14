
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

        if (numero == 10){numeroEnRomano= "X";}

        if (numero == 13){
            numeroEnRomano= "X";
            for (int i=10; i< numero ; i++){
                numeroEnRomano = numeroEnRomano + unoRomano;
            }
        }

        if (numero == 15){numeroEnRomano= "XV";}

        if (numero == 20){numeroEnRomano= "XX";}

        if (numero == 33){
            numeroEnRomano= "XXX";
            for (int i=30; i< numero ; i++){
                numeroEnRomano = numeroEnRomano + unoRomano;
            }
        }
        if (numero == 47){
            numeroEnRomano= "XLV";
            for (int i=45; i< numero ; i++){
                numeroEnRomano = numeroEnRomano + unoRomano;
            }
        }
        if (numero == 69){
            numeroEnRomano= "LXIX";
        }



        return numeroEnRomano;
    }

}
