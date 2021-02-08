package com.july;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;


abstract class AbstractionDemo {

	public void getHashSet() {

		Set<String> set = new HashSet<String>();
		set.add("ABS");
		set.add("ABA");
		set.add("ABD");
		set.add("ABC");
		set.add("ABA");

		System.out.println(set);
	}

	public abstract void getAbstract();
}

class ExtendsAbstract extends AbstractionDemo {

	ExtendsAbstract() {

	}

	@Override
	public void getAbstract() {
		// TODO Auto-generated method stub
		String s = "Ravindra";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
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

class SingleJuly1 implements Serializable, Runnable, Callable<String>{

	private static SingleJuly1 instance;

	private SingleJuly1() {

	}

	public static SingleJuly1 getInstance() {

		if (instance == null) {
			synchronized (SingleJuly1.class) {

				if (instance == null) {
					instance = new SingleJuly1();
				}
			}
		}
		return instance;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}

class GenericTest<T> {

	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}
}

public class Class_12_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtendsAbstract objExtendsAbstract = new ExtendsAbstract();
		objExtendsAbstract.getHashSet();
		objExtendsAbstract.getAbstract();

		Set<String> set = new HashSet<String>();
		Set<String> set1 = new LinkedHashSet<String>();
		Set<String> set2 = new TreeSet<String>();

		set.add("AB");
		set.add("ABC");
		set.add("ABA");
		set.add("ABDD");
		set.add("ABS");

		System.out.println(set);

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}

		Set<String> names = new HashSet<>();
		names.add("Tom");
		names.add("Mary");

		if (names.add("Peter")) {
			System.out.println("Peter is added to the set");
		}

		if (!names.add("Tom")) {
			System.out.println("Tom is already added to the set");
		}

		set2.add("AA");
		set2.add("AAC");
		set2.add("AAD");
		set2.add("AA4");
		set2.add("Ravi");
		set2.add("ASingh");
		set2.add("KIRAHA");
		set2.add("AA");
		// set2.add(null);

		Iterator<String> itr = set2.iterator();
		while (itr.hasNext()) {
			String na = itr.next();
			System.out.println(na);
		}

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 5, 4, 4, 3, 3, 22, 1, 1, 111, 2222, 6);
		System.out.println(list);
		Set<Integer> ss = new HashSet<Integer>(list);

		System.out.println("Unique : " + ss);

		Set<Integer> uniqueOddNumbers = list.stream().filter(number -> number % 2 != 0).collect(Collectors.toSet());

		System.out.println(uniqueOddNumbers);

		Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(8, 89));

		if (s1.containsAll(s2)) {
			System.out.println("s2 is a subset of s1");
		}

		Set<Integer> s11 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
		Set<Integer> s22 = new HashSet<>(Arrays.asList(2, 4, 6, 8));

		System.out.println("s1 before intersection: " + s11);

		s1.retainAll(s22);

		System.out.println("s1 after intersection: " + s11);
	}

	public void method1() {
		this.method2();
	}

	public void method2() {
		this.method1();
	}

	class TextEditor implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private SpellChecker checker;

		public TextEditor() {
			checker = new SpellChecker();
		}
	}

	class SpellChecker {

	}
}
