package oop;

public class Bus {

	//필
	int busNumber;
	int passengerCount;
	int money;
	
	
	public Bus() {
	
	}
	
	public Bus(int busNumber) {
		
		this.busNumber = busNumber;
	}

	
	//생
	
	
	
	
	//메
	
	void take(int money){
//		this.money = this.money + money;
		this.money += money;
	}
	
	void showInfo(){
		System.out.println("현재 버스 회사 수입은" + money);
	}
}
