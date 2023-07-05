package Ex6;

class Ex6_8_PlayingCard {
	int kind;	// 인스턴스 변수
	int num;	// 인스턴스 변수
	static int width;	// 클래스(static) 변수
	static int height;	// 클래스(static) 변수


	Ex6_8_PlayingCard(int k, int n) {	// k, n 매개변수(parameter)이자 지역변수
			kind = k;
			num = n;
			}

	public static void main(String args[]) {	// args 지역변수
		@SuppressWarnings("unused")
		Ex6_8_PlayingCard card = new Ex6_8_PlayingCard(1, 1);	// card 지역변수

	}

}
