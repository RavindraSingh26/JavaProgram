package com.sep;

import java.io.Serializable;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

interface sepinterface10{
	
	public List<String> getString();
	public List<String> getStreamList();
	
	public static String getdata() {
		
		String str = "Hi";
		String str1 = "Hi";
		String str2 = new String("Hi");
		String str3 = new String("Hi");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		System.out.println(str2.equals(str3));
		return str;
	}
	
	default void getDefault() {
		
		String str = "Ravindra";
		String rev = "";
		
		for(int i = str.length() - 1; i >= 0 ; i--) {
			
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Print the rever word : " + rev);
		
		System.out.println("Count the reapetation the word");
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
		  char c = str.charAt(i);
		  if (map.containsKey(c)) {
		    int cnt = map.get(c);
		    map.put(c, ++cnt);
		  } else {
		    map.put(c, 1);
		  }
		}
		System.out.println(map);
	}
}

class sep7 implements sepinterface10{

	@Override
	public List<String> getString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getStreamList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class sep8 implements sepinterface10{

	@Override
	public List<String> getString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getStreamList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

/*
 * open close principle declare here.....
 */
class OpenCLose {
	
	public void getOpenClose(sepinterface10 sepinterface10) {

		if (sepinterface10 == null) {
			throw new InvalidParameterException("Cannot perform operation");

		}
		sepinterface10.getStreamList();
	}
	
}


final class Immmm{
	
	private final String name;
	private final String name1;
	
	public Immmm(String name, String name1) {
		super();
		this.name = name;
		this.name1 = name1;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the name1
	 */
	public String getName1() {
		return name1;
	}
	
}

class DemoBean implements Serializable{
	
	private String name;
	private int sal;
	
	transient int num;
	
	

	public DemoBean(String name, int sal, int num) {
		super();
		this.name = name;
		this.sal = sal;
		this.num = num;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sal
	 */
	public int getSal() {
		return sal;
	}

	/**
	 * @param sal the sal to set
	 */
	public void setSal(int sal) {
		this.sal = sal;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sal;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DemoBean other = (DemoBean) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sal != other.sal)
			return false;
		return true;
	}
}

class SortSal implements Comparator<DemoBean>{

	@Override
	public int compare(DemoBean o1, DemoBean o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class SortName implements Comparable<DemoBean>{

	@Override
	public int compareTo(DemoBean o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
/*
 * 
 * Main class 
 */

public class class_7_8_9_sep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sepinterface10.getdata());
		
		String str = "Cumulative Bonus: 50% of each claim free year (max 100%)";
		String sunS = str.substring(18, 20);
		System.out.println(sunS);
		
		//sep8 a = new sepinterface10();
		sepinterface10.getdata();
		sep8 oo = new sep8();
		oo.getDefault();
		
		DemoBean d1 = new DemoBean("AAA", 101, 102);
		DemoBean d2 = new DemoBean("AAA", 101, 102);
		DemoBean d3 = new DemoBean("AAA", 101, 102);
		DemoBean d4 = new DemoBean("AAA", 101, 102);
		DemoBean d5 = new DemoBean("AAA", 101, 102);
		
		List<DemoBean> ll = new ArrayList<DemoBean>();
		ll.add(d1);
		ll.add(d2);
		ll.add(d3);
		ll.add(d4);
		ll.add(d5);
		
		List<DemoBean> list = Arrays.asList(new DemoBean("Ravindra", 100, 10000));
		
		List<DemoBean> list1 = list.stream().filter(i -> i.getName().equalsIgnoreCase("Ravindra")).collect(Collectors.toList());
		System.out.println(list1);
		
	}

}
