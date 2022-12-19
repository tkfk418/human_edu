package Human15;

public class StringValueOfExam {

	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		//static메서드는 클래스 차원의 메서드이므로 String이라는 클래스로 메서드를 실행
		//str1="10"
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(false);
		//str3= "false"
		
		System.out.println(str1+str2);
	
		System.out.println(str1.getClass());
		System.out.println(str3.getClass());
		System.out.println(str3.substring(0,3));
	
	}

}
