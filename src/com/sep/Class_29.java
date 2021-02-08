package com.sep;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SingletonSep29 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static SingletonSep29 instance = null;
	private SingletonSep29() {
		
	}
	/**
	 * @return the instance
	 */
	public static SingletonSep29 getInstance() {
		
		if(instance == null) {
			synchronized (SingletonSep29.class) {
				if(instance == null) {
					
					instance = new SingletonSep29();
				}				
			}
		}
		return instance;
	}
	
}
class UserException extends Exception{
	
	public  UserException(String str) {
		
		super(str);
	}
}
public class Class_29 {

	public static void main(String[] args) throws UserException {
		// TODO Auto-generated method stub

		int num = 2;
		if(num > 10) {
			throw new UserException("Please input the valid number");
		}else {
			System.out.println(" correct ");
			List<Integer> list = Arrays.asList(1112,34,56,78,9);
			Integer kkk = list.stream().reduce(0, Integer::sum);
			System.out.println(kkk);
		}
		
		stringData();
		
		oddandeven();
	}

	public static void stringData() {
	
		System.out.println("Static class");
		//String example write here.....
		List<Integer> list = Arrays.asList(12,34,56,78,9);
		
		Integer result = list.stream().reduce(0, Integer ::sum);
		
		int ss = list.stream().filter(i -> i > 5).mapToInt(i -> i).sum();
		
		System.out.println("Sum : " + result);
		
		System.out.println("ss : " + ss);
		
	}
	
	static {
		
		System.out.println(" Static load before the calss");
	}
	
	public static void oddandeven() {
		
		List<Integer> listOdd = Arrays.asList(1,2,3,4,5,6,7,8,9,0,10);
		
		List<Integer> resultOdd = listOdd.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
		System.out.println("Odd Number : " + resultOdd);
		
		List<Integer> even = listOdd.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
		System.out.println("Even Number as : " + even);
		
	}
}
