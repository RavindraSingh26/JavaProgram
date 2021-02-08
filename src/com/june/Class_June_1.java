/**
 * 
 */
package com.june;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author ravindra.singh02
 *
 */
/*
 * Early, Lazy, Double checking Locking, static and Thread safe checking : five way we can create the Singleton class in java...
 */
class SingleTon{
	
	private static SingleTon single;
	
	private SingleTon(){
		
	}

	public static SingleTon getSingle() {
		
		if(single == null){
			synchronized (SingleTon.class) {
				if(single == null){
					single = new SingleTon();
				}
				
			}
		}
		return single;
	}
		
}

class DoubleTon{
	
}

class EarlyInitSingleton {
    private static final EarlyInitSingleton INSTANCE = new EarlyInitSingleton();
    
    public static EarlyInitSingleton getInstance() {
        return INSTANCE;
    }
    
     // private constructor and other methods...
}

public class Class_June_1 implements Serializable, Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private transient int sum;
	
	private volatile String ss;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> map = new TreeMap<String,Integer>();
		map.put("C", 123);
		map.put("B", 13);
		map.put("A", 123);
		map.put("A", 123);
		map.put("A", 123);
		
		for(Map.Entry<String, Integer> mm :map.entrySet()){
			
			System.out.println(mm.getKey());
			System.out.println(mm.getValue());
		}
		
		Map<String,Integer> maph = new HashMap<String,Integer>();
		maph.put("A", 123);
		maph.put("B", 123);
		maph.put("A", 123);
		maph.put("A", 123);
		maph.put("A", 123);
		
		for(Map.Entry<String, Integer> mm :maph.entrySet()){
			
			System.out.println(mm.getKey());
			System.out.println(mm.getValue());
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
