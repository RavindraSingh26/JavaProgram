/**
 * 
 */
package com.june;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

/**
 * @author ravindra.singh02
 *
 */
abstract class AA {

	public AA() {
		super();
		// TODO Auto-generated constructor stub
	}

	abstract void test();
}

class BB extends AA {

	@Override
	void test() {
		// TODO Auto-generated method stub

	}

}

class abcaa implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient int data;
	private volatile int num;
	List<Object> ll = new ArrayList<Object>();

	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		abcaa other = (abcaa) obj;
		if (data != other.data)
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data;
		result = prime * result + num;
		return result;
	}
}

class June10to14 implements JuneInterface_10_to_14, Callable<String>, Runnable {

	@Override
	public List<Integer> getSecondNumber() {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(121);
		list.add(122);
		list.add(123);
		list.add(12);

		System.out.println(list.get(list.size() - 3));
		return list;
	}

	@Override
	public List<Integer> removeDuplicate() {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(121);
		list.add(122);
		list.add(123);
		list.add(12);

		Set<Integer> ss = new LinkedHashSet<Integer>(list);
		System.out.println(ss);
		return list;
	}

	@Override
	public List<Integer> addListOther() {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(121);
		list.add(122);
		list.add(123);
		list.add(12);
		List<Integer> listAdd = new ArrayList<Integer>();
		listAdd.add(8000);
		listAdd.addAll(list);
		
		ArrayList<String> fruitBasket = new ArrayList<>();
	    fruitBasket.add("Apple");
	    fruitBasket.add("Banana");
	    fruitBasket.add("Grapes");
	    fruitBasket.add("Orange");
	    System.out.println(fruitBasket);

	    Collections.swap(fruitBasket, 1, 3);
	    System.out.println(fruitBasket);

		return listAdd;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Ravindra";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 4; i++) {
			System.out.println(Thread.currentThread());
		}
	}

	@Override
	public Map<Integer, String> iterateHasMap() {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "AC");
		map.put(3, "AD");
		map.put(4, "2");
		map.put(5, "1");

		for (Map.Entry<Integer, String> mm : map.entrySet()) {

			System.out.println("Key : " + mm.getKey());
			System.out.println("Value : " + mm.getValue());
		}
		return map;
	}

	@Override
	public List<String> sortList() {
		List<String> list = new ArrayList<String>();
		list.add("12");
		list.add("121");
		list.add("122");
		list.add("123");
		list.add("12");

		Collections.sort(list);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		return list;
	}

	@Override
	public Map<Integer, String> sortMapKeyandValue() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "AC");
		map.put(3, "AD");
		map.put(4, "2");
		map.put(5, "1");

		for (Map.Entry<Integer, String> mm : map.entrySet()) {

			System.out.println("Key : " + mm.getKey());
			System.out.println("Value : " + mm.getValue());
		}
		return map;
	}

}

public class June_10_to_14 {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		June10to14 objJune10to14 = new June10to14();
		System.out.println("List : " + objJune10to14.getSecondNumber());
		System.out.println("Remove Duplicate : " + objJune10to14.removeDuplicate());
		System.out.println("Add in List : " + objJune10to14.addListOther());

		System.out.println("Call Methid of Callable : " + objJune10to14.call());

		List<Integer> numbers = Arrays.asList(1, 2, 2, 2, 3, 5);

		System.out.println(numbers);

		List<Integer> removedDuplicates = numbers.stream().distinct().collect(Collectors.toList());

		System.out.println(removedDuplicates);

		String[] arr1 = { "Cat", "Dog", "Mouse" };
		Integer[] arr2 = { 1, 2, 3 };

		June_10_to_14.printItems(arr1); // "Cat", "Dog", "Mouse"
		June_10_to_14.printItems(arr2); // 1, 2, 3

		GenericClass<String> gc1 = new GenericClass<>();
		gc1.setItem("hello");
		String item1 = gc1.getItem(); // "hello"
		// gc1.setItem(new Object()); //Error

		GenericClass<Integer> gc2 = new GenericClass<>();
		gc2.setItem(new Integer(1));
		Integer item2 = gc2.getItem(); // 1
		// gc2.setItem("hello"); //Error

		List<String> list = new ArrayList<String>();
		list.add("hey");
		// list.add(new Object());

		for (int i = 0; i < list.size(); i++) {
			String value = (String) list.get(i); // CastClassException when i=1
		}

		ArrayList<String> listofcountries = new ArrayList<String>();
		listofcountries.add("India");
		listofcountries.add("US");
		listofcountries.add("China");
		listofcountries.add("Denmark");

		/* Unsorted List */
		System.out.println("Before Sorting:");
		for (String counter : listofcountries) {
			System.out.println(counter);
		}

		/* Sort statement */
		Collections.sort(listofcountries);

		/* Sorted List */
		System.out.println("After Sorting:");
		for (String counter : listofcountries) {
			System.out.println(counter);
		}

		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(11);
		arraylist.add(2);
		arraylist.add(7);
		arraylist.add(3);
		/* ArrayList before the sorting */
		System.out.println("Before Sorting:");
		for (int counter : arraylist) {
			System.out.println(counter);
		}

		/* Sorting of arraylist using Collections.sort */
		Collections.sort(arraylist);

		/* ArrayList after sorting */
		System.out.println("After Sorting:");
		for (int counter : arraylist) {
			System.out.println(counter);
		}

		ArrayList<String> fruitBasket = new ArrayList<>();
		fruitBasket.add("Apple");
		fruitBasket.add("Banana");
		fruitBasket.add("Grapes");
		fruitBasket.add("Orange");
		fruitBasket.add(2, "Ravindra");
		System.out.println(fruitBasket);

		for (int i = 0; i < fruitBasket.size(); i++) {
			System.out.println(fruitBasket.get(i));
		}
		
		for(String str : fruitBasket){
			
			System.out.println("==============" + str);
		}

		System.out.println(fruitBasket.get(2));
		System.out.println(fruitBasket.remove(1));
		
		Collections.shuffle(fruitBasket);
		System.out.println(fruitBasket);
		
		Collections.reverse(fruitBasket);
	    System.out.println(fruitBasket);

	}

	public static <T> void printItems(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

class GenericClass<T> {
	private T item;

	public void setItem(T item) {
		this.item = item;
	}

	public T getItem() {
		return this.item;
	}
}