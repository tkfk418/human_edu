package Human13;

public class Bus extends Car {

	public Bus(int speed) {
		super(speed);

	}

	@Override
	public void speedUp() {
	currentSpeed++;
		
	}

	@Override
	public int getCharge() {
		System.out.println("버스요금 : 1450");
		return 1450;
	}

}
