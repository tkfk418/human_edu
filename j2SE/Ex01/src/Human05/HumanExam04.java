package Human05;

public class HumanExam04 {

	public static void main(String[] args) {
		int a, b;
		a=1;
		
		while (a<=9) {
			System.out.printf("%d 단 입니다. \n", a);
			b=1;
		while (b<=9) {
			System.out.printf("%d X %d= %d \n", a, b, a*b);
			b++;
		}
		System.out.println("------------------");
		a++;
			}

}
}