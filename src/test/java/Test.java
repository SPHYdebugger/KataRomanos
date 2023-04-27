import org.junit.Assert;


public class Test {

    @org.junit.Test
        public void pruebaUno(){
        KataMain kata = new KataMain();
        Assert.assertEquals("I", kata.convertirNumero(1));
    }
    @org.junit.Test
    public void pruebaDos(){
        KataMain kata = new KataMain();
        Assert.assertEquals("II", kata.convertirNumero(2));
    }
    @org.junit.Test
    public void pruebaTres(){
        KataMain kata = new KataMain();
        Assert.assertEquals("III", kata.convertirNumero(3));
    }
    @org.junit.Test
    public void pruebaCinco(){
        KataMain kata = new KataMain();
        Assert.assertEquals("V", kata.convertirNumero(5));
    }
    @org.junit.Test
    public void pruebaSeis(){
        KataMain kata = new KataMain();
        Assert.assertEquals("VI", kata.convertirNumero(6));
    }
    @org.junit.Test
    public void pruebaSiete(){
        KataMain kata = new KataMain();
        Assert.assertEquals("VII", kata.convertirNumero(7));
    }
    @org.junit.Test
    public void pruebaOcho(){
        KataMain kata = new KataMain();
        Assert.assertEquals("VIII", kata.convertirNumero(8));
    }
    @org.junit.Test
    public void pruebaDiez(){
        KataMain kata = new KataMain();
        Assert.assertEquals("X", kata.convertirNumero(10));
    }
    @org.junit.Test
    public void pruebaTrece(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XIII", kata.convertirNumero(13));
    }
    @org.junit.Test
    public void pruebaQuince(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XV", kata.convertirNumero(15));
    }
    @org.junit.Test
    public void pruebaVeinte(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XX", kata.convertirNumero(20));
    }
    @org.junit.Test
    public void pruebaTreintaytres(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XXXIII", kata.convertirNumero(33));
    }
    @org.junit.Test
    public void pruebaCuarentaysiete(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XLVII", kata.convertirNumero(47));
    }
    @org.junit.Test
    public void pruebaSesentaynueve(){
        KataMain kata = new KataMain();
        Assert.assertEquals("LXIX", kata.convertirNumero(69));
    }
    @org.junit.Test
    public void pruebaCientoTrece(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXIII", kata.convertirNumero(113));
    }
    @org.junit.Test
    public void pruebaCientoQuince(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXV", kata.convertirNumero(115));
    }
    @org.junit.Test
    public void pruebaCientoVeinte(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXX", kata.convertirNumero(120));
    }
    @org.junit.Test
    public void pruebaCientoTreintaytres(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXXXIII", kata.convertirNumero(133));
    }
    @org.junit.Test
    public void pruebaCientoCuarentaysiete(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXLVII", kata.convertirNumero(147));
    }
    @org.junit.Test
    public void pruebaCientoSesentaynueve(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CLXIX", kata.convertirNumero(169));
    }
    @org.junit.Test
    public void pruebaMilCientoTrece(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MCXIII", kata.convertirNumero(1113));
    }
    @org.junit.Test
    public void pruebaMilCientoQuince(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MCXV", kata.convertirNumero(1115));
    }
    @org.junit.Test
    public void pruebaMilCientoVeinte(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MCXX", kata.convertirNumero(1120));
    }
    @org.junit.Test
    public void pruebaDosMilCientoTreintaytres(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MMCXXXIII", kata.convertirNumero(2133));
    }
    @org.junit.Test
    public void pruebaDosMilCientoCuarentaysiete(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MMCXLVII", kata.convertirNumero(2147));
    }
    @org.junit.Test
    public void pruebaDosMilCientoSesentaynueve(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MMCLXIX", kata.convertirNumero(2169));
    }

}
