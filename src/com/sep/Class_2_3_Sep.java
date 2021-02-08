package com.sep;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Sep2 {

	// 2 number add
	public void addTwoNumber();

	// odd and even number
	public void printOddEven();

	// Prime number
	public void primeNumber();

	// sum of the array
	public void sumOfArray();
}

class ExtendsInterFace implements Sep2 {

	@Override
	public void addTwoNumber() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printOddEven() {
		// TODO Auto-generated method stub

	}

	@Override
	public void primeNumber() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sumOfArray() {
		// TODO Auto-generated method stub

		int num[] = new int[] { 2, 34, 5, 6, 7, 88, 90 };

		int sum = 0;

		for (int i = 0; i < num.length; i++) {

			sum = sum + num[i];
		}
		System.out.println("Sum of the number without stream : " + sum);
	}

}

class StreamProgram implements Sep2 {

	@Override
	public void addTwoNumber() {
		// TODO Auto-generated method stub

		List<String> breakInlist = Stream
				.of("FS,LS,RS,WS,BS,TS,RCB1,RCB2,FRC,BRC,BLC,FLC,DBD,ECR,CHP,CNG,RC,B1".split(","))
				.collect(Collectors.toList());

		System.out.println("Add 2 number in side Stream : " + breakInlist);
	}

	@Override
	public void printOddEven() {
		// TODO Auto-generated method stub
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18, 9, 11);
		List<Integer> resultEven = listOfNumbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Odd and Even : " + resultEven);
		List<Integer> resultOdd = listOfNumbers.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd Number : " + resultOdd);

	}

	@Override
	public void primeNumber() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sumOfArray() {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(12, 34, 56, 78, 9);

		Integer result = list.stream().reduce(0, Integer::sum);

		int ss = list.stream().filter(i -> i > 5).mapToInt(i -> i).sum();

		System.out.println("Sum : " + result);

		System.out.println("ss : " + ss);

	}

}

public class Class_2_3_Sep {

	public static void main(String[] args) {

		ExtendsInterFace objExtendsInterFace = new ExtendsInterFace();
		objExtendsInterFace.addTwoNumber();
		objExtendsInterFace.printOddEven();
		objExtendsInterFace.primeNumber();
		objExtendsInterFace.sumOfArray();

		System.out.println("Stream Class");

		StreamProgram objStreamProgram = new StreamProgram();
		objStreamProgram.addTwoNumber();
		objStreamProgram.printOddEven();
		objStreamProgram.primeNumber();
		objStreamProgram.sumOfArray();

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		list.stream().forEach(System.out::println);
		System.out.println();
		list.parallelStream().forEach(System.out::println);

		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		System.out.println(streamIterated);

		List<String> streamOfArray = Stream.of("a", "b", "c").collect(Collectors.toList());

		System.out.println(streamOfArray);

		List<String> streamOfArray1 = streamOfArray.stream().filter(i -> i.equalsIgnoreCase("a"))
				.collect(Collectors.toList());
		System.out.println(streamOfArray1);

		List<Employee> listEmp = Arrays.asList(new Employee("Ravi",100), new Employee("ABC",200));
		System.out.println("Original List : " + listEmp);
		
		// Using sequential stream
	      long start = System.currentTimeMillis();
	      
	      List<Employee> sortedItems = listEmp.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
	      
	      long end = System.currentTimeMillis();
	      System.out.println("sorted using sequential stream");
	      System.out.println(sortedItems);
	      
	      System.out.println("Total the time taken process :"
	 	    		  + (end - start) + " milisec.");
	      
	      List<Employee> sortedItems1 = listEmp.stream().filter(i -> i.getName().equalsIgnoreCase("Ravi")).collect(Collectors.toList());
	      
	      System.out.println(sortedItems1);
	      
	      
	   // Using parallel stream
	      start = System.currentTimeMillis();
	      List<Employee> anotherSortedItems = listEmp
	         .parallelStream().sorted(Comparator
	            .comparing(Employee::getName))
	         .collect(Collectors.toList());
	      end = System.currentTimeMillis();

	      System.out.println("sorted using parallel stream");
	      System.out.println(anotherSortedItems);
	      System.out.println("Total the time taken process :"
	         + (end - start) + " milisec.");
	}

}

class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int sal;
	
	
	public Employee(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + "]";
	}
	
	
}