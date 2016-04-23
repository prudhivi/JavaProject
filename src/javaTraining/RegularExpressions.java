/**
 * 
 */
package javaTraining;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author CG3
 *
 */
public class RegularExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String t= " How are you doing " ;
		
		Pattern pattern= Pattern.compile ("d");
		
		Matcher matcher=pattern.matcher(t);
		
		if (matcher.find()) {
			
			System.out.println("Found match");
			
		}
		else {
			System.out.println("No Match Found!!");
			
		}
		
		
		
	}

}
