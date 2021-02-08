package com.dec;

import java.beans.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;

interface Interface19 {

	public void getstreamDetails();
}

interface Interface20 {

	// Find out missing number between 1 to 20 or n number.

	public void getMissingNumber();
	default void sss() {
		
	}
	
	static void dddd() {
		
	}
}

interface Interface21 {

	public void getSetMapListDetails();
}

abstract class desAbstract21 {

	public desAbstract21() {

	}

	abstract void getMap();

	void getList() {

		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("A");
		list.add("A");
		list.add("A");
		list.add("A");

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}

class extendAbstr extends desAbstract21 {

	@Override
	void getMap() {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 123);
		map.put("B", 123);
		map.put("C", 123);
		map.put("D", 123);
		map.put("AE", 123);

		for (Map.Entry<String, Integer> mm : map.entrySet()) {

			System.out.println(mm.getKey());
			System.out.println(mm.getValue());
		}
	}

}

@FunctionalInterface
interface Test<A, B, C> {
	public C apply(A a, B b);

	default void printString() {
		System.out.println("softwaretestinghelp");
	}
}

class Dec19 implements Interface19 {

	@Override
	public void getstreamDetails() {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("A", "B", "C", "HH");
		List<String> ll = list.stream().collect(Collectors.toList());
		System.out.println(ll);

		List<String> llp = list.parallelStream().collect(Collectors.toList());
		System.out.println(llp);

		List<String> listp = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");

		listp.parallelStream().forEach(System.out::print);

		List<EmployeeDecBean> empList = Arrays.asList(new EmployeeDecBean("Ravi", "address", 12, 123));
		List<EmployeeDecBean> emp = empList.stream().sorted(Comparator.comparing(EmployeeDecBean::getAddress))
				.collect(Collectors.toList());
		System.out.println(emp);

		Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8).limit(6)
				/*
				 * limit is set to 6, hence it will print the numbers starting from 0 to 5
				 */
				.forEach(num -> System.out.print("\n" + num));

	}

}

class Dec20 implements Interface20 {

	@Override
	public void getMissingNumber() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sss() {
		// TODO Auto-generated method stub
		Interface20.super.sss();
	}
	
	private void dd() {
		// TODO Auto-generated method stub

	}
}

class Dec21 implements Interface21, Comparator<EmployeeDecBean>, Comparable<EmployeeDecBean> {

	@Override
	public void getSetMapListDetails() {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		List<String> listL = new LinkedList<String>();
		List<String> listV = new Vector<String>();
		
		Set<String> set = new HashSet<String>();
		Set<String> setL = new LinkedHashSet<String>();
		Set<String> setT = new TreeSet<String>();
		
		
		
	}

	@Override
	public int compareTo(EmployeeDecBean o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(EmployeeDecBean o1, EmployeeDecBean o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class TransientExample implements Serializable {
	transient int age;
	// serialize other fields
	private String name;
	private String address;
	// other code
}

class VolatileExmaple extends Thread {
	 volatile boolean isRunning = true;
	   public void run() {
	      long count=0;
	      while (isRunning) {
	         count++;
	      }
	      System.out.println("Thread terminated." + count);
	   }
}

public class Class_19_20_21 implements Serializable, Callable<String>, Cloneable, Runnable {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		VolatileExmaple t = new VolatileExmaple();
		t.start();
		Thread.sleep(2000);
		t.isRunning = false;
		t.join();
		System.out.println("isRunning set to " + t.isRunning);

		Transient abc;
		String a, b, c;
		MultiMap mMap = new MultiValueMap();
		mMap.put("a", "Hello there, It's a wonderful day");
		mMap.put("a", "nice to meet you");

		Set<String> keys = mMap.keySet();

		for (String key : keys) {
			System.out.println("Key = " + key);
			System.out.println("Values = " + mMap.get(key));
			a = String.valueOf(mMap.get(key));

			System.out.println("A : " + a);
		}

		mMap.put("b", "b=====Hello there, It's a wonderful day");
		mMap.put("b", "b======nice to meet you");

		mMap.put("c", "C data ===Hello there, It's a wonderful day");
		mMap.put("c", "C =====nice to meet you");

		// call the class Dec19

		Dec19 objDec19 = new Dec19();
		objDec19.getstreamDetails();

		// call the class Dec20

		// call the class Dec21

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
