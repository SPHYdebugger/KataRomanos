
import java.util.Scanner;

public final class KataMain {

/*Método principal

 */
    public static void main(String[] args) {
        int numeroEntrada;

        Scanner teclado = new Scanner(System.in);

            do {
                System.out.println("Introduce un número entre el 1 y el 3000 ");
                System.out.println("Yo lo convertiré en números romanos.");
                numeroEntrada = teclado.nextInt();
            } while (numeroEntrada < 1 || numeroEntrada > 3000);

            String respuesta = convertirNumero(numeroEntrada);
            System.out.println("El número " + numeroEntrada + " en romanos es " + respuesta);
    }

/* Método para convertir a romano

 */
    static String convertirNumero (int numero){
        String numeroEnRomano = "";
        final String unoRomano ="I";
        final int unidades;
        final int decenas;
        final int centenas;

        decenas = numero / 10 % 10;
        unidades = numero % 10;
        centenas = numero / 100 % 10;

        if (numero >= 1000 && numero<=1999){
            numeroEnRomano = numeroEnRomano + "M";
        }
        if (numero >= 2000 && numero<=2999){
            numeroEnRomano = numeroEnRomano + "MM";
        }
        if (numero == 3000){
            numeroEnRomano = numeroEnRomano + "MMM";
        }


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
