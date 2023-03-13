import java.util.Scanner;

public class KataMain {

    public static void main(String[] args) {
        int numeroEntrada;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número entre el 1 y 3000");
        numeroEntrada = teclado.nextInt();
        convertirNumero(numeroEntrada);



    }


    public static String convertirNumero (int numero){
        String numeroEnRomano= "";
        String numeroUno = "I";
        if (numero>0 && numero<4){
            for (int i=1; i==numero; i++ ){
                numeroEnRomano= numeroEnRomano + numeroUno  ;
            }
        }else {
            numeroEnRomano= "V";
        }

        return numeroEnRomano;
    }

}
