package com.dec;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Program Name
 * 1. Lambda expression
 * 2. Stream
 * 3. ParralStream
 * 4. functional interface
 * 5. inter in string
 * 6. weekHashMap
 * 7. CurrentHashMap
 * 8. Syncronized hash map
 * 9. executor in multhi threading
 * 10. Default , Static in Java 8
 */

public class Class_26_27_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum = integers.stream().reduce(0, Integer::sum);

		System.out.println(sum);

		// Creating a List of Strings
		List<String> list = Arrays.asList("5.6", "7.4", "4", "1", "2.3");

		// Using Stream flatMap(Function mapper)
		list.stream().flatMap(num -> Stream.of(num)).forEach(System.out::println);
		
		List<String> listCount = Arrays.asList("Ravindra2345","Kumra45678","Singhfghjk","Datadfrgthyhu","PuneMaharastra","Indiadrftgyh");
		
		System.out.println(listCount.stream().max(Comparator.comparingInt(String::length)));
		
		Optional<String>  test = listCount.stream().max(Comparator.comparingInt(String::length));
		
		System.out.println("Find our the Largest String length : " + test);
		
		List<String> countList = listCount.stream().filter(x -> x.length() < 10).collect(Collectors.toList());
		
		System.out.println(countList);
		
		List<String> kkk = listCount.stream().map(ele -> ele.substring(0, 10)).collect(Collectors.toList());
		
		System.out.println("Hello : " + kkk);
		
		String s1 = "Ravindrasingh";
		String substr2 = s1.substring(0,10);
		
		System.out.println(substr2);
				
		
		
	}

}
