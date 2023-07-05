package chapter07;

class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수

	//부모(조상) 클래스의 생성자를 만드는 이유는 부모(조상) 클래스에 정의된 인스턴스 변수(price,bonusPoint)들이 초기화되도록
	public Product() {

	}

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	// 자식의 기본 생성자는 super()가 생성되더라고 자식은 부모의 기본 생성자를 만든 후에 만들어짐
	Tv() {
//		super();
	}

	public String toString() {
		return "Tv";
	}
}

public class Exercise7_5 {

	public static void main(String[] args) {

	}

}
