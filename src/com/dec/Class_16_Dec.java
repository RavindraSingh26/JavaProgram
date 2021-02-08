package com.dec;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Collection details
interface Dec16Interface {

	static List<String> getDataList() {

		// List: ArrayList, LinkedList and Vector.
		List<String> list = new ArrayList<String>();
		list.add("Ravindra");
		list.add("Laddoo");
		list.add("kunal");
		list.add("Anjali");
		list.add("Ravindra");

		for (String str : list) {
			System.out.println(str);
		}
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

			if (itr.next().contains("Ravindra")) {
				System.out.println("True");
			}
		}
		return list;
	}

	// Set : HashSet, linkedHashSet, TreeSet and SortedSet.
	default Set<String> getSetData() {

		Set<String> set = new HashSet<String>();
		set.add("String : set start here");

		for (String str : set) {
			System.out.println(str);
		}

		return set;
	}
}

//Immutablr example in java
final class DecImm {

	final private String name;

	private DecImm(String name) {

		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}

final class ImmutableReminder {
	private final Date remindingDate;

	public ImmutableReminder (Date remindingDate) {
				if(remindingDate.getTime() < System.currentTimeMillis()){
						throw new IllegalArgumentException("Can not set reminder  for past time: " + remindingDate);
				
				}
				this.remindingDate = new Date(remindingDate.getTime());
	}

	public Date getRemindingDate() {
			return (Date) remindingDate.clone();
	 }
}

public class Class_16_Dec implements Dec16Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Map : HashMap, HashTable, TreeMap, ConcurrentHashMap,
		List<String> ll = new ArrayList<String>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("ABC", ll);

		Class_16_Dec obj = new Class_16_Dec();
		obj.getSetData();
		Dec16Interface.getDataList();

	}

}
