package ex1.ex1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String order(int order) {
    	if(1<=order && order<=11) {
    		return "good";
    	}
    	else if(99>order && order>11) {
    		return "bad";
    	}
    	else {
    		return "Error";
    	}
    }
}
