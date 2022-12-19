package Human05;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car(new Htire(),new Htire(),new Ktire(),new Ktire());
		car.run();
		System.out.println("--------------------");
		car.frontLeftTire = new Htire();
		car.run();
		
	}

}
