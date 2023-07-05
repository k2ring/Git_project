package abstractClassEx;

public abstract class Animal {   // 추상 클래스 : 추상메서드가 있는 클래스, 구체적이지 않은 설계도, 부모로서 어느정도 간단한 설계도
	
	//필
	
	//생
	
	//메
	void breathe(){
		System.out.println("숨쉰다.");
	}
	
	
	//  메서드는 선언부와 구현부로 나뉜다.
	//  void breathe()부분이 선언부
	//  {  }부분이 구현부
	//	void breathe(){
	//		
	//	}
	//  구현부가 없는 메서드를 추상메서드라 함
	
	
	//추상(abstract) 메서드: 추상이라는 뜻은 구체화되지 않았다는 뜻이므로 메서드는 메소드이나 선언부가 있는 메소드가 추상메소드
	
	abstract void sound();
	

}
