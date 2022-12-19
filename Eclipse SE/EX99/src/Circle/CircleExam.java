package Circle;

import java.util.Scanner;

public class CircleExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i = 0; i<c.length;i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i]=new Circle(x,y,radius);
		}
		for(int i =0;i<c.length;i++) {
				c[i].show();
		}
		double k = c[0].getArea();
		int maxPos = 0;
		for(int i =1 ; i<c.length ; i++) {
			if(c[i].getArea()>k) {
				k=c[i].getArea();
				maxPos = i;
		}
	}
		System.out.print("가장 큰 면적의 원은 : ");
		c[maxPos].show();
		sc.close();
}
}
