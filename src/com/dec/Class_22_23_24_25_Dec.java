package com.dec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

final class DecImm12 {

	final private String name;

	private DecImm12(String str) {

		this.name = str;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}

//Method overriding example
class ABS{
	
	public void getMap() {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("AA", 101);
		map.put("AA1", 101);
		map.put("AA2", 101);
		map.put("AA3", 101);
		
		for(Map.Entry<String, Integer> mm :map.entrySet()) {
			
			System.out.println(mm.getKey());
			System.out.println(mm.getValue());
		}
		
		Map<String,Integer> mapTree = new TreeMap<String,Integer>();
		
		Map<String,Integer> mapTable = new Hashtable<String,Integer>();
	}
	
}

class AUS extends ABS{
	
	
	@Override
	public void getMap() {
		// TODO Auto-generated method stub
		super.getMap();
	}
}

class X {
	public void c1() {
		System.out.println("X");
	}
}

class Y extends X {
	public void c1() {
		super.c1();
		System.out.println("Y");
	}
}

class Z extends Y {
	public void c1() {
		super.c1();
		System.out.println("Z");
	}
}

class Des23 {

	protected void display() {

	}
}

class Des23Extends extends Des23 {

	protected void display() {
		// TODO Auto-generated method stub
		super.display();
	}
}

/*
 * 
 * Main Class
 */
public class Class_22_23_24_25_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Z z = new Z();
		z.c1();

		int x = 5, y = 10;
		try {

			y /= x;
		} catch (Exception e) {
			System.out.println("error");
		} finally {
			System.out.println("Finally");
		}

		int xx;
		xx = 10;
		if (xx == 10) {
			int yy = 20;
			System.out.println("x and y : " + xx + " " + yy);
			yy = xx * 2;
		}
		// yy = 100; compiler error because yy is the local variable not acccess out
		// side
		test(99.9);
		double STATIC = 78.09;
		System.out.println(STATIC);
		int INTEGER = 90;
		char STRING = 'R';

		System.out.println(INTEGER);
		System.out.println(STRING);

		Class_22_23_24_25_Dec objClass_22_23_24_25_Dec1 = new Class_22_23_24_25_Dec();
		Class_22_23_24_25_Dec objClass_22_23_24_25_Dec2 = new Class_22_23_24_25_Dec();

		objClass_22_23_24_25_Dec1.c += 1;
		System.out.println(objClass_22_23_24_25_Dec1.c + objClass_22_23_24_25_Dec2.c);
		objClass_22_23_24_25_Dec1.d = 70;
		System.out.println(objClass_22_23_24_25_Dec1.d);
		System.out.println(objClass_22_23_24_25_Dec2.d);

		streamdemo();

		// Sorting the List of the method based on the sal.
		EmpDec e1 = new EmpDec("OM", 1001);
		EmpDec e2 = new EmpDec("Laddo1", 1004);
		EmpDec e3 = new EmpDec("Laddo2", 1002);
		EmpDec e4 = new EmpDec("Laddo3", 10);
		EmpDec e5 = new EmpDec("Laddo4", 100198);

		List<EmpDec> l1 = new ArrayList<EmpDec>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);

		Collections.sort(l1, new EmpDec());

		Iterator<EmpDec> itr = l1.iterator();
		while (itr.hasNext()) {

			EmpDec ee = itr.next();
			System.out.println(ee.toString());
		}
		// display the unique data using the stream.
		System.out.println();
		System.out.println("Distinct in Stream");

		List<EmpDec> listEmp = Arrays.asList(new EmpDec("Ravindra", 100), new EmpDec("Kunal", 50000),
				new EmpDec("Ravindra", 100), new EmpDec("Kunal", 50000));
		List<EmpDec> listRes = listEmp.stream().collect(Collectors.toList());
		System.out.println(listRes.toString());
		System.out.println();

		List<EmpDec> listResDis = listEmp.stream().distinct().collect(Collectors.toList());
		System.out.println(listResDis.toString());
		System.out.println();

		Set<EmpDec> set = listEmp.stream()
				.collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(EmpDec::getName))));
		System.out.println(set.toString());
		System.out.println();

		int width = 10;

		// with lambda
		Drawable d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();

		addedNumber aa = (a, b) -> (a + b);
		System.out.println(aa.num(100, 200));

		List<String> list = new ArrayList<String>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");

		list.forEach((n) -> System.out.println(n));
	}

	int d = 34;
	static int c = 10;

	static void test(float x) {
		System.out.println(x);
	}

	static void test(double d) {

		System.out.println("double");
	}

	static void streamdemo() {

		List<String> list = Arrays.asList("A", "B", "G", "C", "X", "D");
		List<String> sortList = list.stream().sorted().collect(Collectors.toList());

		System.out.println(sortList);

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		// get list of unique squares
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println(squaresList);

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		// get count of empty string
		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println(count);

	}

	static void CompareData() {

		List<String> list = Arrays.asList("A", "B", "G", "C", "X", "D");
		List<String> sortList = list.stream().sorted().collect(Collectors.toList());

		System.out.println(sortList);
	}
}

class EmpDec implements Comparator<EmpDec>, Comparable<EmpDec>, Serializable, Callable<String>, Runnable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int sal;

	public transient int ddd;

	public EmpDec() {

	}

	public EmpDec(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
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

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {

			System.out.println(Thread.currentThread().getName());
		} catch (Exception e) {

		}

	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "String Call for Collabal method";
	}

	@Override
	public int compareTo(EmpDec arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(EmpDec arg0, EmpDec arg1) {
		// TODO Auto-generated method stub
		return arg0.getSal() - arg1.getSal();
	}

	@Override
	public String toString() {
		return "EmpDec [name=" + name + ", sal=" + sal + "]";
	}

}

class SalEmp implements Comparator<EmpDec> {

	@Override
	public int compare(EmpDec o1, EmpDec o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class NameEmp implements Comparable<EmpDec> {

	@Override
	public int compareTo(EmpDec o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

@FunctionalInterface // It is optional
interface Drawable {
	public void draw();
}

@FunctionalInterface
interface addedNumber {

	public int num(int a, int b);
}