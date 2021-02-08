/**
 * 
 */
package com.oct;

import java.io.Serializable;

/**
 * @author ravindra.singh02
 *
 */
public class EmployeeBeanOct implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int sal;
	private String address;
	
	
	public EmployeeBeanOct(String name, int sal, String address) {
		
		this.name = name;
		this.sal = sal;
		this.address = address;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sal
	 */
	public int getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(int sal) {
		this.sal = sal;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeBeanOct [name=" + name + ", sal=" + sal + ", address=" + address + "]";
	}
		
}
