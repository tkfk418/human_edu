package Human09;

import java.util.Objects;

public class NullExam {

	public static void main(String[] args) {
		String str1 = "sun";
		String str2 = null;

		try {
		System.out.println(Objects.requireNonNull(str1));
		String name = Objects.requireNonNull(str2);
		//requireNonNull 메서드는 null데이터가 들어오면 강제로 NullPointerException 발생
		
		System.out.println(name);
		}
		catch(Exception ne){
			System.out.println(ne.getMessage());
			
		}
		
		try {
			
			String name = Objects.requireNonNull(str2,"null입니다");
			//requireNonNull 메서드는 null데이터가 들어오면 강제로 NullPointerException 발생
			
			System.out.println(name);
			}
			catch(Exception ne){
				System.out.println(ne.getMessage());
				
			}
		
		
		
		
		
		}

}
