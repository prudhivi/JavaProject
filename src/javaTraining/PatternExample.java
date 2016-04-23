/**
 * 
 */
package javaTraining;

import java.util.regex.Pattern;

/**
 * @author CG3
 *
 */
public class PatternExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
 System.out.println(Pattern.matches("[a-zA-z]{1}[a-zA-z0-9_.]*[@]{1}[a-zA-z]*[.]{1}[a-zA-Z]*", "pavan.1234@gmail.com"));
		
		
	}

}
