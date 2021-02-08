package com.feb2021;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Feb1Singleton {

	public static Feb1Singleton instance;

	private Feb1Singleton() {

	}

	public static Feb1Singleton getInstance() {

		if (instance == null) {
			synchronized (Feb1Singleton.class) {

				if (instance == null) {
					instance = new Feb1Singleton();
				}
			}
		}
		return null;
	}
}

//Open Closed Principle
interface Feb1OpenClose {

	public void getList();
}

class OpenFeb1 implements Feb1OpenClose {

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("ABC", "DCE", "JHY");
		List<String> res = list.stream().filter(s -> s.startsWith("A"))
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(res);
		List<String> res1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(res1);

	}

}

class OpenFeb2 implements Feb1OpenClose {

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		Predicate<StudentBeanFeb> pre = s -> s.getName().startsWith("R");
		List<StudentBeanFeb> stuList = Arrays.asList(new StudentBeanFeb("Ravindra", "Pune", 1000, "A", 24),
				new StudentBeanFeb("Singh", "Delhi", 2000, "B", 24));
		List<StudentBeanFeb> resList = stuList.stream().filter(pre).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(resList);
		Optional<StudentBeanFeb> resList1 = stuList.stream().filter(pre)
				.collect(Collectors.maxBy(Comparator.comparingInt(StudentBeanFeb::getSal)));
		System.out.println(resList1);
	}

}

class CloseForModification {

	public void getPerfoem(Feb1OpenClose objFeb1OpenClose) {

		if (objFeb1OpenClose == null) {
			throw new InvalidParameterException("Cannot perform operation");
		}
		objFeb1OpenClose.getList();
	}
}

// FactoryDesign pattern....
interface FactFeb1 {

	public void flatMapExample();
}

class AF implements FactFeb1 {

	@Override
	public void flatMapExample() {
		// TODO Auto-generated method stub

	}

}

class AF1 implements FactFeb1 {

	@Override
	public void flatMapExample() {
		// TODO Auto-generated method stub
		String str = new String("ABC"); // two object is created one is the Heap and other is the String Pool
		String str1 = "ABC";
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
	}

}

class FactMain {

	public FactFeb1 getData(String str) {

		if (str.equalsIgnoreCase("A")) {

			return new AF();
		}
		if (str.equalsIgnoreCase("B")) {

			return new AF1();
		}
		return null;
	}
}

public class FirstWeekFeb_1_to_6 {

