package Human14;

public class RectAngle extends Shape{
	private int width;
	private int height;
	public RectAngle (int width,int height){
		this.width=width;
		this.height = height;
	}
	
	
	@Override
	public double calcarea() {
	double area;
	area = this.width*this.height;
		return area;
	}


	



}
