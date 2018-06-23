package loom.hola_mundo_tests;
import org.junit.Assert;
import org.junit.Test;
import loom.hola_mundo.HolaMundo;

/**
 * Returns a String object that can be seen on the screen. 
 * <p>
 * This method always returns a greeting, whether or not the 
 * method receives a name to say hello to.
 *
 * @author Axel
 * @version 1.0
 * @param  void  no params in test cases
 * @return      result of the test
 */
 
public class HolaMundoTests {
    @Test
    public void queSaludaCorrectamente() { /*Test cuando paso un nombre*/
        HolaMundo holaMundo = new HolaMundo();
        Assert.assertEquals("Hola, Kent Beck!", holaMundo.saludar("Kent Beck"));
    }
    @Test
    public void saludoGenericoCorrecto() { /*Test sin pasar nombre*/
    	HolaMundo holaMundo = new HolaMundo();
    	Assert.assertEquals("Hola", holaMundo.saludar(""));
    }
}
