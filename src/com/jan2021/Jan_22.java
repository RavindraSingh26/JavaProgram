package com.jan2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SingletonJan22{
	
	private static SingletonJan22 instance;
	
	private SingletonJan22() {
		
	}
	
	public static SingletonJan22 getInstance() {
		
		if(instance == null) {
			synchronized (SingletonJan22.class) {
				if(instance == null) {
					System.out.println("SingleTon class");
					instance = new SingletonJan22();
				}
			}
		}
		return null;
	}
}

//Factory Pattern.
interface FactInterfaceJan22{
	
	public void getList();
}

class FactInterfaceJan22A implements FactInterfaceJan22{

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(111);
		list1.addAll(list);
	}
}
class FactInterfaceJan22B implements FactInterfaceJan22{

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		Map<String, List<Integer>> map = new HashMap<>();
		map.put("Hello", list);
	}
	
}

class FactMainJan22{
	
	public FactInterfaceJan22 getFact(String str) {
		
		if(str == null) {
			return null;
		}else if(str.equalsIgnoreCase("A")) {
			return new FactInterfaceJan22A();
		}else if(str.equalsIgnoreCase("B")) {
			return new FactInterfaceJan22A();
		}
		return null;
	}
}
//OpenClosed Principle
class OpenCloseMain {
	
	public void com(FactInterfaceJan22A onj) {
		
		onj.getList();
	}
}

public class Jan_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonJan22 objSingletonJan22 = null;
		objSingletonJan22.getInstance();
		
	}

}
