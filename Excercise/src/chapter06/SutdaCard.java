package chapter06;

public class SutdaCard {
	
	//필드(클래스 변수 - static, 인스턴스변수)
	int num;
	boolean isKwang;
	
	//생
	public SutdaCard() {
		this(1, true );   // tihs 생성자
	}

	public SutdaCard(int num, boolean isKwang) {
		
		this.num = num;
		this.isKwang = isKwang;
	}
	
	
	
	String info(){
//		System.out.println(num);
		return num + (  isKwang ? "K" : "" );
	}
	
	
	
	

}
