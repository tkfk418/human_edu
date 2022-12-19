package Human05;

import java.util.Scanner;

public class HumanExam10 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0; // 현재 내가 가지고 있는 잔고
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.예금: 2.출금 : 3. 잔고 : 4.종료");
			System.out.println("---------------------");
			System.out.print("선택> ");
			
			int choice = scanner.nextInt();
			switch(choice) {
				case 1: 
					System.out.print("예금액> ");
					int x = scanner.nextInt();
					balance = balance + x;
					break;
				case 2: 
					System.out.print("출금액> ");
					balance = balance - scanner.nextInt();
					break;
				case 3: 
					System.out.printf("잔고> %d \n",balance);
			
					break;
				case 4: 	//default를 넣게 되면 1~4까지 외의 다른 숫자가 들어오면 프로그램이 종료됨.
					run=false; 
					System.out.println("프로그램 종료");
				
					
					
			}
			

		}
		
		scanner.close();
		
	}

}
