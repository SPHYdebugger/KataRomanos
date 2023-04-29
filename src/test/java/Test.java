import org.junit.Assert;


public class Test {

    @org.junit.Test
    // Probando el número 1
        public void pruebaUno(){
        int numeroPrueba = 1;
        Assert.assertEquals("I", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 2
    public void pruebaDos(){
        int numeroPrueba = 2;
        Assert.assertEquals("II", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 3
    public void pruebaTres(){
        int numeroPrueba = 3;
        Assert.assertEquals("III", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 5
    public void pruebaCinco(){
        int numeroPrueba = 5;
        Assert.assertEquals("V", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 6
    public void pruebaSeis(){
        int numeroPrueba = 6;
        Assert.assertEquals("VI", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 7
    public void pruebaSiete(){
        int numeroPrueba = 7;
        Assert.assertEquals("VII", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 8
    public void pruebaOcho(){
        int numeroPrueba = 8;
        Assert.assertEquals("VIII", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 10
    public void pruebaDiez(){
        int numeroPrueba = 10;
        Assert.assertEquals("X", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 13
    public void pruebaTrece(){
        int numeroPrueba = 13;
        Assert.assertEquals("XIII", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 15
    public void pruebaQuince(){
        int numeroPrueba = 15;
        Assert.assertEquals("XV", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 20
    public void pruebaVeinte(){
        int numeroPrueba = 20;
        Assert.assertEquals("XX", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 33
    public void pruebaTreintaytres(){
        int numeroPrueba = 33;
        Assert.assertEquals("XXXIII", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 47
    public void pruebaCuarentaysiete(){
        int numeroPrueba = 47;
        Assert.assertEquals("XLVII", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 69
    public void pruebaSesentaynueve(){
        int numeroPrueba = 69;
        Assert.assertEquals("LXIX", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 113
    public void pruebaCientoTrece(){
        int numeroPrueba = 113;
        Assert.assertEquals("CXIII", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 115
    public void pruebaCientoQuince(){
        int numeroPrueba = 115;
        Assert.assertEquals("CXV", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 120
    public void pruebaCientoVeinte(){
        int numeroPrueba = 120;
        Assert.assertEquals("CXX", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 133
    public void pruebaCientoTreintaytres(){
        int numeroPrueba = 133;
        Assert.assertEquals("CXXXIII", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 147
    public void pruebaCientoCuarentaysiete(){
        int numeroPrueba = 147;
        Assert.assertEquals("CXLVII", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 169
    public void pruebaCientoSesentaynueve(){
        int numeroPrueba = 169;
        Assert.assertEquals("CLXIX", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 1113
    public void pruebaMilCientoTrece(){
        int numeroPrueba = 1113;
        Assert.assertEquals("MCXIII", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 1115
    public void pruebaMilCientoQuince(){
        int numeroPrueba = 1115;
        Assert.assertEquals("MCXV", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 1120
    public void pruebaMilCientoVeinte(){
        int numeroPrueba = 1120;
        Assert.assertEquals("MCXX", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 1133
    public void pruebaDosMilCientoTreintaytres(){
        int numeroPrueba = 2133;
        Assert.assertEquals("MMCXXXIII", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 2147
    public void pruebaDosMilCientoCuarentaysiete(){
        int numeroPrueba = 2147;
        Assert.assertEquals("MMCXLVII", KataMain.convertirNumero(numeroPrueba));
    }
    @org.junit.Test
    // Probando el número 2169
    public void pruebaDosMilCientoSesentaynueve(){
        int numeroPrueba = 2169;
        Assert.assertEquals("MMCLXIX", KataMain.convertirNumero(numeroPrueba));
    }

}
