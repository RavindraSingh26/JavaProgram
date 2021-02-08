package com.june;

/*
 * Immutable class destials
 * 
 */

final class ImmutableDemo{
	
	private final  String name;
	private final  String pass;
	
	
	public  ImmutableDemo(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	
}
public class Class_5_to_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImmutableDemo obj = new ImmutableDemo("Ravindra","Digit@1234");
		System.out.println(obj.getName());
		
	}

}
