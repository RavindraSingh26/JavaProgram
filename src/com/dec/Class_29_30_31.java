package com.dec;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Class_29_30_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Map<Integer,String> laptopmap = new HashMap<Integer,String>();
	      laptopmap.put(1,"IBM");
	      laptopmap.put(2,"Dell");
	      laptopmap.put(3,"HCL");
	      // create a synchronized map
	      Map<Integer,String> syncmap = Collections.synchronizedMap(laptopmap);
	      System.out.println("Synchronized map is : "+syncmap);
	      
	    //ConcurrentHashMap
	      Map<Integer,String> laptopmap1 = new ConcurrentHashMap<Integer,String>();
	      laptopmap1.put(1,"IBM");
	      laptopmap1.put(2,"Dell");
	      laptopmap1.put(3,"HCL");
	      System.out.println("ConcurrentHashMap is: "+laptopmap1);
	      
	}

}
