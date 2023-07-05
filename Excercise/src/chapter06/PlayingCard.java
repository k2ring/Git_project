package chapter06;

public class PlayingCard {

	int kind;  //인스턴스 변수 
	int num;  // 인스턴스 변수 
	static int width;  // 클래스(static) 변수
	static int height; // 클래스(static) 변수

	PlayingCard(int k, int n) {   // k, n 매개변수(parameter)이자 지역변수(local variable)
		kind = k;
		num = n;
	}

	public static void main(String[] args) {   // args 지역변수
		PlayingCard card = new PlayingCard(1,1);  // card 지역변수 또는 참조변수
	}

}
