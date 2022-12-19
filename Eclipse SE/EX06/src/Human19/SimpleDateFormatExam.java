package Human19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExam {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(now));
	
		 sdf = new SimpleDateFormat("yyyy년 MM월 dd일  hh시 mm분 ss초");
			System.out.println(sdf.format(now));
			
			//오전 오후, 요일, 몇번째날
		 
			 sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
				System.out.println(sdf.format(now));
				//a는 오전 오후를 의미함
				
				 sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초 E요일");
					System.out.println(sdf.format(now));
				
					//D는 올해의 몇번째 날
					 sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초 E요일 오늘은 올해의 D번째 날");
						System.out.println(sdf.format(now));
						
						 sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초 E요일 오늘은 이번달의 d번째 날");
							System.out.println(sdf.format(now));
						
	}

}
