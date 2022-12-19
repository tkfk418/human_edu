package Human05;

public class HumanExam05 {

	public static void main(String[] args) {
		// 홀수 단만 출력할 수 있도록.
		int a, b;
		for ( a=1; a<=9; a++) {
			if (a %2==1) {
			System.out.printf("%d 단 입니다. \n", a);

			for ( b=1; b<=9; b=b+1) {
			if (b %2==1) //중괄호로 블럭을 만들 부분이 1줄인 경우는 생략 가능함.
					System.out.printf("%d X %d= %d \n", a, b, a*b);	
				
			}
			System.out.println("------------------");	
			}
			
			}
	}

}
