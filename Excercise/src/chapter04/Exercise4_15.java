package chapter04;

public class Exercise4_15 {

	public static void main(String[] args) {
		int number = 31313;
		int tmp = number;
		int result =0;
		
		
		while(tmp != 0) {
			result=  result*10 +  tmp % 10;
			System.out.println(result);
			tmp=tmp / 10;
		}
		
		if(number == result) {
			System.out.println( number + " 회문");
		}else {
			System.out.println( number + " 회문 X");
		}
			
	}
	
}
