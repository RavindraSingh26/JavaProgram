/**
 * 
 */
package com.may;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

import com.bean.EmployeeBean;

/**
 * @author ravindra.singh02
 *
 */
class CompleteMap implements Comparable<EmployeeBean>, Comparator<EmployeeBean>,Serializable, Cloneable,Runnable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void getTreeMap(){
		
		TreeMap tmap = new TreeMap();
		tmap.put("aa", 123);
		tmap.put("aa", 123);
		
		Set set = tmap.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		Map<String, String> map = new HashMap<>();

		map.put("one", "first");
		map.put("two", "second");
		map.put("three", "third");

		Stream<String> stream = map.keySet().stream();
		stream.forEach((value) -> {
		    System.out.println(value);
		});    
	}
	
	@Override
	public int compare(EmployeeBean arg0, EmployeeBean arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(EmployeeBean arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.class.getName());
	}
	
}
public class Class_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		CompleteMap objCompleteMap = new CompleteMap();
		objCompleteMap.getTreeMap();
		
		Map mapA = new HashMap();

		Map mapB = new TreeMap();
		Map<String, EmployeeBean> map = new HashMap<String, EmployeeBean>();
		
		map.put("key1", new EmployeeBean());
		map.put("key2", new EmployeeBean());
		map.put("key3", new EmployeeBean());
		
		Iterator iterator = map.keySet().iterator();

		while(iterator.hasNext()){
		  Object key   = iterator.next();
		  Object value = map.get(key);
		}
	
	}

}
