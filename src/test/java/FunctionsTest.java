import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionsTest {
    Functions functions=new Functions();
    @Test
    public void factorailPostive(){
        assertEquals("Facroails for positive numbers",6,functions.factorial(3));

    }

}
