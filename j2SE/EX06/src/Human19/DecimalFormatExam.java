package Human19;

import java.text.DecimalFormat;

public class DecimalFormatExam {

	public static void main(String[] args) {
		double num = 1123456.789;
		DecimalFormat df = new DecimalFormat("0");	//소수점 반올림.
		System.out.println(df.format(num));
		 
		df = new DecimalFormat("0.0");	//소수점 둘째자리에서 반올림
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("0.00");	//소수점 셋째자리에서 반올림
		System.out.println(df.format(num)); 
		
		
		df = new DecimalFormat("0.000");	
		System.out.println(df.format(num)); 
		
		
		df = new DecimalFormat("0.0000");	
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("#");	//십진수 표시 
		System.out.println(df.format(num)); 
		
		
		df = new DecimalFormat("#.#");	//십진수 표시 .#은 소수점까지
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("+#.0");	
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("-#.0");   //화면에 표시만 음수일뿐 num이란 수치가 음수로 변환된것은 아님(단순히 기호만 앞에 붙음)	
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("#,###");	//1000단위 콤마 표시
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("0.00E0");	//1.12E6 ==> 1.12*10의 6승 
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("+#,### ; -#,###"); //양수이면 + 음수이면 -를 붙임	
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("#.#%");	 //%는 곱하기 100
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("\u00A4#,###");	//화폐 단위 중 원표시 : ₩ ==> \u00A4
		System.out.println(df.format(num)); 
		
		
		
	}

}
