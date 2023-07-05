package genericEx2;

// Generic 타입으로 선언 // Type T
public class Box<T> {

	// 필
	T t;
	
	// 생
	public Box() {
		
	}
	
	// 메
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}

//	public T getObj() {
//		return t;
//	}
//	
//	public void setObj(T t) {
//		this.t = t;
//	}
	
}
