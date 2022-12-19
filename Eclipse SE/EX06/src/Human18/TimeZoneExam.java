package Human18;

import java.util.TimeZone;

public class TimeZoneExam {

	public static void main(String[] args) {
		String[] id=TimeZone.getAvailableIDs();
		for (String a : id){
			System.out.println(a);
		}
				
	}

}
