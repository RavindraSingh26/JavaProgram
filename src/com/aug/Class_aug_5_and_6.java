package com.aug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

class EMPAug5 implements Comparable<EMPAug5>,Comparator<EMPAug5>{

	private String name;
	private int id;
	
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
	@Override
	public String toString() {
		return "EMPAug5 [name=" + name + ", id=" + id + "]";
	}
	public EMPAug5(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	public EMPAug5() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compare(EMPAug5 obj1, EMPAug5 obj2) {
		// TODO Auto-generated method stub
		return obj1.name.compareTo(obj2.name);
	}
	@Override
	public int compareTo(EMPAug5 arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
class Aug5 implements Callable<String>, Runnable, Cloneable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Ravindra";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

class Sortbyroll implements Comparator<EMPAug5> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(EMPAug5 a, EMPAug5 b) 
    { 
        return a.getId() - b.getId();
    } 
} 

class SortbyNamel implements Comparator<EMPAug5> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(EMPAug5 a, EMPAug5 b) 
    { 
        return a.getId() - b.getId();
    } 
} 

abstract class AbstractDemoAug6{
	
	AbstractDemoAug6(){
		
	}
	abstract void dis();

	public void data(){
		
	}
}

class ABS extends AbstractDemoAug6{

	ABS(){
		
		
	}
	@Override
	void dis() {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(100,123,234,456);
		//List<Integer> sum = list.stream().filter(s-> s.intValue());
	}
	
	public void data(){
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Ravindra", 101);
		map.put("Ravindra1", 102);
		map.put("Ravindra2", 101);
		map.put("Ravindra3", 101);
		map.put("Ravindra4", 101);
		
		for(Map.Entry<String, Integer> mm : map.entrySet()){
			
			System.out.println("Name : " + mm.getValue());
			System.out.println("ID : " + mm.getKey());
			
		}
	}
}

public class Class_aug_5_and_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stream ....
		
		List<String> listStream = Arrays.asList("Ravindra","Singh","Pune","Digit");
		List<String> ll = listStream.stream().filter(s->s.equalsIgnoreCase("Ravindra")).collect(Collectors.toList());
		System.out.println("List Data : " + ll);
		
		//List<String> allList = listStream.stream().filter(); how display all data list.
		
		EMPAug5 obj1 = new EMPAug5("Ravi",101);
		EMPAug5 obj2 = new EMPAug5("Singh",102);
		EMPAug5 obj3 = new EMPAug5("Kumar",103);
		EMPAug5 obj4 = new EMPAug5("Om",104);
		EMPAug5 obj5 = new EMPAug5("Ravi",101);
		
		
		List<EMPAug5> list = new ArrayList<EMPAug5>();
		
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		
		Collections.sort(list,new EMPAug5());

		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			
			EMPAug5 emp = (EMPAug5) itr.next();
			System.out.println("Name : " + emp.getName() + ", " + "Id : " + emp.getId());
		}

		Set<EMPAug5> set = new HashSet<EMPAug5>(list);
		System.out.println("Remove Duplicate data : " + set);
		
		Collections.sort(list, new Sortbyroll());
		
		System.out.println("\nSorted by rollno"); 
        for (int i=0; i<list.size(); i++) 
            System.out.println(list.get(i)); 
        
	}

}
