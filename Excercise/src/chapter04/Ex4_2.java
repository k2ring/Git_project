package chapter04;

public class Ex4_2 {

	public static void main(String[] args) {
		
//		int i=3;
//		System.out.println( !((i % 2 == 0)   ||  (i % 3 == 0)));
		
//		System.out.println( (i % 2 != 0)  &&   (i % 3 != 0));
		
		
		int tot=0;
		for(int i=1;i<=20;i++) {
			if(!((i % 2 == 0)   ||  (i % 3 == 0))) {
				
				tot=tot + i;
//				System.out.println(i);
			}
		}
		System.out.println(tot);
	}

}
