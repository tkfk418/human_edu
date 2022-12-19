package Human09;

public class MyPointExam {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		double distance = p.getDistance(5,4);
		
		System.out.printf("2점사이의 거리는 %f \n",distance);

	}

}
