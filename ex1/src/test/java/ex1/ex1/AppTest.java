package ex1.ex1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testConvertGradeToLetterBoundaries() {
        // Test case for lower boundary of each grade
        assertEquals("F", App.convertGradeToLetter(1));
        assertEquals("E", App.convertGradeToLetter(50));
        assertEquals("D", App.convertGradeToLetter(60));
        assertEquals("C", App.convertGradeToLetter(70));
        assertEquals("B", App.convertGradeToLetter(80));
        assertEquals("A", App.convertGradeToLetter(90));
        
        // Test case for upper boundary of each grade
        assertEquals("F", App.convertGradeToLetter(49));
        assertEquals("E", App.convertGradeToLetter(59));
        assertEquals("D", App.convertGradeToLetter(69));
        assertEquals("C", App.convertGradeToLetter(79));
        assertEquals("B", App.convertGradeToLetter(89));
        assertEquals("A", App.convertGradeToLetter(100));
    }
    
    @Test
    public void testConvertGradeToLetterErrors() {
        // Test case for invalid grades
        assertEquals("error", App.convertGradeToLetter(-1));
        assertEquals("error", App.convertGradeToLetter(101));
    }
}
