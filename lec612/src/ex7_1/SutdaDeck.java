package ex7_1;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {

		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

//			System.out.println(isKwang + " ");
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	void shuffle() {
		int randomNumber = (int)(Math.random()*cards.length);
		
		for (int i = 0; i < cards.length; i++) {
			SutdaCard tmp = cards[i];
			cards[i] = cards[randomNumber];
			cards[randomNumber] = tmp;
		}
	}
	
	SutdaCard pick(int index) {	// 유효성 체크
		// index 범위 카드의 개수 20을 벗어날 경우나 0보다 작을 경우 null
		if(index >= CARD_NUM || index < 0) {
			return null;
		}
		return cards[index];
	}
	
	
	SutdaCard pick() {
		int randomNumber = (int)(Math.random()*cards.length);
		return pick(randomNumber);
	}
	
}
