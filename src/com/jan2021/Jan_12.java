package com.jan2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 14. Get count, min, max, sum, and the average for numbers
				
				List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
				IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
		15. Predicate Example in Java 8.
		16. Random example in Java 8 
 */

class Tester implements Cloneable {
	   private int data;

	   public int getData() {
	      return data;
	   }
	   public void setData(int data) {
	      this.data = data;
	   }
	   public Tester(int data){
	      this.data = data;
	   }
}

interface Jan12{
	
	public void getList();
	public int add(int a,int b);  
	
	default void sum() {
		
		List<Integer> primes = Arrays.asList(2,3,4,5,6,7,9,5,4,3,2,3,4);
		IntSummaryStatistics stata = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(stata);
	}
}
@FunctionalInterface
interface MyFunctionalInterface {

	//A method with no parameter
    public String sayHello();
}
public class Jan_12 implements MyFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println(squaresList);
		
		List<List> listOfListOfNumber = new ArrayList<>();
        listOfListOfNumber.add(Arrays.asList(2, 4));
        listOfListOfNumber.add(Arrays.asList(3, 9));
        listOfListOfNumber.add(Arrays.asList(4, 16));
		
		System.out.println(listOfListOfNumber);
		
		List flatint = (List) listOfListOfNumber.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
		System.out.println(flatint);
		
		MyFunctionalInterface msg = () -> {
    		return "Hello";
    	};
        System.out.println(msg.sayHello());
        System.out.println(msg.sayHello());
		
        List<Tester> testerList = new ArrayList<Tester>();

        testerList.add(new Tester(1));
        testerList.add(new Tester(2));
        testerList.add(new Tester(3));
        testerList.add(new Tester(4));

        for(Tester tester : testerList){
           System.out.println(tester.getData());
        }
        
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Ravindra";
	}


}
