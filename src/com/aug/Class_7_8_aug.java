package com.aug;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Aug8 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int id;
	private String address;
	
	public Aug8() {
		
	}
	
	public Aug8(String name, int id, String address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
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
		Aug8 other = (Aug8) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
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
		return "Aug8 [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
}

class Aug8Name implements Comparator<Aug8>{

	@Override
	public int compare(Aug8 o1, Aug8 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class Aug8Id implements Comparable<Aug8> {

	@Override
	public int compareTo(Aug8 o) {
		
		int sum = 0;
		return sum;
	}
}


public class Class_7_8_aug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<Aug8> list = new ArrayList<Aug8>();
		
		list.add(new Aug8("Ravi",101,"Pune"));
		list.add(new Aug8("Atul",102,"Delhi"));
		list.add(new Aug8("Zahul",141,"Bang"));
		list.add(new Aug8("Singh",181,"Pune"));
		
		Iterator<Aug8> itr = list.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		System.out.println("Sorting based on the Name");
		Collections.sort(list, new Aug8Name());
		for(Aug8 sug : list){
			
			System.out.println(sug);
		}
		
		Map<List<Aug8>, String> map = new HashMap<>();
		map.put(list, "ABC");
		
		System.out.println(map);
		
		List<Integer> listInt = Arrays.asList(2,3,4,5,0,8,9,1);
		
		
	}

}
