package oop;

public class Subway {

	//필
	int lineNumber;
	int passengerCount;
	int money;
	
		//생
	
	public Subway() {
	
	}
	
	
	
	public Subway(int lineNumber) {
		
		this.lineNumber = lineNumber;
	}
		
		//메
	
	void take(int money){
//		this.money = this.money + money;
		this.money += money;
	}
	
	void showInfo(){
		System.out.println(lineNumber +"호선"+" 지하철 수입은" + money);
	}
}
