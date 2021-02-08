package com.dec;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

interface Dec17 {

	public void getStreamExample();

	public void getWithOutStreamExample();

	default void reapeatNumberCount() {

		String str = "Ravindra";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				int cnt = map.get(c);
				map.put(c, ++cnt);
			} else {
				map.put(c, 1);
			}
		}

	}
}

class ThreadExample implements Runnable, Callable<String> {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName());
		}
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Callable");
		return "Hello Callable";
	}

}

public class Class_Dec_17 implements Dec17 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class_Dec_17 objClass_Dec_17 = new Class_Dec_17();
		objClass_Dec_17.getStreamExample();
		objClass_Dec_17.getWithOutStreamExample();
		objClass_Dec_17.reapeatNumberCount();
		ThreadExample objThreadExample = new ThreadExample();
		objThreadExample.run();
		objThreadExample.call();

	}

	@Override
	public void getStreamExample() {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("B", "C", "D", "A");
		List<String> sortList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sort List " + sortList);
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum = integers.stream().reduce(0, Integer::sum);
		System.out.println("Sum of the Number :" + sum);
	}

	@Override
	public void getWithOutStreamExample() {
		// TODO Auto-generated method stub

		List<String> ll = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");
		ll.parallelStream().forEach(System.out::print);
		ll.parallelStream().forEachOrdered(System.out::print);

	}

}
