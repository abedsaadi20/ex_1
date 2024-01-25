package ex1.ex1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    public void order_aopproved() {
    	final String expeted_result= "good";
    	int data=5;
    	String actual =App.order(data);
    	org.junit.Assert.assertEquals(actual, expeted_result);
    }
    @Test
    public void order_not_aopproved() {
    	final String expeted_result= "bad";
    	int data=20;
    	String actual =App.order(data);
    	org.junit.Assert.assertEquals(actual, expeted_result);
    }
}
