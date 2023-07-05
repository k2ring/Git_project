
public class OpEx1 {

	public static void main(String[] args) {
		
		
		int a=0;
		int b=-1;
		int c=1;
		
		
		int d=a++ -  -a  - -c;
		
		int e = --a + b++ - d;
		
		System.out.println(a);
		System.out.println(b++);
		System.out.println(c--);
		System.out.println(a+b+c+d+e);
		
		
		
		

	}

}
