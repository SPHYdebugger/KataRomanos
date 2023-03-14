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
    public void pruebaNueve(){
        KataMain kata = new KataMain();
        Assert.assertEquals("IX", kata.convertirNumero(9));
    }


}
