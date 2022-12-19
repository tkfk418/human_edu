package Human07;

public class HumanExam04 {

	public static void main(String[] args) {
		int max = 0;	//max값을 구할때는 작은 수를 설정해야 함 ex)-9999
		int[] arr = {1,5,3,8,2};
		
		for (int a= 0; a<arr.length; a++) {
			
			if (max< arr[a]) {
			max=arr[a];
				
				
			}
		
		}
		
		
		
		
		System.out.println("max:" + max);

	}

}
