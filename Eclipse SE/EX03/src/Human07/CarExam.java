package Human07;

public class CarExam {

	public static void main(String[] args) {
		int money = 0;
		
		Car car1 = new Bus(); //자동타입변환
		money = car1.getCharge(); // money = 1450

		Car car2 = new Taxi(); //자동타입변환
		money = car2.getCharge(); // money =8000
		
		
		System.out.println(car1 instanceof Bus);
		System.out.println(car2 instanceof Bus);
		
		if(car1 instanceof Bus) { // 객체타입체크.car1이 bus에 소속되어 있느냐
			
			Bus bus1 = (Bus) car1;
			bus1.busRun();		
			}
		else {
			System.out.println("변환할 수 없습니다");
		}
		
		
if(car1 instanceof Taxi) {
			
	Taxi taxi1 = (Taxi) car2;
	taxi1.taxiRun();	
	}
		else {
			System.out.println("변환할 수 없습니다");
		}
		
if(car2 instanceof Bus) {
	
	Bus bus2 = (Bus) car2;
	bus2.busRun();		
	}
		else {
			System.out.println("변환할 수 없습니다");
		}
		
				
		
		
	}

}
