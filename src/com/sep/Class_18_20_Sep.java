package com.sep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class Class_18_20_Sep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "ABC";
		String str2 = "ABC";
		String str3 =  new String("ABC");
		
		int smsStatus = 0;
		if (smsStatus == 0) {
			System.out.println("Hello");
		}

		CommonUtil obj = new CommonUtil();
		String res = obj.upload("Ravindra");
		System.out.println(res);
		System.out.println(obj.flag);

		String res1 = obj.upload1("Ravindra", obj.flag);
		System.out.println(res1);
		System.out.println(obj.flag);

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "something");
		map.put(2, "heroku.com");
		map.put(1, "something");
		map.put(2, "heroku.com");
		
		for(Map.Entry<Integer, String> mm : map.entrySet()) {
			
			System.out.println(mm.getKey());
			System.out.println(mm.getValue());
		}

		// Map -> Stream -> Filter -> String
		String result = map.entrySet().stream().filter(x -> "something".equals(x.getValue())).map(x -> x.getValue())
				.collect(Collectors.joining());

		System.out.println(result);
		
		//List<Entry<Integer, String>> num = map.entrySet().stream().filter(x -> x.getKey()).collect(Collectors.toList());
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("BA");
		treeSet.add("AA");
		treeSet.add("AA");
		treeSet.add("AA");
		
		System.out.println(treeSet);
		
		ravi obj11 = ravi.ANAJLI;
		
		System.out.println(obj11); 
		
		List<Employee1> employeesList = Arrays.asList(
                new Employee1(1, "Alex", 100),
                new Employee1(2, "Brian", 10000),
                new Employee1(3, "Charles", 200),
                new Employee1(4, "David", 200),
                new Employee1(5, "Edward", 300),
                new Employee1(6, "Frank", 300),
                new Employee1(7, "David", 200),
                new Employee1(8, "Edward", 300),
                new Employee1(9, "Frank", 300)
            );
		
		List<Double> distinctSalaries = employeesList.stream().map(e->e.getSal()).distinct().collect(Collectors.toList());
             
		System.out.println(distinctSalaries);
		
		List<String> disName = employeesList.stream().map(e->e.getName()).distinct().collect(Collectors.toList());
		
		System.out.println(disName);
		
		//List<Double> hightSalaries = employeesList.stream().map(e->e.getSal()).findFirst().get().intValue();
	}

}
enum Direction 
{
   EAST, WEST, NORTH, SOUTH;
}
class Employee1{
	
	private int id;
	private String name;
	private double sal;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
	 * @return the sal
	 */
	public double getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Employee1(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	
	
}

enum ravi{
	
	KUNAL, ANAJLI, RAHUL, OM, GOLU, CHUTO;
}
