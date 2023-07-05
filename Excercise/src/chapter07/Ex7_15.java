package chapter07;


class Unit {}
class AirUnit extends Unit {}
class GroundUnit extends Unit {}
class Tank extends GroundUnit {}
class AirCraft extends AirUnit {}

public class Ex7_15 {

	public static void main(String[] args) {

		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		
		//각각 실행
//		u = (Unit)ac;
//		u = ac;
//	 	GroundUnit gu = (GroundUnit)u;
//        AirUnit au = ac;
		//조상인스턴스를 자손타입으로 형변환하는 것은 허용하지 않는다 참조변수 u는 
//		실제로 GroundUnit 인스턴스를 참조하고 있다  (Tank)u는 인스턴스를 GroundUnit 인스턴스를
//		자손 타입인 Tank로 형변환하는 것인데, 자손타입으로 형변환은 허용되지 않으므로 실행시 에러가 발
//		생한다
//        t = (Tank)u;
//        GroundUnit gu2 = t;

	}

}
