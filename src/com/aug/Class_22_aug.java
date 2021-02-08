package com.aug;

/*
 * CopyOnWriteArrayList
 */
public class Class_22_aug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// here Finally Block will not be trigger
		try{
			System.out.println("I am in try block");
			System.exit(1);
		} catch(Exception ex){
			ex.printStackTrace();
		} finally {
			System.out.println("I am in finally block!!!");
		}
		
	}

}
