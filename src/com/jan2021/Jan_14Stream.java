package com.jan2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Jan_14Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Display the List of the Student
		List<StudentBean> list = Arrays.asList(new StudentBean("Kunal", "Pune", 100, "A", 200),
				new StudentBean("Kunal", "Delhi", 10000, "B", 20), new StudentBean("Anjali", "Pune", 120, "A", 200),
				new StudentBean("Kunal", "Delhi", 256780, "C", 210));
		List<StudentBean> listStudent = list.stream().collect(Collectors.toList());
		System.out.println("Display the List : " + listStudent);
		
		//Convert stream to ArrayList
		List<StudentBean> arrayListConvert = list.stream().collect(Collectors.toCollection(ArrayList :: new));
		System.out.println("ArrayList convert : " + arrayListConvert);
		
		List<StudentBean> ll = new ArrayList<StudentBean>();
		ll.addAll(arrayListConvert);
		System.out.println("Add All with List: " + ll);
		
		//Display only Name of the student.		
		List<String> displayName = list.stream().map(s -> s.getName()).collect(Collectors.toList());
		System.out.println("Display Name : " + displayName);
		
		//Display only Sal
		List<Integer> displaySal = list.stream().map(s->s.getSal()).collect(Collectors.toList());
		System.out.println("Display only Sal : " + displaySal);
		
		//Sort the Sal
		List<StudentBean> sortName = list.stream().sorted(Comparator.comparingInt(StudentBean :: getSal)).collect(Collectors.toList());
		System.out.println("Display sal as sorted order : " + sortName);
		
		//Sort by Name
		List<StudentBean> sortN = list.stream().sorted(Comparator.comparing(StudentBean :: getName)).collect(Collectors.toList());
		System.out.println("Display Name based Sorting : " + sortN);
		
		//Display name based on R
		long CountR = list.stream().filter(s->s.getName().startsWith("R")).count();
		List<StudentBean> displayonR = list.stream().filter(s-> s.getName().startsWith("R")).collect(Collectors.toList());
		System.out.println("Displat Name with R : " + displayonR);
		System.out.println("Count R data : " + CountR);
		
		//Display name where sal is more than 1000
	
		
		//Display Max sal 
		Optional<StudentBean> maxSalaryEmp = 
	            list.stream()
	            .collect(Collectors.maxBy(Comparator.comparing(StudentBean::getSal)));
	    System.out.println("Employee with max salary:" + (maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not Applicable"));
		//Display min sal
		Optional<StudentBean> minSal = list.stream().collect(Collectors.minBy(Comparator.comparing(StudentBean::getSal)));
		System.out.println("Employee with min salary:" + minSal);
		
		//top 3 sal display 
		List<Integer> top3sal = list.stream().map(s->s.getSal()).limit(3).collect(Collectors.toList());
		System.out.println("Top 3 sal : " + top3sal);
		//remove duplicate data of name
		Set<StudentBean> removeDuplicate = list.stream().collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(StudentBean :: getName))));
		System.out.println("Remove Duplicate Name : " + removeDuplicate);
		
		List<StudentBean> lal = list.stream().filter(i -> i.getName().startsWith("R")).limit(2).collect(Collectors.toList());
		System.out.println(lal);
		
		// Creating predicate 
        Predicate<Integer> lesserthan = i -> (i < 18);  
  
        // Calling Predicate method 
        System.out.println(lesserthan.test(10));  
        
        
        Predicate<Integer> noGreaterThan5 =  x -> x > 5;

        List<Integer> listpre = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = listpre.stream()
                .filter(noGreaterThan5)
                .collect(Collectors.toList());

        System.out.println(collect); // [6, 7, 8, 9, 10]
        
        
	}

}
