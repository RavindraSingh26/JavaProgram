package com.july;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;

interface InterfaceTreeSet{
	
	static void test(){
		System.out.println("Helllo");
	}
	
	default void data(){
		
		Set set = new HashSet();
		set.add("StringABS");
		set.add("StringABS1");
		set.add("StringABS2");
		set.add("StringABS3");
		set.add("StringABS");
		
		System.out.println(set);
	}
	
	static void treeSetData(){
		
		Set tset = new TreeSet();
		tset.add("ABC");
		tset.add("AC");
		tset.add("ADBC");
		tset.add("A");
		tset.add("AZZBC");
		
		System.out.println(tset);
		
	}
}
public class Class_26 implements InterfaceTreeSet,Callable<String>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceTreeSet.test();
		InterfaceTreeSet.treeSetData();
		Class_26 cc = new Class_26();
		cc.data();
		
		
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