	final static public void main(String[] arguments) {
		// TODO Auto-generated method stub

		Optional GOT = Optional.of("Games of Thrones");
		String[] str = new String[10];
		Optional strOpt = Optional.ofNullable(str[9]);
		System.out.println("ooo"+ strOpt.isPresent());
		System.out.println("oooo"+ GOT.isPresent());
		FactMain obj = new FactMain();
		FactFeb1 obj1 = obj.getData("A");
		obj1.flatMapExample();
		FactFeb1 obj2 = obj.getData("B");
		obj2.flatMapExample();

		List<StudentBeanFeb> stuList = Arrays.asList(new StudentBeanFeb("Ravindra", "Pune", 1000, "A", 24),
				new StudentBeanFeb("Singh", "Delhi", 2000, "B", 24));
		List<StudentBeanFeb> resPrint = stuList.stream().collect(Collectors.toList());
		System.out.println("Print Student List : " + resPrint);
		// Display only the Name
		List<String> disName = stuList.stream().map(s -> s.getName()).collect(Collectors.toList());
		System.out.println("Display only Name : " + disName);

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum = integers.stream().reduce(0, Integer::sum);

		List<String> strList = Arrays.asList("ABC", "Ravi", "Data", "Ravindra");
		List<String> strResult = strList.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
		System.out.println(strResult);
		Long strResult1 = strList.stream().filter(s -> s.length() > 5).collect(Collectors.counting());
		System.out.println(strResult1);

		// Sort the List ......this question is asked in HCL.....
		List<String> strColor = Arrays.asList("Red", "Black", "Apple", "White", "Orange", "Red", "Black", "Apple",
				"White", "Orange");
		List<String> strResultColor = strColor.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorting : " + strResultColor);

		List<String> disColor = strColor.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct : " + disColor);
		// Counting use...
		Long strCount = strColor.stream().count();
		System.out.println("Counting : " + strCount);

		List<Integer> oddeven = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> even = oddeven.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
		System.out.println("Even : " + even);
		List<Integer> odd = oddeven.stream().filter(s -> s % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd : " + odd);

		Integer sum1 = oddeven.stream().reduce(0, Integer::sum);
		System.out.println("Sum of the number : " + sum1);

		// 12. Print multiple of 2 table. 2,4,6,8....
		List<Integer> table = oddeven.stream().map(s -> s * 2).collect(Collectors.toList());
		System.out.println("Print the Table : " + table);

		// till 300 line number we have to write....
		List<String> set = Arrays.asList("ABC", "Ravi");
		Optional<String> first = set.stream().findFirst();
		System.out.println(first);

		List<StudentBeanFeb> listFebBean = Arrays.asList(new StudentBeanFeb("Raju", "Pune", 1000, "A", 24),
				new StudentBeanFeb("Singh", "Delhi", 2000, "B", 24),
				new StudentBeanFeb("Ravindraedfrgyh", "Pune", 1000, "A", 24),
				new StudentBeanFeb("Kumal", "Bag", 30003456, "B", 24),
				new StudentBeanFeb("Singh", "Delhi", 5000, "B", 24),
				new StudentBeanFeb("Ravi", "Pune", 1000, "A", 24),
				new StudentBeanFeb("", "Delhi", 2000, "B", 24));

		
		//Display the List
		
		System.out.println();
		
		List<StudentBeanFeb> dis = listFebBean.stream().collect(Collectors.toList());
		System.out.println("List : " + dis);
		
		long ll = listFebBean.stream().count();
		System.out.println("Count : " + ll);
		
		List<StudentBeanFeb> listPar = listFebBean.parallelStream().collect(Collectors.toCollection(ArrayList:: new));
		System.out.println("Par : " + listPar);
		
		//Display the Name whose Length is more then 5
		List<StudentBeanFeb> optLength = listFebBean.stream().filter(s->s.getName().length()>5).collect(Collectors.toCollection(ArrayList::new));
		
		Iterator<StudentBeanFeb> itr = optLength.iterator();
		while(itr.hasNext()) {
			
			StudentBeanFeb ss = itr.next();
			System.out.println("Only Print the Name : " + ss.getName());
		}
		System.out.println("Length " + optLength);
		
		List<Boolean> optLength1 = listFebBean.stream().map(s->s.getName().length()>5).collect(Collectors.toList());
		System.out.println("Length " + optLength1);
		
		getMaxSal(listFebBean);
		getLongestStringName(listFebBean);
		getStringLengthCount(listFebBean);
	}

	public static void getMaxSal(List<StudentBeanFeb> obj) {
		
		System.out.println("Find the max sal");
		Optional<StudentBeanFeb> maxSal = obj.stream().collect(Collectors.maxBy(Comparator.comparingInt(StudentBeanFeb :: getSal)));
		System.out.println(maxSal);
		System.out.println();
		Optional<StudentBeanFeb> minsal = obj.stream().collect(Collectors.minBy(Comparator.comparingInt(StudentBeanFeb :: getSal)));
		System.out.println("Min Sal is : " + minsal);
	}
	
	//list of strings and return the longest string from it. Use streams.
	public static void getLongestStringName(List<StudentBeanFeb> obj) {
		
		System.out.println("Find the max Name from List....");
		
		Optional<StudentBeanFeb> masStr = obj.stream().collect(Collectors.maxBy(Comparator.comparing(StudentBeanFeb::getName)));
		System.out.println(masStr);
		
		List<StudentBeanFeb> removeList = obj.stream().filter(s -> s.getName().length()<10).collect(Collectors.toList());
		System.out.println(removeList);
	}
	
	public static void getStringLengthCount(List<StudentBeanFeb> obj) {
		//Count String whose length is more than three 
		long sss = obj.stream().filter(s ->s.getName().length() > 10).collect(Collectors.counting());
		System.out.println("Count total number of : "+ sss);
		List<StudentBeanFeb> dissss = obj.stream().filter(s->s.getName().length()>10).collect(Collectors.toCollection(ArrayList::new));
		Iterator<StudentBeanFeb> itr = dissss.iterator();
		
		while(itr.hasNext()) {
			
			StudentBeanFeb ss = itr.next();
			System.out.println(ss.getName());
		}
		
		//Count number of String which starts with "a"
		Predicate<StudentBeanFeb> pre = s->s.getName().startsWith("R");
		List<StudentBeanFeb> dddd = obj.stream().filter(pre).collect(Collectors.toList());
		System.out.println("kkk" + dddd);
		//Remove all empty Strings from List
		Predicate<StudentBeanFeb> hhhh = s -> s.getName().isEmpty();
		List<StudentBeanFeb> kk = obj.stream().filter(hhhh).collect(Collectors.toList());
		System.out.println(kk);
		
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x).summaryStatistics();
		System.out.println(stats);
		 
	}
}

//Singleton design pattern

class Singleton1{
	
	
	private static Singleton1 instance;
	
	private Singleton1() {
		
	}
	
	public static Singleton1 getInstance() {
		
		if(instance == null) {
			
			synchronized (Singleton1.class) {
				
				if(instance == null) {
					instance = new Singleton1();
				}
			}
		}
		return null;
	}
}