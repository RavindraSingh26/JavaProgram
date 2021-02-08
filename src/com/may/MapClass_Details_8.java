package com.may;

import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.bean.EmployeeBean;

//http://tutorials.jenkov.com/java-collections/map.html
class MapDetails implements Comparator<EmployeeBean>{
	
	public void getMapDetails(){
		//Create map
		Map mapA= new HashMap();
		mapA.put(null, null);
		Object value = mapA.get(null);
		
		System.out.println(value);
		mapA.put("D", null);
		Object value1 = mapA.get("D");
		System.out.println(value1);
		
		
		Date dd = new Date();
		//Generic Map
		Map<String, EmployeeBean> mapC = new HashMap<String,EmployeeBean>();
		mapC.put("Pune", new EmployeeBean("Ravindra","Singh","Digit",101,1184,null)); 
		mapC.put("Delhi", new EmployeeBean("Kunal","Singh","Digit",1011,15184,null)); 
		mapC.put("Ban", new EmployeeBean("Om","Singh","Digit",11201,1184,null)); 
		mapC.put("Ranchi", new EmployeeBean("Anjali","Singh","Digit",1201,11384,null)); 
		mapC.put("Tata", new EmployeeBean("Rahul","Singh","Digit",1401,11684,null)); 
		
		
		for(EmployeeBean emp : mapC.values()){
			System.out.println(emp.toString());
		}
		
		for(String emp : mapC.keySet()){
			System.out.println(emp.toString());
		}
		
		for(Map.Entry mm : mapC.entrySet()){
			
			EmployeeBean emp = (EmployeeBean) mm.getValue();
			System.out.println();
			System.out.println("===" + emp.getName());
		}
		
		Map<String, EmployeeBean> mapCopy = new HashMap<String,EmployeeBean>();
		mapCopy.put("aaa", new EmployeeBean("mapCopy","mapCopy","mapCopy",101,1184,null));
		mapCopy.putAll(mapC);
		
		for(EmployeeBean emp : mapCopy.values()){
			System.out.println(emp.toString());
		}
		
		//String value = mapC.getOrDefault("E", "default value");
	}

	@Override
	public int compare(EmployeeBean o1, EmployeeBean o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class MapClass_Details_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapDetails objMapDetails = new MapDetails();
		objMapDetails.getMapDetails();
		
		String str = "Hello";
		boolean str1 = str.equalsIgnoreCase("HELLO");
		System.out.println(str1);
		
		TreeMap mm = new TreeMap();
		mm.put("1", 123);
		mm.put("1", 123);
		mm.put("1", 123);
		mm.put("1", 123);
		mm.put("1", 123);
		
		for(Object str22 : mm.entrySet()){
			
			str22.toString();
		}
	}

}
