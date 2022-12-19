package Human18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());

		SimpleDateFormat sdf1= new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String str1=sdf1.format(now);
		System.out.println(str1);

		SimpleDateFormat sdf2= new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		String str2=sdf2.format(now);
		System.out.println(str2);
		
	}

}
