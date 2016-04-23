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
public class FileHandlingjava {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream input=new FileInputStream("E:/Softwares/file.txt");
		int c;
		while((c=input.read())!=-1)
		{
			System.out.print(Character.toString ((char) c));	
	}


}
	
}
