package com.july;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

interface InterfaceAA {

	default void setData() {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ABS", 101);
		map.put("ABS1", 1012);
		map.put("ABS2", 1013);
		map.put("ABS3", 1014);
		map.put("ABS", 101);
		map.put("ABS", 101);

		List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();

		list.add(map);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

	default void setDataMap() {

		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("ABS", 101);
		map.put("ABS1", 1012);
		map.put("ABS2", 1013);
		map.put("ABS3", 1014);
		map.put("ABS", 101);
		map.put("ABS", 101);

	}

	static void dis() {
		System.out.println("Static method");
	}

	static void disA() {
		System.out.println("Static method A");
	}

}

class AOverLoad {

	public void A() {

		System.out.println("-----A-------");
	}

	public void A1() throws Exception {

		System.out.println("-----AException-------");
	}
	
	public void A11() {

		System.out.println("-----AException-------");
	}
}

class BOberLoad extends AOverLoad {

	public void A() {

		System.out.println("------------B----A");
	}

	public void A1(){

		System.out.println("-----AException-------");
	}
	
	public void A11() throws ArithmeticException {

		System.out.println("-----AException-------");
	}

}

public class Class_24 implements InterfaceAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class_24 obj = new Class_24();
		obj.setData();

		AOverLoad o = new AOverLoad();
		o.A();
		AOverLoad b = new BOberLoad();
		b.A();
	}

}
