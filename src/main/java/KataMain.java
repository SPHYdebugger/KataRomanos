
import java.util.Scanner;

public final class KataMain {

/** Método principal. */
    public static void main(final String[] args) {
        int numeroEntrada;
        int MIN = 1;
        int MAX = 3000;


        Scanner teclado = new Scanner(System.in);

            do {
                System.out.println("Introduce un número entre el 1 y el 3000 ");
                System.out.println("Yo lo convertiré en números romanos.");
                numeroEntrada = teclado.nextInt();
            } while (numeroEntrada < MIN || numeroEntrada > MAX);

            String respuesta = convertirNumero(numeroEntrada);
            System.out.println("El número "
                 + numeroEntrada + " en romanos es " + respuesta);
    }

/** Método para convertir a romano. */
    static String convertirNumero (int numero) {
        int ENTRE10 = 10;
        int ENTRE100 = 100;

        int MIL = 1000;
        int FINALMIL = 1999;
        int DOSMIL = 2000;
        int FINALDOSMIL = 2999;
        int TRESMIL = 3000;

        int CUATRO = 4;
        int CINCO = 5;
        int SEIS = 6;
        int NUEVE = 9;


        String numeroEnRomano = "";
        final String unoRomano ="I";
        final int unidades = numero % ENTRE10;
        final int decenas = numero / ENTRE10 % ENTRE10;
        final int centenas = numero / ENTRE100 % ENTRE10;


        if (numero >= MIL && numero<=FINALMIL) {
            numeroEnRomano = numeroEnRomano + "M";
        }
        if (numero >= DOSMIL && numero<=FINALDOSMIL) {
            numeroEnRomano = numeroEnRomano + "MM";
        }
        if (numero == TRESMIL) {
            numeroEnRomano = numeroEnRomano + "MMM";
        }


        if (centenas == NUEVE) {
            numeroEnRomano = numeroEnRomano + "CM";
        } else if (centenas >= CINCO) {
            numeroEnRomano = numeroEnRomano + "D";
            for (int i = SEIS; i <= centenas; i++) {
                numeroEnRomano = numeroEnRomano + "C";
            }
        } else if (centenas == CUATRO) {
            numeroEnRomano = numeroEnRomano + "CD";
        } else {
            for (int i = 1; i <= centenas; i++) {
                numeroEnRomano = numeroEnRomano + "C";
            }
        }

        if (decenas == NUEVE) {
            numeroEnRomano = numeroEnRomano + "XC";
        } else if (decenas >= CINCO) {
            numeroEnRomano = numeroEnRomano + "L";
            for (int i = SEIS; i <= decenas; i++) {
                numeroEnRomano = numeroEnRomano + "X";
            }
        } else if (decenas == CUATRO) {
            numeroEnRomano = numeroEnRomano + "XL";
        } else {
            for (int i = 1; i <= decenas; i++) {
                numeroEnRomano = numeroEnRomano + "X";
            }
        }

        if (unidades == NUEVE) {
            numeroEnRomano = numeroEnRomano + "IX";
        } else if (unidades >= CINCO) {
            numeroEnRomano = numeroEnRomano + "V";
            for (int i = SEIS; i <= unidades; i++) {
                numeroEnRomano = numeroEnRomano + unoRomano;
            }
        } else if (unidades == CUATRO) {
            numeroEnRomano = numeroEnRomano + "IV";
        } else {
            for (int i = 1; i <= unidades; i++) {
                numeroEnRomano = numeroEnRomano + unoRomano;
            }
        }

        return numeroEnRomano;
    }


}
