package com.feb2021;

import java.util.HashMap;
import java.util.Map;

interface A {

	public void demo();
}

interface B {

	public void demo();
}

class C implements A, B {

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("Inside C");
	}

}

class D {

	public void str(String s) throws Exception {
		System.out.println(s);
	}
}

class E extends D {

	@Override
	public void str(String s) {
		System.out.println(s);
	}
	
	public void ffff() {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("AA", 101);
		
		for(Map.Entry<String, Integer> mm : map.entrySet()) {
			
			System.out.println(mm.getKey());
			System.out.println(mm.getValue());
		}
	}
	
	public void ffff(String s) {
		
	}
	public void ffff(int s) {
		
	}
}

class F extends D {

	@Override
	public void str(String s) throws RuntimeException {

	}

}

class H extends D {

	@Override
	public void str(String s) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SSS  ..." + s);
	}
}

public class Class_6_Feb {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		C obj = new C();

		obj.demo();

		E e = new E();
		e.str(null);

		D d = new D();
		D dd = new F();
		dd.str(null);

		D ggg = new H();
		ggg.str("Hello");
	}

}

class VolatileData {
	private volatile int counter = 0;

	public int getCounter() {
		return counter;
	}

	public void increaseCounter() {
		++counter; // increases the value of counter by 1
	}
}