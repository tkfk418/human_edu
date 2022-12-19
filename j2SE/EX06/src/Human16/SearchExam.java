package Human16;

import java.util.Arrays;

public class SearchExam {

	public static void main(String[] args) {
		int index =99;
		int[] scores = {99,97,98};
		index = Arrays.binarySearch(scores, 99);
		System.out.println(index); //binarySearch는 배열안에서 내가 정의한 수치가 몇번째 수치이냐
		//binarySearch를 쓰기위해서는 우선적으로 정렬이 필요함

		
		
		
		Arrays.sort(scores);
		index = Arrays.binarySearch(scores, 99);
		System.out.println(index); //2가 도출됨. 정렬후 (97,98,99)로 변환되고 99는 3번째 이므로

		String [] names= {"홍길동","박동수","김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println(index);
	
	
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		
		Member[] members= {m1,m2,m3};
		Arrays.sort(members);
		
		index=Arrays.binarySearch(members, m2);
		System.out.println(index);
	
	}

}
