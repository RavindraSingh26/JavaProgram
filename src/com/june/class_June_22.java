package com.june;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/*
 * Immutable Class
 */

final class TestABcFinal{
	
	private final String name;
	private final String address;
	
	public TestABcFinal(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "TestABcFinal [name=" + name + ", address=" + address + "]";
	}

}
/*
 * Generic...
 */
class GenTest<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
		
}

class threadDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		
		for(String str : list){
			System.out.println(str);
		}
		
		
	}
	
}
public class class_June_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestABcFinal obj = new TestABcFinal("Ravindra","KK");
		System.out.println(obj.toString());
		
		GenTest obj1 = new GenTest<String>();
		obj1.setT("Generice Type class call here ...Ravindra");
		
		System.out.println(obj1.getT());
		
		synchronized (args) {
			
		}
		String str = "2020-06-22";
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 2);
		String newDate = sdf.format(c.getTime());  
		System.out.println("Date after Addition: "+newDate);
	}

}
