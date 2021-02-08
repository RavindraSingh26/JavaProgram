package com.sep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ComSep {

	private String name;
	private String id;

	public ComSep() {

	}

	public ComSep(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ComSep [name=" + name + ", id=" + id + "]";
	}

}

class ComparatorSep implements Comparator<ComSep> {

	@Override
	public int compare(ComSep o1, ComSep o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}

final class Imm {

	private final String name;
	private final String id;
	private final Date dob;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	public Imm(String name, String id, Date dob) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
	}

}

class EmpSep4 {

	private String name;
	private int sal;

	public EmpSep4(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "EmpSep4 [name=" + name + ", sal=" + sal + "]";
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

}

class GFG {

	// static method
	public static int sum(int a, int b) {
		// MultivaluedMap<String, String> queryParams = new MultivaluedStringMap();
		return a + b;
	}
}

/*
 * remove duplicate, sorting name, sal, : reduce, sorted, collect, filter,
 * flatmap, map,
 * 
 */
public class Class_4_5_6_Sep {

	public static void main(String[] args) {
		// Collect Method..

		System.out.println("Original List");
		Long start = System.currentTimeMillis();
		List<EmpSep4> list = Arrays.asList(new EmpSep4("Ravindra", 1000), new EmpSep4("Singh", 2000),
				new EmpSep4("Ravindra", 1000));
		List<EmpSep4> result = list.stream().collect(Collectors.toList());
		System.out.println("Emp List : " + result);
		long end = System.currentTimeMillis();
		long res = end - start;
		System.out.println("Total time execution : " + res + "misc");

		// Sorted() and //Comparator
		System.out.println("Before Sorting.......");
		List<EmpSep4> list1 = Arrays.asList(new EmpSep4("Ravindra", 1000), new EmpSep4("Om Singh", 2000),
				new EmpSep4("Ashish", 1000));
		List<EmpSep4> strsort = list1.stream().sorted(Comparator.comparing(EmpSep4::getName))
				.collect(Collectors.toList());
		System.out.println("Sorting the data of Employee : " + strsort);

		// of()

		List<String> listOf = Stream.of("AB", "CD", "OK", "HDK", "KDJD").collect(Collectors.toList());
		System.out.println();
		System.out.println("--------------------------OF--------------" + listOf);
		String sr = "AB1";
		if (listOf.contains(sr)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// reduce

		// map

		// flatmap

		// Paraller Stream
		System.out.println("Original List");
		Long start1 = System.currentTimeMillis();
		List<EmpSep4> listprl = Arrays.asList(new EmpSep4("Ravindra", 1000), new EmpSep4("Singh", 2000),
				new EmpSep4("Ravindra", 1000));
		List<EmpSep4> result1 = listprl.parallelStream().collect(Collectors.toList());
		System.out.println("Emp List : " + result1);
		long end1 = System.currentTimeMillis();
		long res1 = end1 - start1;
		System.out.println("Total time execution : " + res1 + "misc");
		// remove Duplicate element

		List<EmpSep4> listDupli = Arrays.asList(new EmpSep4("Ravindra", 1000), new EmpSep4("Singh", 2000),
				new EmpSep4("Ravindra", 1000), new EmpSep4("Ravindra", 1000), new EmpSep4("Singh", 2000),
				new EmpSep4("Omm", 1000));
		System.out.println();
		System.out.println();
		// Set<EmployeeBean> set =
		// employeeBean.stream().collect(Collectors.toCollection(() -> new
		// TreeSet<>(Comparator.comparing(EmployeeBean::getName))));
		Set<EmpSep4> sepDup = listDupli.stream()
				.collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(EmpSep4::getName))));
		System.out.println("Remove Duplicat elemant : " + sepDup);

		System.out.println();
		System.out.println();
		// Odd and Even number
		System.out.println();
		System.out.println("Odd Number Print");
		List<Integer> listOdd = Arrays.asList(2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 8);
		List<Integer> odd = listOdd.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(odd);

		System.out.println();
		System.out.println("EVEN Number Print");
		List<Integer> listEven = Arrays.asList(2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 8);
		List<Integer> even = listEven.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(even);
		// discnit

		int n = 3, m = 6;

		// call the static method
		int s = GFG.sum(n, m);

		System.out.print("sum is = " + s);

		List<ComSep> ll = new ArrayList<ComSep>();
		ll.add(new ComSep("Arush", "Id101"));
		ll.add(new ComSep("Arush", "Id101"));
		ll.add(new ComSep("Arush1", "Id101"));
		ll.add(new ComSep("Arush", "Id101"));
		ll.add(new ComSep("Arush3", "Id101"));

		// Collections.sort(ll,new ComSep());

	}

}

class SingletonSep5 {

	private static SingletonSep5 instance;

	private SingletonSep5() {

	}

	/**
	 * @return the instance
	 */
	public static SingletonSep5 getInstance() {

		if (instance == null) {
			synchronized (SingletonSep5.class) {

				if (instance == null) {
					instance = new SingletonSep5();
				}
			}
		}
		return instance;
	}

	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(SingletonSep5 instance) {
		SingletonSep5.instance = instance;
	}

}
