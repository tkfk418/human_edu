package Human07;

public class HumanExam05 {

	public static void main(String[] args) {
		int min = 100;	
		int[] arr = {1,5,3,8,2};
		
		for (int a= 0; a<arr.length; a++) {
			
			if (min> arr[a]) {
			min=arr[a];
				
				
			}
		
		}
		
		
		
		
		System.out.println("min:" + min);

	}

}
