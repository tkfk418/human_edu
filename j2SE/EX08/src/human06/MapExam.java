package human06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer> ();
		//map 컬렉션 추가
		Integer a1 = map.put("sun", 10);
		Integer a2 =map.put("moon", 30);
		Integer a3 =map.put("star", 20);
		Integer a4 =map.put("star", 16);
		//a4에 해당하는 것은 Key가 동일하므로 원래의 key에 대입시킴
	
		//System.out.printf("a1(%d) ,a2(%d) ,a3(%d) \n" , a1,a2,a3);
		//검색의 기능
		System.out.println("map.size = " + map.size());
		System.out.println("star의 나이 :" +map.get("star"));
		boolean isEmpty=map.isEmpty();
		System.out.println(isEmpty);
		System.out.println("--------------------");
		boolean t1 = map.containsKey("sun"); 	//map 안에 key로서 존재하는가
		boolean t2 = map.containsValue(10);		//map 안에 value로서 존재하는가
		boolean t3 = map.containsKey("look");
		boolean t4 = map.containsValue("50");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
		System.out.println("--------------------");	
		
		Set<String> keyset = map.keySet(); //map에 있는 key 내용을 set의 형태로 추출함
		System.out.println(keyset);
		
		//key를 추출하여 각 key 별로 데이터를 추가로 추출하는 방법 
		
		Iterator<String> iter = keyset.iterator(); //map의 key값 기준으로 반복할 수 있는 환경 설정
		while (iter.hasNext()) {
			
			String key = iter.next();	//key를 추출하는 행위
			Integer value = map.get(key);	//key에 해당하는 value를 추출하는 행위
			System.out.printf("Key(%s) / Value(%d) \n ",key , value);
		}
		System.out.println("--------------------");
		map.remove("star");  //key를 기준으로 value까지 모두 지움
		iter = keyset.iterator(); //map의 key값 기준으로 반복할 수 있는 환경 설정
		while (iter.hasNext()) {
			
			String key = iter.next();	//key를 추출하는 행위
			Integer value = map.get(key);	//key에 해당하는 value를 추출하는 행위
			System.out.printf("Key(%s) / Value(%d) \n ",key , value);

		}
		System.out.println("--------------------");
		map.clear(); //map에 포함된 결과를 모두 지움
		iter = keyset.iterator(); //map의 key값 기준으로 반복할 수 있는 환경 설정
		while (iter.hasNext()) {
			
			String key = iter.next();	//key를 추출하는 행위
			Integer value = map.get(key);	//key에 해당하는 value를 추출하는 행위
			System.out.printf("Key(%s) / Value(%d) \n ",key , value);
		}
		
	}

}
