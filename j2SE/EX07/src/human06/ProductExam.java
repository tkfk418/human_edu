package human06;

public class ProductExam {

	public static void main(String[] args) {
			TV t1 = new TV("삼성","Galaxy tv",300,true);
			TV t2 = new TV("LG","G6",200,false);
		
			Product<TV,String> prod1= new Product<TV,String>();
			prod1.setType(t1);
			prod1.setModel("Smart tv");
			
			Product<TV,String> prod2= new Product<TV,String>();
			prod2.setType(t2);
			prod2.setModel("OLED TV");
			
			Car c1= new Car("현대","G70",300);
			Car c2= new Car("기아","K7",250);
			Product<Car,String> prod3= new Product<Car,String>();
			prod3.setType(c1);
			prod3.setModel("세단");
			
			TV z1 = prod1.getType();
			System.out.println("z1.company ==>"+z1.company);
			System.out.println("z1.name ==>"+z1.name);
			System.out.println("z1.maxChannel ==>"+z1.maxChannel);
			System.out.println("z1.isVoiceRecog ==>"+z1.isVoiceRecog);
			System.out.println("prod1.model ==>"+prod1.getModel());
			
			Car z3 = prod3.getType();
			System.out.println("z3.company ==>"+z3.company);
			System.out.println("z3.name ==>"+z3.name);
			System.out.println("z3.maxSpeed ==>"+z3.maxSpeed);
			System.out.println("prod3.model ==>"+prod3.getModel());
			
			
	}

}
