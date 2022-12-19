package Human15;

public class Car {

	public final String company = "현대";
	public final String carId;
//	carid는 null상태였다가 한번은 지정가능함.
	public String model;
	
	public Car(String carId, String model) {
		this.carId = carId;
		this.model = model;
	}
	
}
