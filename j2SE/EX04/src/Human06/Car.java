package Human06;

public class Car {
//	Tire t1 = new Ktire();
	Tire [] tires = {new Ktire(),new Ktire(),new Ktire(),new Ktire()};
	//Tire[0] tires ={new Ktire();
	
		public void run() {
			for(int i=0; i<tires.length; i++) {
				System.out.printf("%d : ",i);
				tires[i].roll();
			}
		
		}
	

}
