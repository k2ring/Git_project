package inputEx;

import java.io.IOException;
import java.util.Scanner;

public class SystemInTest1 {

	public static void main(String[] args) {
	// 한 글자 영어는 읽는 법(read), 한글자 한글 읽는 법 Scanner, 한줄은 nextLine
			try {
//				int i=System.in.read(); //Reads the next byte of data from the input stream.
//				System.out.println((char)i);
				
				
//				Scanner sc=new Scanner(System.in);
//				String oneKor=sc.next();
//				System.out.println(oneKor);
				
				
				Scanner sc=new Scanner(System.in);
				String oneLineKor=sc.nextLine();
				System.out.println(oneLineKor);
				
				
//				System.out.println(i);
			} catch (Exception e) {
				
				e.printStackTrace();
			}

	}

}
