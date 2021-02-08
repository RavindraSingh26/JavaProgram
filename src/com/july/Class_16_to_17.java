package com.july;

import java.io.Serializable;

class ExceptionClass extends Exception {

	ExceptionClass(String str) {
		super(str);
	}
}

class GenericTestT1<T> implements Serializable{

	transient int sum;
	volatile int aa;
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "GenericTestT1 [t=" + t + "]";
	}

}

class ThreadT1 extends Thread {

	public void run() {
		try {
			try{
				Thread.sleep(2000);
				String str = Thread.currentThread().getName();
				System.out.println("Hello : " + str);
			}catch(ArithmeticException e){
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class ThreadT12 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Class_16_to_17 {

	public static void main(String[] args) throws ExceptionClass {
		// TODO Auto-generated method stub

		GenericTestT1 tt = new GenericTestT1();
		tt.setT("Ravindra");
		tt.getT();
		tt.toString();

		int y = 10, x = 0;

		// System.out.println("Y = " + y);
		try {
			y /= x;
			throw new ExceptionClass("Hi");
		} catch (ArithmeticException e) {

		} finally {
			System.out.println("Error");
		}

	}

}
