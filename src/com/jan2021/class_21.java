package com.jan2021;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class Immmm{
	
	final private String name;

	
	public Immmm(String name) {
		
		this.name = name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}

//Singleton
class SingleJan21{
	
	private static SingleJan21 instance;
	private SingleJan21() {
		
	}
	
	public static SingleJan21 getInstance() {
		
		if(instance == null) {
			synchronized (SingleJan21.class) {
				
				if(instance == null) {
					instance = new SingleJan21();
				}
				
			}
		}
		return null;
	}
}
//OpenClosed
interface OpenCloseInterface21{
	
	public void getList();
}

class JanOpenA implements OpenCloseInterface21{

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		
	}
	
}
class JanOpenB implements OpenCloseInterface21{

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		
	}
	
}

class OpenCloseMainJan21{
	
	public void getDataOpen(OpenCloseInterface21 obj) {
		
		if(obj == null) {
			throw new InvalidParameterException("Hello");
		}
		obj.getList();
	}
	
}
//Factory
interface Fact21{
	
	public void getList();
}

class Jan21A implements Fact21{

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("A", 1001);
		map.put("b", 1002);
		map.put("c", 1003);
		map.put("d", 1004);
		map.put("e", 1005);
		
		for(Map.Entry<String, Integer> mm : map.entrySet()) {
			
			System.out.println(mm.getKey());
			System.out.println(mm.getValue());
		}
		
	}
	
}

class Jan21B implements Fact21{

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("ASD");
		list.add("ASD1");
		list.add("ASD2");
		list.add("ASD3");
		list.add("ASD");
		
		for(String str : list) {
			System.out.println("List : " + str);
		}
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}

class FactMainJan21{
	
	public Fact21 getList(String str) {
		
		if(str == null) {
			return null;
		}else if(str.equalsIgnoreCase("A")) {
		
			return new Jan21A();
		}else if(str.equalsIgnoreCase("B")) {
			return new Jan21B();
		}
		return null;
	}
}
public class class_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactMainJan21 obj = new FactMainJan21();
		Fact21 ooo = obj.getList("A");
		ooo.getList();
	}

}
