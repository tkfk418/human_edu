package Exam04;

public class PositivePoint extends Point{
	int z;
	public PositivePoint( ) {
		super(0, 0);
	}
	public PositivePoint(int x,int y) {
		super(x, y);
		if(x<0||y<0) {
			super.move(0, 0);
		}
	}
	
	public String toString() {
		return "("+getX() + "," + getY() +")의 점";
	}
	public void move(int x, int y) {
		if (x>0 && y>0) {
			super.move(x, y);
		}
		else {
		}
	}
	
}
