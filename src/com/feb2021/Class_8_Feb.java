package com.feb2021;

class SingletonFeb8{
	
	private static SingletonFeb8 instance;
	
	private SingletonFeb8() {
		
	}
	
	public static SingletonFeb8 getInstance() {
		
		System.out.println("Call instance method..inside singlton");
		if(instance == null) {
			
			synchronized (SingletonFeb8.class) {
				
				if(instance == null) {
					instance = new SingletonFeb8();
				}
			}
		}
		return null;
	}
}
public class Class_8_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonFeb8 obj = SingletonFeb8.getInstance();
		System.out.println("Display : " + obj);
		
	}

}
