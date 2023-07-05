package chapter09;

public class SutdaCard {

	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof SutdaCard) {
			SutdaCard sc=(SutdaCard) obj;
			return this.num == sc.num  && this.isKwang == sc.isKwang ;
		}
		
		
		
		return false;
	}
	
	@Override
	public String toString() {
	
		return  num + ( isKwang ? "K":"");
	}

}
