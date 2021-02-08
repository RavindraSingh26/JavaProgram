package com.june;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Sin{
	private static String instance;

	private Sin(){
		
	}
	public static String getInstance() {
		if(instance == null){
			synchronized (Sin.class) {
				
				if(instance == null){
					return instance;
				}
			}
		}
		return instance;
	}
	
}
final class ImuDemo{
	
	private final String name;
	private final String add;
	
	
	public ImuDemo(String name, String add) {
		super();
		this.name = name;
		this.add = add;
	}
	
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	
}

interface Comparable<T> {
	public int compareTo(T o);
}

class GenericDemo<T> implements Comparable {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class TestSeri implements Serializable, Comparable, Comparator<String>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private transient int data;
	public void test(){
		
		List<String> list = new ArrayList();
		list.add("AA");
		list.add("AA");
		list.add("AA");
		list.add("AA");
		list.add("AA");
		Map<List<String>, Integer> map = new HashMap();
		
		map.put(list, 1100);
		System.out.println("Map " + map);
	}
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class ExtendSer extends TestSeri {
	
}
public class Class_15_to_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		list.add("abc");
		list.add(new Integer(5));
		GenericDemo<String> obj = new GenericDemo<String>();
		obj.setT("Ravindra");
		System.out.println(obj.getT());

		GenericDemo type1 = new GenericDemo(); // raw type
		type1.setT("Pankaj"); // valid
		type1.setT(10); // valid and autoboxing support

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		printArray(intArray); // pass an Integer array

		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray); // pass a Double array

		System.out.println("\nArray characterArray contains:");
		printArray(charArray); // pass a Character array
		
		List<Integer> ints = new ArrayList<>();
		ints.add(3); ints.add(5); ints.add(10);
		double sum = sum(ints);
		System.out.println("Sum of ints="+sum);
		
		ImuDemo o = new ImuDemo("Ravi","Data");
		o.toString();
		
		String str = new String("Hello"); // Two Object one is Heap and Other is pool
		String ss = "HHH"; // String Literal
		
		if(str.equals("Hello")){
			System.out.println("True");
		}
		if(str.equals(ss)){
			System.out.println("false");
		}
	}

	public static <E> void printArray(E[] inputArray) {
		// Display array elements
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	
	public static double sum(List<? extends Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
}
