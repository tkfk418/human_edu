package human08;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(new Integer(80), "human1");
		tm.put(new Integer(70), "human2");
		tm.put(new Integer(99), "human3");
		tm.put(new Integer(90), "human4");
		
		System.out.println("firstEntry() key: "+tm.firstEntry().getKey());
		System.out.println("firstEntry() value: "+tm.firstEntry().getValue());
		System.out.println("------------------------------");
		
		System.out.println("lastEntry () key : " +tm.lastEntry().getKey());
		System.out.println("lastEntry () value : " +tm.lastEntry().getValue());
		System.out.println("------------------------------");
		
		System.out.println("lowerEntry () key : " +tm.lowerEntry(80).getKey());	//주어진 값을 포함하지 않는 작은 key의 값
		System.out.println("lowerEntry () value : " +tm.lowerEntry(80).getValue());
		System.out.println("------------------------------");
		
		System.out.println("higherEntry () key : " +tm.higherEntry(80).getKey());	//주어진 값을 포함하지 않는 큰 key의 값
		System.out.println("higherEntry () value : " +tm.higherEntry(80).getValue());
		System.out.println("------------------------------");
		
		System.out.println("floorEntry () key : " +tm.floorEntry(80).getKey());	//주어진 값과 동일한 값. 없으면 보다 작은 key의 값
		System.out.println("floorEntry () value : " +tm.floorEntry(80).getValue());
		System.out.println("------------------------------");
		
		System.out.println("ceilingEntry () key : " +tm.ceilingEntry(80).getKey());	//주어진 값과 동일한 값 없으면 보다 큰 key의 값
		System.out.println("ceilingEntry () value : " +tm.ceilingEntry(80).getValue());
		System.out.println("------------------------------");
		
		Map.Entry<Integer,String> me = null;
		NavigableMap<Integer,String>  descMap=tm.descendingMap();
		//descMap은 key 기준으로 정렬이 됨
		Set <Map.Entry<Integer,String>> descEntrySet = descMap.entrySet();
		// descEntrySet에는 map의 값을 key 기준으로 내림차순으로 정렬하되 결과는 set으로 처리함
		System.out.println("descEntrySet : " +descEntrySet);
		
		NavigableMap<Integer,String>  ascMap =descMap.descendingMap();
		Set <Map.Entry<Integer,String>> ascEntrySet = ascMap.entrySet();
		System.out.println("ascEntrySet : " +ascEntrySet);
		
		NavigableMap<Integer,String>  rangeMap =tm.subMap(80, true, 90, true);  // 지정된 두 개의 Key 사이에 있는 모든 Element가 담긴 NavigableMap을 반환
		
				System.out.println(" rangeMapSet : " + rangeMap);
	
		
		
		
		
		
		
		

	}

}
