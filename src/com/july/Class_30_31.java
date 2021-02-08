package com.july;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

//Example of Singlton
class SinglDemo{
	
	private static SinglDemo instances;

	private SinglDemo(){
		
	}
	
	public static SinglDemo getInstances() {
		if(instances == null){
			synchronized (SinglDemo.class) {
				
				if(instances == null){
					instances = new SinglDemo();
				}
			}
		}
		return instances;
	}	
}
//Example of Immutable
final class ImuFinal{
	
	private final String name;
	private final String address;

	public ImuFinal(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
}

class EmpId implements Serializable , Comparator<EmpId>,Comparable<EmpId>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int num;
	
	
	public EmpId(String name, int num) {
		
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public int compareTo(EmpId o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compare(EmpId o1, EmpId o2) {
		// TODO Auto-generated method stub
		return 0;
	}
		
}

interface interaa{
	
	default void treemap(){
		 
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("A");
		list.add("B");
		list.add("D");
		list.add("E");
		
		Map<Integer, List<String>> map = new TreeMap<>();
		map.put(1, list);
		
		System.out.println("List Map: " + map);
	}
}

class ttt implements Runnable,Callable<String>,Future<String>{
	
	private String name;
	private transient int num;
	private volatile int nn;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void a() throws InterruptedException{
		
		synchronized (ttt.class) {
			
			if(getName().equalsIgnoreCase("AA")){
				wait(1000);
			}
		}
	}

	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String get() throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCancelled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
public class Class_30_31 implements interaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("ABS");
		list.add("Pune");
		
		long str = list.stream().filter(ss -> ss.equalsIgnoreCase("Ravi")).count();
		System.out.println("Data : " +str);
		
		List<EmpId> listEmpId = new ArrayList<EmpId>();
		listEmpId.add(new EmpId("Ravindra", 101));
		listEmpId.add(new EmpId("Om", 102));
		listEmpId.add(new EmpId("Adarsh", 103));
		listEmpId.add(new EmpId("Kunal", 104));
		listEmpId.add(new EmpId("ABS", 105));
		
		
		long strList = listEmpId.stream().filter(ll -> ll.getName().equalsIgnoreCase("Ravi")).count();
		System.out.println("Count : " + strList);
		
		System.out.println();
		
		interaa oo = new Class_30_31();
		oo.treemap();
		
	}

}
