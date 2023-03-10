package human02;

import java.util.LinkedList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		//List<String> list1 = new ArrayList<String>();
		List<String> list1 = new LinkedList<String>(); 
		//List는 인터페이스이고 ArrayList 및 LinkedList는 구현클래스 이므로 구현클래스를 상황에 맞추어 바꾸어도 시스템 동작의 결과에는 이상이 없음.
		//예를 들면 ArrayList로 구현해서 사용하고 있었으나 
		//데이터 삭제,추가가 빈번하여 속도상 이슈가 있으면 ArrayList를 LinkedList로 바꾸어도 무방하다
		
		list1.add("sun");
		list1.add("moon");
		System.out.println(list1);
		list1.add("a");	list1.add("a");	list1.add("a");	list1.add("a");	list1.add("a");	list1.add("a");
		list1.add("a");	list1.add("a");	list1.add("a");
		//list컬렉션은 초기용량보다 더 많은 add가 되면 스스로 증량을 해주는 기능이 있음.
		System.out.println(list1);
		list1.clear();	// 리스트안의 데이터를 모두 삭제함. 
		System.out.println(list1);
		
		
		list1.add("휴먼");
		list1.add("교육");
		list1.add("센터");
		boolean a1 = list1.add("휴먼");
		System.out.println(list1);
		System.out.println(a1);
		list1.add(1, "영등포"); //add에 인덱스를 추가할 경우 인덱스 위치에 내용을 추가하고 뒤의 내용은 한칸씩 미룬다
		System.out.println(list1);
		String isSet = list1.set(1, "천안"); //set은 특정위치에 데이터를 변경함. 되돌려주는 값은 변경이전의 값을 되돌려줌 
		System.out.println(list1);
		System.out.println("isSet :"+isSet); //영등포
		
		boolean isE1 = list1.isEmpty();
		//list1이 비어있으면 true 아니면 false
		System.out.println("list1.isEmpty() : "+isE1);
		int list1Lenghth=list1.size();
		System.out.println("list1.lenghth : "+list1Lenghth);
		
		String remove4=list1.remove(4);	//list의 인덱스 위치에서 객체를 삭제함
		System.out.println(list1);
		System.out.println("remove4: "+remove4);
		boolean isRemove1=list1.remove("천안");
		System.out.println(list1); 
		System.out.println("isRemove1: "+isRemove1);
		  
		
		
		
		
	}

}
