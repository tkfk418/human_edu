package Human11;

public class BuyerExam {

	public static  void main(String[] args) {
		int tvPrice = 100;
		int computerPrice = 200;
		int audioPrice = 50;
		Buyer b1= new Buyer(1000);
		
		TV tv= new TV(tvPrice, "Tv");
		Computer computer = new Computer(computerPrice,"COMPUTER");
		Audio audio = new Audio(audioPrice,"AUDIO");
		
		
		b1.buy(tv);
		b1.buy(computer);
		b1.buy(tv);
		b1.buy(audio);
		b1.buy(computer);
		b1.buy(computer);
		b1.buy(computer);
		b1.summary();
		System.out.println("--------------");
		
		Buyer b2= new Buyer(500);
		b2.buy(tv);
		b2.buy(computer);
		b2.buy(tv);
		b2.buy(computer);
		b2.summary();
	}

}
