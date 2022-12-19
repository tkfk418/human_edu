package Human18;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		 Calendar now = Calendar.getInstance();
		 
		// System.out.println(now);
		 System.out.println(now.toString());
		 
		 int year= now.get(Calendar.YEAR);
		 int month= now.get(Calendar.MONTH)+1;  //month는 0에서부터 시작 그래서 +1을 해줌
		 int day= now.get(Calendar.DAY_OF_MONTH);
		 int week= now.get(Calendar.DAY_OF_WEEK); //주중의 몇번째 일자
	
		 System.out.println(year);
		 System.out.println(month);
		 System.out.println(day);
		 System.out.println(week);
		 
		 String strWeek=null;
		 switch (week) { 
			 case Calendar.MONDAY: strWeek = "월"; 	//Calendar.MONDAY:2 static final로 2란 수치를 정의함
			 break;
			 
			 case Calendar.TUESDAY: strWeek = "화"; 	//static final로 3란 수치를 정의함
			 break;
			 case Calendar.WEDNESDAY: strWeek = "수"; 	// static final로 4란 수치를 정의함
			 break;
			 case Calendar.THURSDAY: strWeek = "목"; 	//static final로 5란 수치를 정의함
			 break;
			 case Calendar.FRIDAY: strWeek = "금"; 	//static final로 6란 수치를 정의함
			 break;
			 case Calendar.SATURDAY: strWeek = "토"; 	//static final로 7란 수치를 정의함
			 break;
			 case Calendar.SUNDAY: strWeek = "일"; 	//static final로 0란 수치를 정의함
			 break;
		 }
		 String strAmPm=null;
		 int amPm=now.get(Calendar.AM_PM);
		 if(amPm==Calendar.AM) {
			 strAmPm="오전";
		 }
		 else {
			 strAmPm="오후";
		 }
		 int hour = now.get(Calendar.HOUR); // 현재시간
		 int minute = now.get(Calendar.MINUTE); 
		 int second = now.get(Calendar.SECOND);
		 
		 System.out.printf("%d년도 %d월 %d일 %s요일 %s %d:%d:%d \n",year,month,day,strWeek,strAmPm,hour,minute,second);
	}

}
