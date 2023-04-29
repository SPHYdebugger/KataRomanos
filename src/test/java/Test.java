import org.junit.Assert;


public class Test {


    /* Probando el número 1
     */
    @org.junit.Test
        public void pruebaUno() {
        int numeroPrueba = 1;
        Assert.assertEquals("I", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 2
     */
    @org.junit.Test
    public void pruebaDos() {
        int numeroPrueba = 2;
        Assert.assertEquals ("II", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 3
     */
    @org.junit.Test
    public void pruebaTres() {
        int numeroPrueba = 3;
        Assert.assertEquals("III", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 5
     */
    @org.junit.Test
    public void pruebaCinco() {
        int numeroPrueba = 5;
        Assert.assertEquals("V", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 6
     */
    @org.junit.Test
    public void pruebaSeis() {
        int numeroPrueba = 6;
        Assert.assertEquals("VI", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 7
     */
    @org.junit.Test
    public void pruebaSiete() {
        int numeroPrueba = 7;
        Assert.assertEquals("VII", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 8
     */
    @org.junit.Test
    public void pruebaOcho() {
        int numeroPrueba = 8;
        Assert.assertEquals("VIII", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 10
     */
    @org.junit.Test
    public void pruebaDiez() {
        int numeroPrueba = 10;
        Assert.assertEquals("X", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 13
     */
    @org.junit.Test
    public void pruebaTrece() {
        int numeroPrueba = 13;
        Assert.assertEquals("XIII", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 15
     */
    @org.junit.Test
    public void pruebaQuince() {
        int numeroPrueba = 15;
        Assert.assertEquals("XV", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 20
     */
    @org.junit.Test
    public void pruebaVeinte() {
        int numeroPrueba = 20;
        Assert.assertEquals("XX", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 33
     */
    @org.junit.Test
    public void pruebaTreintaytres() {
        int numeroPrueba = 33;
        Assert.assertEquals("XXXIII", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 47
     */
    @org.junit.Test
    public void pruebaCuarentaysiete() {
        int numeroPrueba = 47;
        Assert.assertEquals("XLVII", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 69
     */
    @org.junit.Test
    public void pruebaSesentaynueve() {
        int numeroPrueba = 69;
        Assert.assertEquals("LXIX", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 113
     */
    @org.junit.Test
    public void pruebaCientoTrece() {
        int numeroPrueba = 113;
        Assert.assertEquals("CXIII", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 115
     */
    @org.junit.Test
    public void pruebaCientoQuince() {
        int numeroPrueba = 115;
        Assert.assertEquals("CXV", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 120
     */
    @org.junit.Test
    public void pruebaCientoVeinte() {
        int numeroPrueba = 120;
        Assert.assertEquals("CXX", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 133
     */
    @org.junit.Test
    public void pruebaCientoTreintaytres() {
        int numeroPrueba = 133;
        Assert.assertEquals("CXXXIII", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 147
     */
    @org.junit.Test
    public void pruebaCientoCuarentaysiete() {
        int numeroPrueba = 147;
        Assert.assertEquals("CXLVII", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 169
     */
    @org.junit.Test
    public void pruebaCientoSesentaynueve() {
        int numeroPrueba = 169;
        Assert.assertEquals("CLXIX", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 1113
     */
    @org.junit.Test
    public void pruebaMilCientoTrece() {
        int numeroPrueba = 1113;
        Assert.assertEquals("MCXIII", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 1115
     */
    @org.junit.Test
    public void pruebaMilCientoQuince() {
        int numeroPrueba = 1115;
        Assert.assertEquals("MCXV", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 1120
     */
    @org.junit.Test
    public void pruebaMilCientoVeinte() {
        int numeroPrueba = 1120;
        Assert.assertEquals("MCXX", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 2133
     */
    @org.junit.Test
    public void pruebaDosMilCientoTreintaytres() {
        int numeroPrueba = 2133;
        Assert.assertEquals("MMCXXXIII", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 2147
     */
    @org.junit.Test
    public void pruebaDosMilCientoCuarentaysiete() {
        int numeroPrueba = 2147;
        Assert.assertEquals("MMCXLVII", KataMain.convertirNumero(numeroPrueba));
    }

    /* Probando el número 2169
     */
    @org.junit.Test
    public void pruebaDosMilCientoSesentaynueve() {
        int numeroPrueba = 2169;
        Assert.assertEquals("MMCLXIX", KataMain.convertirNumero(numeroPrueba));
    }

}
