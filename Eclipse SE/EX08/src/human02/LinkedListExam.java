package human02;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		List<String> list1=new LinkedList<String>();
		list1.add("data1");
		System.out.println(list1);
		list1.add("data2");
		System.out.println(list1);
		list1.add(0, "data0");
		System.out.println(list1);
		
		//LinkedList를 사용하는 첫번째 이유 : LinkedList만의 특정 메서드를 사용할 수 있음
		LinkedList<String> linkedList=new LinkedList<String>();		
		linkedList.add("휴먼");
		linkedList.addFirst("영등포");	// =linkedList.add(0,"영등포") 이것과 같은 개념
		System.out.println(linkedList);
		linkedList.addLast("센터");     //=linkedList.add(=linkedList.add(linkedList.size(),"센터") 이것과 같은 개념 
		System.out.println(linkedList);
		
		//LinkedList를 사용하는 두번째 이유 :
		
		
		
		
		
		
		
	}

}
