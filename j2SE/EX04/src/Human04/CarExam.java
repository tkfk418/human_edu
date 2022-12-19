package Human04;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		System.out.println("--------------------");
		car.frontLeftTire = new Htire();
		car.run();
		
	}

}
