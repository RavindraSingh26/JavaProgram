package com.dec;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

interface DecInterface_1{
	
	default void getData() {
		
		
	}
	
	static void display() {
		
		System.out.println("Static method.....");
	}
}

class EmpDec1 implements Serializable, Runnable, Cloneable,Callable<String>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	private Integer sal;
	private Integer price;
	
	
	
	public EmpDec1(String name, String address, Integer sal, Integer price) {
		super();
		this.name = name;
		this.address = address;
		this.sal = sal;
		this.price = price;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the sal
	 */
	public Integer getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	/**
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "EmpDec1 [name=" + name + ", address=" + address + ", sal=" + sal + ", price=" + price + "]";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
public class Class_1_Dec_2_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Remove duplicate data from Emp table using Stream.....
		List<EmpDec1> employeeBean = Arrays.asList(new EmpDec1("ABC1","Pune",10,89), new EmpDec1("ABC","Pune",10,89));
		Set<EmpDec1> set = employeeBean.stream().collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(EmpDec1::getName))));
		System.out.println(set);
		
		List<String> list = Arrays.asList("a1","a2","b1","b2","c1","c2");
		list.stream().filter(s->s.startsWith("c")).map(String :: toUpperCase).sorted().forEach(System.out::println);
		
		Collection<String> collection = Arrays.asList("a", "b", "c");
		
		List<EmpDec1> listEmp = Arrays.asList(new EmpDec1("Ravi","Pune",101,1100),new EmpDec1("Om","UP",101,1100),new EmpDec1("Khusboo","UP",101,1100),new EmpDec1("Golu","UP",101,1100));
		
		//Print Normal
		List<EmpDec1> llPrint = listEmp.stream().collect(Collectors.toList());
		System.out.println(llPrint);
		
		//Sorting by Name
		List<EmpDec1> sortEmp = listEmp.stream().sorted(Comparator.comparing(EmpDec1::getName)).collect(Collectors.toList());
		
		System.out.println(sortEmp.toString());
		
		//Sort by Address
		List<EmpDec1> addressSort = listEmp.stream().sorted(Comparator.comparing(EmpDec1 :: getAddress)).collect(Collectors.toList());
		System.out.println(addressSort);
		
		List<Integer> odd = Arrays.asList(1,2,3,4,5,8);
		List<Integer> oddPrint = odd.parallelStream().filter(n-> n%2 != 0).collect(Collectors.toList());
		System.out.println(oddPrint);
		
		List<Integer> listss = Arrays.asList(12,34,56,78,9);
		
		Integer result = listss.stream().reduce(0, Integer ::sum);
		
		int ss = listss.stream().filter(i -> i > 5).mapToInt(i -> i).sum();
		
		System.out.println("Sum : " + result);
		
		System.out.println("ss : " + ss);
		
		List<Integer> listTable = Arrays.asList(5);
		int s = 10;
		
		
	}

}
