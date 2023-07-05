package chapter7_2;

class Outer{
	
	static class Inner{
		int iv=200;
	}
}


public class Exercise7_25 {

	public static void main(String[] args) {
		
//		new Inner();
		
//		Outer out=new Outer();
//		Outer.Inner oi =out.new Inner();
//		System.out.println(oi.iv);
		
		
		Outer.Inner oi = new Outer.Inner();
		System.out.println(oi.iv);
		
		
	}

}
