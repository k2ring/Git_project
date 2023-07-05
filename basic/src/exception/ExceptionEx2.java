package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx2 {
	
	
	public static void main(String[] args) throws FileNotFoundException  {
	
//		try {
//			new FileInputStream("");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		new FileInputStream("aaa.txt");
	}
	
	

}
