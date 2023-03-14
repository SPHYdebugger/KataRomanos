import org.junit.Assert;
import org.junit.Test;



public class TestKata {

    @Test
        public void pruebaUno(){
        KataMain kata = new KataMain();
        Assert.assertEquals("I", kata.convertirNumero(1));
    }
    @Test
    public void pruebaDos(){
        KataMain kata = new KataMain();
        Assert.assertEquals("II", kata.convertirNumero(2));
    }
    @Test
    public void pruebaTres(){
        KataMain kata = new KataMain();
        Assert.assertEquals("III", kata.convertirNumero(3));
    }
    @Test
    public void pruebaCinco(){
        KataMain kata = new KataMain();
        Assert.assertEquals("V", kata.convertirNumero(5));
    }
    @Test
    public void pruebaSeis(){
        KataMain kata = new KataMain();
        Assert.assertEquals("VI", kata.convertirNumero(6));
    }
    @Test
    public void pruebaSiete(){
        KataMain kata = new KataMain();
        Assert.assertEquals("VII", kata.convertirNumero(7));
    }
    @Test
    public void pruebaOcho(){
        KataMain kata = new KataMain();
        Assert.assertEquals("VIII", kata.convertirNumero(8));
    }
    @Test
    public void pruebaDiez(){
        KataMain kata = new KataMain();
        Assert.assertEquals("X", kata.convertirNumero(10));
    }
    @Test
    public void pruebaTrece(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XIII", kata.convertirNumero(13));
    }
    @Test
    public void pruebaQuince(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XV", kata.convertirNumero(15));
    }
    @Test
    public void pruebaVeinte(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XX", kata.convertirNumero(20));
    }
    @Test
    public void pruebaTreintaytres(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XXXIII", kata.convertirNumero(33));
    }
    @Test
    public void pruebaCuarentaysiete(){
        KataMain kata = new KataMain();
        Assert.assertEquals("XLVII", kata.convertirNumero(47));
    }
    @Test
    public void pruebaSesentaynueve(){
        KataMain kata = new KataMain();
        Assert.assertEquals("LXIX", kata.convertirNumero(69));
    }
    @Test
    public void pruebaCientoTrece(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXIII", kata.convertirNumero(113));
    }
    @Test
    public void pruebaCientoQuince(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXV", kata.convertirNumero(115));
    }
    @Test
    public void pruebaCientoVeinte(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXX", kata.convertirNumero(120));
    }
    @Test
    public void pruebaCientoTreintaytres(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXXXIII", kata.convertirNumero(133));
    }
    @Test
    public void pruebaCientoCuarentaysiete(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CXLVII", kata.convertirNumero(147));
    }
    @Test
    public void pruebaCientoSesentaynueve(){
        KataMain kata = new KataMain();
        Assert.assertEquals("CLXIX", kata.convertirNumero(169));
    }
    @Test
    public void pruebaMilCientoTrece(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MCXIII", kata.convertirNumero(1113));
    }
    @Test
    public void pruebaMilCientoQuince(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MCXV", kata.convertirNumero(1115));
    }
    @Test
    public void pruebaMilCientoVeinte(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MCXX", kata.convertirNumero(1120));
    }
    @Test
    public void pruebaDosMilCientoTreintaytres(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MMCXXXIII", kata.convertirNumero(2133));
    }
    @Test
    public void pruebaDosMilCientoCuarentaysiete(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MMCXLVII", kata.convertirNumero(2147));
    }
    @Test
    public void pruebaDosMilCientoSesentaynueve(){
        KataMain kata = new KataMain();
        Assert.assertEquals("MMCLXIX", kata.convertirNumero(2169));
    }

}
