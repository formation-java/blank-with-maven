package glouglou;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class GlouGlouTest {
    @Test
    public void getMessage() throws Exception {
        GlouGlou g = new GlouGlou();
        Assert.assertEquals("Hello",g.getMessage());

    }

}