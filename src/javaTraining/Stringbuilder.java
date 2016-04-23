/**
 * 
 */
package javaTraining;

import java.util.Scanner;

/**
 * @author CG3
 *
 */
public class Stringbuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		
		System.out.println("Enter a number ");
		
		
		StringBuilder sb= new StringBuilder (" hello ");
		 
		for (int i=0 ;i<j;i++ ){
	    sb.append(i);
		}
		
		System.out.println(sb);
				
		}

}


