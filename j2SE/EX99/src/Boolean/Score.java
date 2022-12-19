package Boolean;

public class Score {

	public static void main(String[] args) {
		int[] arr = 
				{90,80,70,60,50};
	
		
		int sum = 0;
		int count = 0;
		double avg = 0.0;
		
		for(int a=0; a<arr.length; a++) {
				sum = sum+arr[a];
            	count++;  
				
		}
		
		
		avg= (double)sum/count;		//실수형으로 만들고 싶을때는 앞에다 더블을 붙여줘야함.
		
		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
	}

}
