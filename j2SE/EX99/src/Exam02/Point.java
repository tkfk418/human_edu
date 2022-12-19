package Exam02;

public class Point {

	private int x,y;
	public String color;
	
	public Point(int x,int y,String color) {
		this.x=x; 
		this.y=y;
		this.color=color;
		}
	public int getX() {
		return x;
		}
	public int getY() {
		return y;
		}

	protected void move(int x, int y) {
		this.x=x; this.y=y;
		}
	
}
