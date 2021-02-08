package com.aug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class PolyDemo {

	public void dis() {

		System.out.println("Sub CLass.....");
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("ABCM");
		list.add("ABCRAVI");
		list.add("ABC");

		/*List<String> ll = (List<String>) list.stream().filter(s -> s.equalsIgnoreCase("ABC"));
		System.out.println(ll);*/
		
		for(String str : list){
			
		}
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}

		
	}
}

class SubPoly extends PolyDemo {

	/*
	 * private void dis(){
	 * 
	 * }
	 */

	public void dis() {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(10);

		/*
		 * Integer sum = list.stream().filter(ss -> ss+ss).count();
		 * 
		 * System.out.println("Sum : " + sum);
		 */

		List<Integer> sum = list.stream().map(s -> s * s).collect(Collectors.toList());
		System.out.println(sum);
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());

		List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Ravindra");
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);

		List<String> lll = names.stream().sorted().collect(Collectors.toList());

		System.out.println(lll);

		// List of Integer...
		List<Integer> listInt = Arrays.asList(2, 4, 6, 86, 4);
		Set<Integer> set = listInt.stream().map(x -> x * x).collect(Collectors.toSet());

		System.out.println(set);

		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

		System.out.println(even);
	}

}

public class Class_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PolyDemo objPolyDemo = new PolyDemo();
		// objPolyDemo.dis();
		PolyDemo objPolyDemo1 = new SubPoly();

		objPolyDemo1.dis();

	}

}
