package com.jan2021;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JanFirstWeek_1_to_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strList = Arrays.asList("Ravindra","","Singh","Om","Singh","Anjali","ANUP","","");
		List<String> strDisplay = strList.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());

		System.out.println(strDisplay);
		
		
		Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
        System.out.println(pr.test(10));    // Calling Predicate method    
        
		searchElement();
		
		multipeTable();
		
		sumofnumber();
		
		countEmptyStream();
		
		countmorethan3();
		
		startwithA(strList);
		
		removeAllEmptyString(strList);
	}

	static public void searchElement() {
		
		List<String> list = Arrays.asList("Ravindra","Singh","Om","Singhaa","Anjali");
		List<String> ll = list.stream().filter(s->s.equalsIgnoreCase("Singh")).collect(Collectors.toList());
		System.out.println(ll.size());
		System.out.println(ll);
	}
	
	
	static public void multipeTable() {
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> mul = num.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println(mul);
	}
	
	static public void sumofnumber() {
		
		List<Integer> list = Arrays.asList(12,89,76,98,00,23);
		Integer ss = list.stream().reduce(0, Integer :: sum);
		System.out.println("Sum : " + ss);
	}
	
	static public void countEmptyStream() {
		
		System.out.println("Count Empty Stream..");
		List<String> ll = Arrays.asList("Ravi","","","Singh");
		long res = ll.stream().filter(s -> s.isEmpty()).count();
		System.out.println("Empty Stream " + res);
	}
	
	//Count String whose length is more than three

	static public void countmorethan3() {
	
		System.out.println("Count String more than  3 length..");
		List<String> list = Arrays.asList("Ravinfra","Singh","OM");
		long ss = list.stream().filter(s -> s.length() >3).count();
		System.out.println(ss);
		
	}	
	
	//Count number of String which starts with "a"

	static public void startwithA(List<String> objList) {
		
		List<String> res = objList.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
		System.out.println("Result : " + res);
	}
	
	//Remove all empty Strings from List
	static public void removeAllEmptyString(List<String> obj) {
		System.out.println("Remove Element....");
		List<String> res = obj.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println("Remove Empty : " + res);
		
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 203, 29); 
		IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
		System.out.println("ggggg" + stats);

		
		
	}
}
