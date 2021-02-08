package com.july;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

interface A {

	public void getMap();
}

class SuperOberLoad {

	private void getList() {

		Set<String> set = new HashSet<String>();
		set.add("ABAS");
		set.add("ABS");
		set.add("ABDDS");
		set.add("AB1S");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {

			String ss = itr.next();
			System.out.println("Set " + ss);
		}

		for (String ss : set) {

			System.out.println("Set " + ss);
		}

	}

	public void sound() {
		System.out.println("Animal is making a sound");
	}

	public void getLinkedList() throws Exception {

	}

	// Static Polymorphism
	void demo(int a) {
		System.out.println("a: " + a);
	}

	void demo(int a, int b) {
		System.out.println("a and b: " + a + "," + b);
	}

	double demo(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}

}

class SubClassExtends extends SuperOberLoad implements A {

	// Dynamic Polimorphism
	@Override
	public void getLinkedList() throws Exception {
		// TODO Auto-generated method stub
		super.getLinkedList();
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("SubCLass Method of sound method");
	}

	@Override
	public void getMap() {
		// TODO Auto-generated method stub

	}

}

public class Class_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperOberLoad obj = new SuperOberLoad();
		SubClassExtends obj1 = new SubClassExtends();
		obj.sound();
		obj1.sound();
		obj = obj1;
		obj1.sound();
		double result;
		obj.demo(10);
		obj.demo(10, 20);
		result = obj.demo(5.5);
		System.out.println("O/P : " + result);

		List names = Arrays.asList("Reflection", "Collection", "Stream");
		
	}

}
