package Human02_2;

public class Hybride extends Car {
	int elec; //hybride에서 전기를 담당하고 있기에 int로 선언해준것임.
	public Hybride() {
		super();
		System.out.println("Hybride() 생성");
	}
	public Hybride(int elec) {
		super();
		this.elec=elec;
		
		System.out.printf("Hybride(%d) 생성\n ", elec);
	}
	public Hybride(int elec, int oil) {
		super(oil);
		this.elec=elec;
		System.out.printf("Hybride(%d,%d) 생성\n ", elec,oil);
	}
	public Hybride(int elec, int oil,int speed) {
		super(oil,speed);
		this.elec=elec;
		System.out.printf("Hybride(%d,%d,%d) 생성\n ", elec,oil,speed);
	}

}
