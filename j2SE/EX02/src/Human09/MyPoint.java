package Human09;

public class MyPoint {
	public int x;
	public int y;
	
	public MyPoint(int x, int y){
		this.x = x;
		this.y = y;
		
	}

	
	public double getDistance(int i, int j) {
		double dist;
		int a, b;
		a = this.x - i;
		b= this.y - j;
		
		dist = 	Math.sqrt(a*a + b*b); //math.sqrt()가 루트라는 뜻
		return dist;
	}
	
	
}
