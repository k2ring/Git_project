package chapter7_2;

public class Buyer {

	//필
	int money = 1000;
	Product[] cart = new Product[3];  // 구입한 제품을 저장하기 위한 배열
	int i = 0;                         // Product cart index
	//생
	public Buyer() {
	
	}
	//메
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여" + p + "를 살 수 없다."  );
			return; 
		}else{
			money	= money -  p.price;
		}
		
		add(p);
	}
	
	void add(Product p) {
		if(i>=cart.length) {
			Product newProductArr[]	= new Product[cart.length*2];
			System.arraycopy(cart, 0, newProductArr, 0, cart.length);
			cart=newProductArr;
		}
			cart[i++]=p;
		
	}
	
	void summary() {
		
		String list="";
		int tot=0;
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null) {
				break;	
			}
						
			
			list = list + cart[i];
			tot=tot + cart[i].price;
		}
		
		System.out.println("구입한 물건:" + list);
		System.out.println("사용한 금액:" + tot);
		System.out.println("남은 금액" + money);
	}
}
