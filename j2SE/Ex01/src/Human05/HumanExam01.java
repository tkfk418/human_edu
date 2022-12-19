package Human05;

import java.util.Scanner;

public class HumanExam01 {

	public static void main(String[] args) {
		// 입력을 a = 5 ; 
		// 5단을 출력하는 프로그램 만들어보기 
		
		// int a = 5;
		// for (int 1~9)
		//System.out.println()
		int a;
		System.out.print("몇단을 출력할까요?");		
		Scanner sc = new Scanner (System.in); //Scanner 객체 생성4	
		
		a = sc.nextInt();
		sc.close();	//Scanner 객체 소멸. sc가 더이상 필요 없을 때 쓰면 됨. 
		
		for (int b=1; b<=9; b++) {
			
			System.out.printf("%d X %d= %d \n", a, b, a*b);
			
			
		}
		
		
	}

}
