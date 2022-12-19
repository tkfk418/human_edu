package Human14;

public class Circle extends Shape {

	private double r;
	private static final double PI = 3.141592;
	
	Circle (double r){
		this.r = r;
	}
	@Override
	public double calcarea() {
		double area;
		area = PI*r*r;
		return area;
	}




	



}
