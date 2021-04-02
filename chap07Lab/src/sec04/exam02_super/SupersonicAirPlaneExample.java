package sec04.exam02_super;

public class SupersonicAirPlaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flymode = SupersonicAirplane.SUPERSONIC;
				sa.fly();
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.land();
		
		/* 실행 결과
		 이륙합니다.
		일반 비행합니다
		초음속 비행합니다.
		착륙합니다.
		 */
		
		
		
		
		
		
		
	}

}
