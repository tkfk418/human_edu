package Human08;

public class Taxi implements Car{

	@Override
	public void run() {
		System.out.println("택시를 타고 출근합니다");	
	}
	public void checkFare() {
		System.out.println("택시승차요금을 비교합니다");
	}

}
