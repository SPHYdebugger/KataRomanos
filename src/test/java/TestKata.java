import org.junit.Assert;
import org.junit.Test;



public class TestKata {

    @Test
        public void pruebaCero(){
        KataMain kata = new KataMain();
        Assert.assertEquals("I", kata.convertirNumero(1));
    }

    @Test
    public void pruebaUno(){
        KataMain kata = new KataMain();
        Assert.assertEquals("V", kata.convertirNumero(5));
    }

}
