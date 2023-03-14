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

}
