package Exam03;

public class Point3D extends Point{
	int z;
	public Point3D(int x, int y,int z ) {
		super(x, y);
		this.z=z;
	}
	public void moveUp() {
		z++;
	}
	public void moveDown() {
		z--;
	}
	public String toString() {
		return "("+getX() + "," + getY() +","+z+")의 점";
	}
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z=z;
	}
	
}
