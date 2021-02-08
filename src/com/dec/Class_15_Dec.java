package com.dec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 1. Interface
 * 2. Opps Concept
 * 3. Collection
 * 4. Threading
 * 5. Exceeption
 */

interface Dec15A{
	
	public void getCollection();
	
	default void streamdataA() { // non abstract method......
		
		List<String> list = Arrays.asList("A","B","C","D","E");
		List<String> fil = list.stream().filter(ss -> !ss.isEmpty()).collect(Collectors.toList());
		
		System.out.println(fil);
		
		List<String> ll = new ArrayList<String>();
		ll.add("AA");
		ll.add("AA");
		ll.add("AA");
		ll.add("AA");
		ll.add("AA");
		ll.add("AA");
		
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
}

interface Dec15B{
	
	public void getStream();  //abstract method.....
	
	default void streamdata() { // non abstract method......
		
		List<String> list = Arrays.asList("A","B","C","D","E");
		List<String> fil = list.stream().filter(ss -> !ss.isEmpty()).collect(Collectors.toList());
		
		System.out.println(fil);
		
		//odd number Print
		List<Integer> oddInteger = Arrays.asList(1,0,2,4,6,9,7,6,5,4,5);
		List<Integer> printOdd = oddInteger.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
		System.out.println(printOdd);
		
		//Even Number Print
		List<Integer> evenInteger = Arrays.asList(1,0,2,4,6,9,7,6,5,4,5);
		List<Integer> even = evenInteger.stream().filter(n -> n %2 == 0).collect(Collectors.toList());
		System.out.println(even);
	}
}

public class Class_15_Dec implements Dec15B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class_15_Dec objClass_15_Dec = new Class_15_Dec();
		
		objClass_15_Dec.streamdata();
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		
		
	}

	@Override
	public void getStream() {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("AA", 1);
		map.put("AA", 1);
		map.put("AA", 1);
		map.put("AA", 1);
		map.put("AA", 1);
		
		for (Map.Entry<String, Integer> iterable_element : map.entrySet()) {
			
			System.out.println(iterable_element.getValue());
			
		}
	}

}
