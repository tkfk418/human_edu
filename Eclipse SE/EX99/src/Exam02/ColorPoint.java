package Exam02;

public class ColorPoint extends Point {
	protected String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y,color);
//		this.color=color;
	}
	
	public void setXY(int a, int b) {
     super.move(a, b);
		
	}

	public void setColor(String color) {
		this.color = color;
	}


	public String toString() {
		return this.color +"색의("+ getX() + "," + getY() + ")의 점";

		
	}




}
