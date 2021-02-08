package com.jan2021;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 1. Display the List
        2. example of parallelStream.
        3. example of sequentialStream
        4. Print odd and even number using the stream
        5. Print the sum of the number using the stream
        6. ind the maximum and minimum value from a List/Collection.
        7. 1.1 POST api to accept list of strings and return the longest string from it. Use streams.
		8. 1.2 DELETE api to accept list of strings and remove all the string which is having length more than 10.

			- Return remaining.
			- Use streams
			
		9. https://www.java67.com/2014/04/java-8-stream-examples-and-tutorial.html
		10. Count String whose length is more than three
		11. Count number of String which starts with "a"
		12. Print multiple of 2 table. 2,4,6,8....
		13. Remove all empty Strings from List
		14. Get count, min, max, sum, and the average for numbers
				
				List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
				IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
		15. Predicate Example in Java 8.
		16. Random example in Java 8
 */

interface JanSecond {
	
	default void jandefault() {
		
		System.out.println("Default Method..");
		/*
		 * 1. Display the List 2. example of parallelStream. 3. example of
		 * sequentialStream 4. Print odd and even number using the stream 5. Print the
		 * sum of the number using the stream
		 */
		
		System.out.println("1.  Display the List with Sorting Order");
		List<String> list = Arrays.asList("Ravindra","Singh","Singh","Kumar","Om","Golu","Anjali");
		List<String> resultList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(resultList);
		System.out.println();
		
		System.out.println("2. example of parallelStream. with Sorting Order");
		List<String> listPar = Arrays.asList("Ravindra","Singh","Singh","Kumar","Om","Golu","Anjali");
		List<String> resultListPar = listPar.parallelStream().sorted().collect(Collectors.toList());
		System.out.println(resultListPar);
		System.out.println();
		
		
		System.out.println("Odd and Even Number example");
		List<Integer> listInt = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> resultEven = listInt.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println("Print the Even Numver : " + resultEven);
		List<Integer> resultOdd = listInt.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
		System.out.println("Print Odd Number : " + resultOdd);
		Integer listSum = listInt.stream().reduce(0, Integer::sum);
		System.out.println("Sum of number  : " + listSum);
		List<Integer> mul = listInt.stream().map(i -> i *10).collect(Collectors.toList());
		System.out.println(mul);
		System.out.println();
	}
	
	static void getStaticList() {
		
		System.out.println("Static Method..remove duplicate element..");
		List<String> list = Arrays.asList("Ravindra","Singh","Singh","Kumar");
		List<String> resultList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(resultList);
	}
}
public class Jan_secondWeek implements JanSecond{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jan_secondWeek jan_secondWeek = new Jan_secondWeek() ;
		jan_secondWeek.jandefault();
		JanSecond.getStaticList();
		
		System.out.println("Lambda Example ...");
		
		System.out.println("End Lambda....");
		
		System.out.println();
		
		streamAPILogic();
		
	}

	@Override
	public void jandefault() {
		// TODO Auto-generated method stub
		JanSecond.super.jandefault();
		System.out.println("Default Method is OverRide...write the example of map, flatMap, reduce, Filter, Max and min, count");
		long count = Stream.of("how","to","do","in","java")
                .collect(Collectors.counting());
        System.out.printf("There are %d words in the stream %n", count);
         
        count = Stream.of(1,2,3,4,5,6,7,8,9)
                .collect(Collectors.counting());
        System.out.printf("There are %d integers in the stream %n", count);
         
        count = Stream.of(1,2,3,4,5,6,7,8,9)
                .filter(i -> i%2 == 0)
                .collect(Collectors.counting());
        System.out.printf("There are %d even numbers in the stream %n", count);
        
	}
	
	
	static void streamAPILogic() {
		
		/*
		 10. Count String whose length is more than three
		11. Count number of String which starts with "a"
		12. Print multiple of 2 table. 2,4,6,8....
		13. Remove all empty Strings from List
		14. Get count, min, max, sum, and the average for numbers
				
				List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
				IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
		15. Predicate Example in Java 8.
		16. Random example in Java 8 
		 */
		
		List<String> list = Arrays.asList("Ravindra","Data","Kumar","","");
		long countList = list.stream().filter(i -> i.length() > 1).collect(Collectors.counting());
		System.out.println("Lenght More than 3 : " + countList);
		
		List<String> removeEmpty = list.stream().filter(i -> !i.isEmpty()).collect(Collectors.toList());
		System.out.println("Remove Emplty : "+ removeEmpty);

		long countremoveEmpty = list.stream().filter(i -> i.isEmpty()).count();
		System.out.println("Count Emplty  String : "+ countremoveEmpty);

		List<String> startwithA = list.stream().filter(i -> i.startsWith("R")).collect(Collectors.toList());
		System.out.println(startwithA);
		
	}
}
