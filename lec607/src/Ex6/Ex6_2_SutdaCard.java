package Ex6;

public class Ex6_2_SutdaCard {

//	6_1 
//	필드 (클래스 변수 - static, 인스턴스 변수)
	int num;
	boolean isKwang;

//	6_2
//	생 
	public Ex6_2_SutdaCard() {
		this(1, true);	// this 생성자
	}


	public Ex6_2_SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
//		System.out.println(num);
		return num + ( isKwang ? "K" : "" );
	}
	
}
