package Human14;

public class ShapeExam {

	public static void main(String[] args) {
		Shape circle = new Circle(5.0);
		System.out.printf("원의 넓이는 %f입니다. \n",circle.calcarea());
		
		Shape rect = new RectAngle(3,4);
		System.out.printf("사각형의 넓이는 %f입니다. \n",rect.calcarea());
		
	}

}
