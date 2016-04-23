/**
 * 
 */
package javaTraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author CG3
 *
 */
public class TryCatch {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
       try{  
       		@SuppressWarnings("resource")
			FileInputStream input=new FileInputStream("C://User/CG7/workspace/JavaTraining/src/com/cloudgensys/training/exercise3/file.txt");
		int c;
		while((c=input.read())!=-1)
		{
			System.out.print(Character.toString ((char) c));
		}		
       }
       catch (FileNotFoundException E)
       {
    	   System.out.println("Please provide correct URL ");
       }
	
   				
}
}
