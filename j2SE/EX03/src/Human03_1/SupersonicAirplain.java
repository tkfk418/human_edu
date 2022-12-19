package Human03_1;

public class SupersonicAirplain extends Airplain{
	public static final int NORMAL =1;
	public static final int SUPERSONIC =2;
	
	public int flyMode = NORMAL;
	// 아래의 생성자는 생략 가능
	public SupersonicAirplain() {
		super();
	}
	@Override 
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다");
		}
		else { //부모가 가지고 있는 일반비행을 처리하고 싶음.
			super.fly();
		}
		
	}

}
