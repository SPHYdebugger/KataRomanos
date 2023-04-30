
import java.util.Scanner;

public final class KataMain {

    /** constructor privado para evitar instanciación accidental */
    private KataMain() {

    }

    /**
     * Método principal.
     *
     * @param args argumentos.
     */
    public static void main(final String[] args) {

        int numeroEntrada;
        final int min = 1;
        final int max = 3000;


        Scanner teclado = new Scanner(System.in);

            do {
                System.out.println("Introduce un número entre el 1 y el 3000 ");
                System.out.println("Yo lo convertiré en números romanos.");
                numeroEntrada = teclado.nextInt();
            } while (numeroEntrada < min || numeroEntrada > max);

            String respuesta = convertirNumero(numeroEntrada);
            System.out.println("El número "
                 + numeroEntrada + " en romanos es " + respuesta);
    }

    /**
     * Método para convertir un número en número romano.
     *
     * @param numero el número entero a convertir a romano.
     * @return Devuelve el número convertido.
     */
    static String convertirNumero(final int numero) {
        final int entre10 = 10;
        final int entre100 = 100;

        final int mil = 1000;
        final int finalMil = 1999;
        final int dosMil = 2000;
        final int finalDosMil = 2999;
        final int tresMil = 3000;

        final int cuatro = 4;
        final int cinco = 5;
        final int seis = 6;
        final int nueve = 9;


        String numeroEnRomano = "";
        final String unoRomano = "I";
        final int unidades = numero % entre10;
        final int decenas = numero / entre10 % entre10;
        final int centenas = numero / entre100 % entre10;


        if (numero >= mil && numero <= finalMil) {
            numeroEnRomano = numeroEnRomano + "M";
        }
        if (numero >= dosMil && numero <= finalDosMil) {
            numeroEnRomano = numeroEnRomano + "MM";
        }
        if (numero == tresMil) {
            numeroEnRomano = numeroEnRomano + "MMM";
        }


        if (centenas == nueve) {
            numeroEnRomano = numeroEnRomano + "CM";
        } else if (centenas >= cinco) {
            numeroEnRomano = numeroEnRomano + "D";
            for (int i = seis; i <= centenas; i++) {
                numeroEnRomano = numeroEnRomano + "C";
            }
        } else if (centenas == cuatro) {
            numeroEnRomano = numeroEnRomano + "CD";
        } else {
            for (int i = 1; i <= centenas; i++) {
                numeroEnRomano = numeroEnRomano + "C";
            }
        }

        if (decenas == nueve) {
            numeroEnRomano = numeroEnRomano + "XC";
        } else if (decenas >= cinco) {
            numeroEnRomano = numeroEnRomano + "L";
            for (int i = seis; i <= decenas; i++) {
                numeroEnRomano = numeroEnRomano + "X";
            }
        } else if (decenas == cuatro) {
            numeroEnRomano = numeroEnRomano + "XL";
        } else {
            for (int i = 1; i <= decenas; i++) {
                numeroEnRomano = numeroEnRomano + "X";
            }
        }

        if (unidades == nueve) {
            numeroEnRomano = numeroEnRomano + "IX";
        } else if (unidades >= cinco) {
            numeroEnRomano = numeroEnRomano + "V";
            for (int i = seis; i <= unidades; i++) {
                numeroEnRomano = numeroEnRomano + unoRomano;
            }
        } else if (unidades == cuatro) {
            numeroEnRomano = numeroEnRomano + "IV";
        } else {
            for (int i = 1; i <= unidades; i++) {
                numeroEnRomano = numeroEnRomano + unoRomano;
            }
        }

        return numeroEnRomano;
    }


}
