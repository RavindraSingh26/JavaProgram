/**
 * 
 */
package com.may;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author ravindra.singh02
 *
 */

abstract  class AbstractDemo{
	
	public abstract void getList();
	
	public void getMap(){
		
		List<String> list = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("A6", 001);
		map.put("A5", 002);
		map.put("A4", 003);
		map.put("A3", 004);
		map.put("A2", 005);
		map.put("A1", 006);
		
		Set set = map.entrySet();
		Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
		for(Map.Entry m : map.entrySet()){
			
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		Map<String, List<String>> map1 = new HashMap<String,List<String>>();
		map1.put("R", list);
		
		
		String str = "1234,4567,555.666,777,87678,544345,5555";
		String str1 = "12034";
		if(str.contains(str1)){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}

class ExtendsAbstaract extends AbstractDemo{

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("12");
		list.add(11);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println("===" + itr.next());
			if(itr.equals(11)){
				
				System.out.println(" " + itr.next());
			}else{
				
				System.out.println(" " + itr.next());
			}
		}
	
		//List : ArrayList, LinkedList, vector.
		//Set : HashSet, TreeSet, SortedSet.LinkedHashSet
		//Comparator and Comparable
		//Generic, Thread,.....
		
	}
	
}
public class Class_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtendsAbstaract objExtendsAbstaract = new ExtendsAbstaract();
		objExtendsAbstaract.getMap();
		objExtendsAbstaract.getList();
	}

}
