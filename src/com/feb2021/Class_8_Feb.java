package com.feb2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

class SingletonFeb8{
	
	private static SingletonFeb8 instance;
	
	private SingletonFeb8() {
		
	}
	
	public static SingletonFeb8 getInstance() {
		
		System.out.println("Call instance method..inside singlton");
		if(instance == null) {
			
			synchronized (SingletonFeb8.class) {
				
				if(instance == null) {
					instance = new SingletonFeb8();
				}
			}
		}
		return null;
	}
}

//SOLID : design patter(Open and close)
interface Feb8Interface{
	
	List<String> getList();
}

class A8 implements Feb8Interface{

	@Override
	public List<String> getList() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		List<String> list1 = new LinkedList();
		
		Set<String> list2 = new HashSet();
		return null;
	}
	
}
class B8 implements Feb8Interface{

	@Override
	public List<String> getList() {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("String","Ravi","Kumar"," Data",""," ");
		List<String> dup = (List<String>) list.stream().distinct();
		System.out.println(dup);
		Predicate<String> pre = s -> s.equalsIgnoreCase("Ravi");
		List<String> startwith = (List<String>) list.stream().filter(pre);
		return null;
	}
	
}
//Open for extention and close for modification
class closeModification{
	
	public void getOpenClose(Feb8Interface obj) {
	
		if(obj == null) {
			
		}
		obj.getList();
	}
	
}
//Main class here...
public class Class_8_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonFeb8 obj = SingletonFeb8.getInstance();
		System.out.println("Display : " + obj);
		
		B8 objCloseForModification = new B8();
		Feb8Interface oo = objCloseForModification;
		closeModification ll = new closeModification();
		ll.getOpenClose(oo);
		
		A8 aa = new A8();
		Feb8Interface kk = aa;
		ll.getOpenClose(kk);
	}

}
