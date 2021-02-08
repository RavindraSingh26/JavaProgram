package com.sep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Sep11Bean implements Comparator<Sep11Bean> {

	private String name;
	private String id;

	public Sep11Bean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sep11Bean(String name, String id) {
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
	public int compare(Sep11Bean o1, Sep11Bean o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sep11Bean other = (Sep11Bean) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sep11Bean [name=" + name + ", id=" + id + "]";
	}

}

class Stuname implements Comparator<Sep11Bean> {

	public Stuname() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Sep11Bean o1, Sep11Bean o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class StuId implements Comparable<Sep11Bean> {

	public StuId() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Sep11Bean o) {
		// TODO Auto-generated method stub
		return 0;// o.getId() - o.getId();
	}

}

interface Sep11 {

	default List<String> data() {

		List<String> list = new ArrayList<String>();
		list.add("ABC");

		List<Sep11Bean> listEmp = new ArrayList<Sep11Bean>();
		listEmp.add(new Sep11Bean("Ravindra", "101"));
		listEmp.add(new Sep11Bean("Ravindra3", "1012"));
		listEmp.add(new Sep11Bean("Ravindra2", "1013"));
		listEmp.add(new Sep11Bean("Ravindra1", "1014"));
		listEmp.add(new Sep11Bean("Ravindra", "101"));

		Collections.sort(listEmp, new Sep11Bean());
		Iterator<Sep11Bean> ite = listEmp.iterator();

		while (ite.hasNext()) {

			Sep11Bean ss = new Sep11Bean();
			System.out.println(ss.getName());

		}

		Collections.sort(listEmp, new Stuname());
		// Collections.sort(listEmp, new StuId());
		return list;
	}

	static List<Sep11Bean> empData() {

		List<Sep11Bean> list = Arrays.asList(new Sep11Bean("Ravindra", "1012"),new Sep11Bean("Ravindra", "1012"));
		
		List<Sep11Bean> list1 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list1);
		
		list1.stream().count();
		
		//List<Sep11Bean>  b = list1.parallelStream().filter(p -> p.getName().toString()).collect(Collectors.toList());
				
		List<Sep11Bean>  b = list1.stream().sorted(Comparator.comparing(Sep11Bean::getName)).collect(Collectors.toList());
		
		System.out.println(b);
		b.forEach(System.out::println);
		
		List<Sep11Bean> sortId = list1.stream().sorted(Comparator.comparing(Sep11Bean::getId)).collect(Collectors.toList());
		System.out.println(sortId);
		sortId.forEach(System.out::println);
		
		List<Integer> listOdd = Arrays.asList(2,1,3,4,5,6,7,8,9,10,8);
		List<Integer> odd = listOdd.stream().filter(i -> i %2 != 0).collect(Collectors.toList());
		System.out.println(odd);		
		
		List<Integer> listEven = Arrays.asList(2,1,3,4,5,6,7,8,9,10,8);
		List<Integer> even = listEven.stream().filter(i -> i %2 == 0).collect(Collectors.toList());
		System.out.println(even);
		
		return list;

	}
}

public class Class_11_12_13 {

	public static void main(String[] args) {
		// Reverse of the String
		
		String str = "Ravindra";
		char[] ch = str.toCharArray();
		System.out.println(ch);
		String rev ="";
		for(int i = str.length() -1; i >= 0; i--) {
			
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
		//Count Number of repeating Character in String like "Ravindra:					=
				
	}

}

//Immutable class, 
//13. Single Key and Multiple Value using Map.					
//14. Reverse of the String										

final class SepImmutable {

	private final List<String> list = null;
	private final Map<String, List<String>> map = null;

	private SepImmutable(List<String> list, Map<String, List<String>> map) {

		list = list;
		map = map;

	}

	/**
	 * @return the list
	 */
	public List<String> getList() {
		list.add("Ravindra");
		list.add("Ravindra1");
		list.add("Ravindra2");
		list.add("Ravindra3");
		list.add("Ravindra");
		
		return list;
	}

	/**
	 * @return the map
	 */
	public Map<String, List<String>> getMap() {
		
		map.put("Ravi", list);
		return map;
	}

}