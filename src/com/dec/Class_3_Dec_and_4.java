package com.dec;
//Singleton Class

//Open and Close principle


interface NewInterface { 
	  
    // static method 
    static void hello() 
    { 
        System.out.println("Hello, New Static Method Here"); 
    } 
  
    // Public and abstract method of Interface 
    void overrideMethod(String str); 
} 

class H
{
	int num = 10;
}

class S extends H{
	
	
}

public class Class_3_Dec_and_4 extends H{

	public static void main(String[] args) {
		Class_3_Dec_and_4 interfaceDemo = new Class_3_Dec_and_4(); 
		  
        // Calling the static method of interface 
        NewInterface.hello(); 
  
        System.out.println(interfaceDemo.num);
        // Calling the abstract method of interface 
       // interfaceDemo.overrideMethod("Hello, Override Method here"); 
        System.out.println(interfaceDemo);
    } 
  
	/*
	 * // Implementing interface method
	 * 
	 * @Override public void overrideMethod(String str) { System.out.println(str); }
	 */

}
