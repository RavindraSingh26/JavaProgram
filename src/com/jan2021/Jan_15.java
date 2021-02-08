package com.jan2021;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

class SingleTon{

	private static SingleTon instance;
	
	private SingleTon() {
		
	}

	/**
	 * @return the instance
	 */
	public static SingleTon getInstance() {
		if(instance == null) {
			
			synchronized (SingleTon.class) {
				
				if(instance == null) {
					
					instance = new SingleTon();
				}
			}
		}
		return instance;
	}
}

interface BBBB{
	public void gg();
}

class AS implements BBBB{

	@Override
	public void gg() {
		// TODO Auto-generated method stub
		
	}
	
}

class ASs implements BBBB{

	@Override
	public void gg() {
		// TODO Auto-generated method stub
		
	}
	
}

class MMM{
	
	public BBBB getB(String str) {
		
		if(str == null) {
			return null;
		}else if(str.equalsIgnoreCase("A")) {
			return new ASs();
		}
		return null;
	}
}

public class Jan_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MMM obj = new MMM();
		BBBB nnn = obj.getB("A");
		nnn.gg();
		List<StudentBean> list = Arrays.asList(new StudentBean("Kunal", "Pune", 100, "A", 200),
				new StudentBean("Kunal", "Delhi", 10000, "B", 20), new StudentBean("Anjali", "Pune", 120, "A", 200),
				new StudentBean("Kunal", "Delhi", 256780, "C", 210));
		
		List<StudentBean> disList = list.stream().collect(Collectors.toList());
		System.out.println("Student List : " + disList);
		
		//only Name
		List<String> displayName = list.stream().map(s->s.getName()).collect(Collectors.toList());
		System.out.println("Display only Name : " + displayName);
		
		//Sorting Order
		List<StudentBean> removeDuplicate = list.stream().sorted(Comparator.comparing(StudentBean::getName)).collect(Collectors.toList());
		System.out.println("Remove Duplicate emlement: "+ removeDuplicate);
		
		//Remove Duplicate Element
		Set<StudentBean> set = list.stream().collect(Collectors.toCollection(()-> new TreeSet<>(Comparator.comparing(StudentBean::getName))));
		System.out.println("Remove Duplicate Name : " + set);
		
		//display max sal
		Optional<StudentBean> minSal = list.stream().collect(Collectors.minBy(Comparator.comparing(StudentBean::getSal)));
		System.out.println("Min Sal : " + minSal);
		
		//display min sal
		Optional<StudentBean> maxSal = list.stream().collect(Collectors.maxBy(Comparator.comparingInt(StudentBean::getSal)));
		System.out.println("Max Sal : " + maxSal);
		
		
	}

}
