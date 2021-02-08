package com.dec;

class SingletonDec{
	
	private static SingletonDec instance;
	
	private SingletonDec() {
		
	}

	/**
	 * @return the instance
	 */
	public static SingletonDec getInstance() {
		
		if(instance == null) {
			synchronized (SingletonDec.class) {
				
				if(instance == null) {
					
				}
			}
		}
		return instance;
	}
	
}
public class Class_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * JSONObject obj = new JSONObject();
		 * 
		 * obj.put("name", "foo"); obj.put("num", new Integer(100)); obj.put("balance",
		 * new Double(1000.21)); obj.put("is_vip", new Boolean(true));
		 * 
		 * System.out.print(obj);
		 */
	      
		
	}

}
