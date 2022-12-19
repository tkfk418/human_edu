package Boolean;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomExam {

	public static void main(String[] args) {
		long seed1; 
		seed1 = System.currentTimeMillis();
		
		int [] selectNum1 = new int[6];
		Random r1 = new Random(seed1);
		
		System.out.print("당첨번호 : ");
		for (int i=0; i<selectNum1.length; i++) {
			selectNum1[i] = r1.nextInt(45)+1; //1~45사이의 수
			
		System.out.printf("%d " ,selectNum1[i] );
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~45사이의 정수 6개를 입력하세요 \n");
		int [] selectNum2 = new int[6]; 
		for (int i=0; i<selectNum2.length; i++) {
			selectNum2[i] =sc.nextInt();
		}
		for(int i=0; i<selectNum2.length; i++) {
			System.out.print("선택번호 : "+selectNum2[i]+"\t");
		}
		System.out.println();
		System.out.println("----------------");
		
		Arrays.sort(selectNum1);
		Arrays.sort(selectNum2);
		//오름차순으로 정렬
		boolean result = Arrays.equals(selectNum1, selectNum2);
		System.out.print("당첨여부: ");
		if(result) {
			System.out.println("당첨되었습니다");
		}
		else {
			System.out.println("당첨되지 못했습니다");
		}
		
		
	}

}
