package ex1.ex1;

/**
 * Hello world!
 *
 */
public class App 
{
	    public static String convertGradeToLetter(int grade) {
	        if (grade < 0 || grade > 100) {
	            return "error";
	        } else if (grade <= 49) {
	            return "F";
	        } else if (grade <= 59) {
	            return "E";
	        } else if (grade <= 69) {
	            return "D";
	        } else if (grade <= 79) {
	            return "C";
	        } else if (grade <= 89) {
	            return "B";
	        } else {
	            return "A";
	        }
	    }
}
