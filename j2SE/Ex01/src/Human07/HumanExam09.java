package Human07;

import java.util.Scanner;

public class HumanExam09 {

	public static void main(String[] args) {
	    // 전역변수
	      boolean run = true;
	      int studentNum = 0;
	      int[] score = null; // 학생수에 따라서 방이 몇개가 들어갈지 정해지는데 아직 몇 명인지 몰라서 초기값을 써주는 것임.
	      
	      Scanner scanner = new Scanner(System.in);
	      
	      while (run) {
	         System.out.println ("---------------------");
	         System.out.println ("1.학생수 / 2.점수입력 / 3.점수리스트 / 4.분석 / 5.종료");
	         System.out.println ("---------------------");
	         System.out.print("선택 > ");
	         
	         int selectNo = scanner.nextInt();
	         
	         if (selectNo == 1) {
	            System.out.print("학생수 > ");
	            studentNum = scanner.nextInt();
	            score = new int[studentNum];	//위에서 null로 닫아버렸기에 new로 다시 참조 변수를 만들어줘야함.
	         }
	         else if(selectNo == 2) {
	        	
	            for (int x=0; x<studentNum; x++) {
	               System.out.printf("score [%d] = ", x);
	               score[x] = scanner.nextInt();
	            }
	         }
	         else if(selectNo == 3) {
	            for (int x=0; x<studentNum; x++) {
	               System.out.printf("score [%d] = %d \n", x, score[x]);
	            }
	         }
	         else if(selectNo == 4) {
	            int max = 0;      // 최대값을 구하기 위해서는 작은수부터 탐색이 필요함.
	            int min = 100;      // 최소값을 구하기 위해서는 큰수부터 탐색이 필요함.
	            int sum = 0;
	            for (int x=0; x<studentNum ; x++) {
	               if (max < score[x]) {
	                  max = score[x];
	               }
	               if (min > score[x]) {
	                  min = score[x];
	               }
	               sum = sum + score[x];
	            }
	            System.out.printf("MAX = %d \n", max);
	            System.out.printf("MIN = %d \n", min);
	            System.out.printf("SUM = %d \n", sum);
	            System.out.printf("avg = %f \n " , (double)sum/studentNum);
	         }
	         else if(selectNo == 5) {
	            run = false; // 또는 break;
	         }

	      }
	      System.out.println ("프로그램을 종료합니다.");
		scanner.close();
	}

		
}
