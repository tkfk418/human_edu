package Boolean;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("초를 입력해주세요");
	int s = sc.nextInt();
	
	int h = s/3600;
	System.out.println(h);
	int m = (s%3600)/60;
	System.out.println(m);
	int se = s%60;
	System.out.println(se);
	
	System.out.println(h+"시간"+m+"분"+se+"초");

	}

}
