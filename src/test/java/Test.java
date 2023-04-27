import org.junit.Assert;


public class Test {

    @org.junit.Test
    // Probando el número 1
        public void pruebaUno(){
        KataMain kata = new KataMain();
        Assert.assertEquals("I", kata.convertirNumero(1));
    }
    @org.junit.Test
    // Probando el número 2
    public void pruebaDos(){
        KataMain kata = new KataMain();
        Assert.assertEquals("II", kata.convertirNumero(2));
    }
    @org.junit.Test
    // Probando el número 3
    public void pruebaTres(){
        KataMain kata = new KataMain();
        Assert.assertEquals("III", kata.convertirNumero(3));
    }
    @org.junit.Test
    // Probando el número 5
    public void pruebaCinco(){
        KataMain kata = new KataMain();
        Assert.assertEquals("V", kata.convertirNumero(5));
    }
    @org.junit.Test
    // Probando el número 6
    public void pruebaSeis(){
        KataMain kata = new KataMain();
        Assert.assertEquals("VI", kata.convertirNumero(6));
    }
    @org.junit.Test
    // Probando el número 7
    public void pruebaSiete(){
        KataMain kata = new KataMain();
        Assert.assertEquals("VII", kata.convertirNumero(7));
    }
    @org.junit.Test
    // Probando el número 8
    public void pruebaOcho(){
        KataMain kata = new KataMain();
        Assert.assertEquals("VIII", kata.convertirNumero(8));
    }
    @org.junit.Test
    // Probando el número 10
    public void pruebaDiez(){
        KataMain kata = new KataMain();
        Assert.assertEquals("X", kata.convertirNumero(10));
    }
    @org.junit.Test
    // Probando el número 13
    public void pruebaTrece(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XIII", kata.convertirNumero(13));
    }
    @org.junit.Test
    // Probando el número 15
    public void pruebaQuince(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XV", kata.convertirNumero(15));
    }
    @org.junit.Test
    // Probando el número 20
    public void pruebaVeinte(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XX", kata.convertirNumero(20));
    }
    @org.junit.Test
    // Probando el número 33
    public void pruebaTreintaytres(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XXXIII", kata.convertirNumero(33));
    }
    @org.junit.Test
    // Probando el número 47
    public void pruebaCuarentaysiete(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XLVII", kata.convertirNumero(47));
    }
    @org.junit.Test
    // Probando el número 69
    public void pruebaSesentaynueve(){
        KataMain kata = new KataMain();
        Assert.assertEquals("LXIX", kata.convertirNumero(69));
    }
    @org.junit.Test
    // Probando el número 113
    public void pruebaCientoTrece(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXIII", kata.convertirNumero(113));
    }
    @org.junit.Test
    // Probando el número 115
    public void pruebaCientoQuince(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXV", kata.convertirNumero(115));
    }
    @org.junit.Test
    // Probando el número 120
    public void pruebaCientoVeinte(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXX", kata.convertirNumero(120));
    }
    @org.junit.Test
    // Probando el número 133
    public void pruebaCientoTreintaytres(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXXXIII", kata.convertirNumero(133));
    }
    @org.junit.Test
    // Probando el número 147
    public void pruebaCientoCuarentaysiete(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXLVII", kata.convertirNumero(147));
    }
    @org.junit.Test
    // Probando el número 169
    public void pruebaCientoSesentaynueve(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CLXIX", kata.convertirNumero(169));
    }
    @org.junit.Test
    // Probando el número 1113
    public void pruebaMilCientoTrece(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MCXIII", kata.convertirNumero(1113));
    }
    @org.junit.Test
    // Probando el número 1115
    public void pruebaMilCientoQuince(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MCXV", kata.convertirNumero(1115));
    }
    @org.junit.Test
    // Probando el número 1120
    public void pruebaMilCientoVeinte(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MCXX", kata.convertirNumero(1120));
    }
    @org.junit.Test
    // Probando el número 1133
    public void pruebaDosMilCientoTreintaytres(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MMCXXXIII", kata.convertirNumero(2133));
    }
    @org.junit.Test
    // Probando el número 2147
    public void pruebaDosMilCientoCuarentaysiete(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MMCXLVII", kata.convertirNumero(2147));
    }
    @org.junit.Test
    // Probando el número 2169
    public void pruebaDosMilCientoSesentaynueve(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MMCLXIX", kata.convertirNumero(2169));
    }

}
