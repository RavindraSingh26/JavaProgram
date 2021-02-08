package com.sep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

interface kkkkkk{
	
	default void ddd() {
		
		System.out.println("default method in side default");
	}
	
	public static void ssssss() {
		System.out.println("Static -----");
	}
}
class EmpSalSort{
	
	private String name;
	private int sal;
	
	
	public EmpSalSort(String name, int sal) {
		
		this.name = name;
		this.sal = sal;
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
	 * @return the sal
	 */
	public int getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmpSalSort [name=" + name + ", sal=" + sal + "]";
	}
	
	
}
public class Class_30_Sep implements kkkkkk{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<EmpSalSort> list = Arrays.asList(new EmpSalSort("Ravindra",5000),new EmpSalSort("Kumar",1000),new EmpSalSort("Ravindra",5000),new EmpSalSort("Kumar",1000));
		List<EmpSalSort> listEmp = list.stream().filter(i-> i.getName().equalsIgnoreCase("Ravindra")).distinct().collect(Collectors.toList());
		
		System.out.println(listEmp.toString());
		
		List<EmpSalSort> listResult = list.stream().collect(Collectors.toList());
		System.out.println(listResult);
		
		
		List<EmpSalSort> listsor = list.stream().sorted(Comparator.comparingInt(EmpSalSort::getSal)).collect(Collectors.toList());
		System.out.println("Sorting the SAl : " + listsor);
		
		listsor.forEach(System.out::println);
		
		//Set<EmpSalSort> set = list.stream().collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(list::getName))));
		kkkkkk.ssssss();
		
		Set<EmpSalSort> set = list.stream().collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(EmpSalSort :: getName))));
		System.out.println(set);
		Class_30_Sep obj = new Class_30_Sep();
		obj.ddd();
		
	}

}
