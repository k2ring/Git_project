package genericEx2;

import genericEx.Apple;

public class BoxEx {

	public static void main(String[] args) {
		
//		new Box<Apple>();
//		new Box<String>();
//		new Box<Integer>();
		
		Box<String> box1=new Box<String>();
		box1.set("hi");
		System.out.println(box1.get());

		
		
		Box<Integer> box2=new Box<Integer>();
		box2.set(88);
		System.out.println(box2.get());
		
		
		Box<Apple> box3=new Box<Apple>();
		box3.set(new Apple());
		System.out.println(box3.get());
		

		
		
		
		
	}

}
