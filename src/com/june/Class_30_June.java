/**
 * 
 */
package com.june;

import java.io.Serializable;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/**
 * @author ravindra.singh02
 *
 */

class AMA implements Comparable<AMA>,Comparator<AMA>, Callable<String>,Serializable,Executor{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int num;
	
	private transient int kkk;
	
	public AMA(String name, int num) {
		super();
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
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int compare(AMA o1, AMA o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(AMA o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void execute(Runnable command) {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class Class_30_June {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
