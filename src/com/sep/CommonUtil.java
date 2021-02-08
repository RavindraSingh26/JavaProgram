package com.sep;

public class CommonUtil {

	boolean flag = false;
	public String upload(String str) {
		
		if(str.equalsIgnoreCase("Ravindra")) {
			flag = true;
		}
		
		return str;
	}
	
	public String upload1(String str, boolean flagg) {
		
		if(str.equalsIgnoreCase("Ravindra") && flag) {
			System.out.println("Hello World ---");
		}
		
		return str;
	}

	/**
	 * @return the flag
	 */
	public boolean isFlag() {
		return flag;
	}

	/**
	 * @param flag the flag to set
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
}
