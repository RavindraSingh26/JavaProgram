package com.june;

/*
 * 1. How many ways we can create the SingleTOn class in java.
 * 			-> Early Initialization
 */
class EarlyInitSingleton_Example {
    private static final EarlyInitSingleton_Example INSTANCE = new EarlyInitSingleton_Example();
    
    public static EarlyInitSingleton_Example getInstance() {
        return INSTANCE;
    }
    
     // private constructor and other methods...
}



public class SingleTonClass_Example_June_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
