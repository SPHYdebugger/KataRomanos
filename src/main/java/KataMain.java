
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
        int unidades;
        int decenas;
        int centenas;

        decenas = numero / 10 % 10;
        unidades = numero % 10;
        centenas = numero / 100 % 10;

        if (centenas == 9) {
            numeroEnRomano = numeroEnRomano + "CM";
        } else if (centenas >= 5) {
            numeroEnRomano = numeroEnRomano + "D";
            for (int i = 6; i <= centenas; i++) {
                numeroEnRomano = numeroEnRomano + "C";
            }
        } else if (centenas == 4) {
            numeroEnRomano = numeroEnRomano + "CD";
        } else {
            for (int i = 1; i <= centenas; i++) {
                numeroEnRomano = numeroEnRomano + "C";
            }
        }

        if (decenas == 9) {
            numeroEnRomano = numeroEnRomano + "XC";
        } else if (decenas >= 5) {
            numeroEnRomano = numeroEnRomano + "L";
            for (int i = 6; i <= decenas; i++) {
                numeroEnRomano = numeroEnRomano + "X";
            }
        } else if (decenas == 4) {
            numeroEnRomano = numeroEnRomano + "XL";
        } else {
            for (int i = 1; i <= decenas; i++) {
                numeroEnRomano = numeroEnRomano + "X";
            }
        }

        if (unidades == 9) {
            numeroEnRomano = numeroEnRomano + "IX";
        } else if (unidades >= 5) {
            numeroEnRomano = numeroEnRomano + "V";
            for (int i = 6; i <= unidades; i++) {
                numeroEnRomano = numeroEnRomano + unoRomano;
            }
        } else if (unidades == 4) {
            numeroEnRomano = numeroEnRomano + "IV";
        } else {
            for (int i = 1; i <= unidades; i++) {
                numeroEnRomano = numeroEnRomano + unoRomano;
            }
        }


        return numeroEnRomano;
    }

}
