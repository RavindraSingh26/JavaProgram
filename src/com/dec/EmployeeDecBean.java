/**
 * 
 */
package com.dec;

import java.util.Comparator;

/**
 * @author ravindra.singh02
 *
 */
public class EmployeeDecBean implements Comparable<EmployeeDecBean>, Comparator<EmployeeDecBean>{

	private String name;
	private String address;
	private int sal;
	private int price ;
	
	
	
	public EmployeeDecBean(String name, String address, int sal, int price) {
		super();
		this.name = name;
		this.address = address;
		this.sal = sal;
		this.price = price;
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
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "EmployeeDecBean [name=" + name + ", address=" + address + ", sal=" + sal + ", price=" + price + "]";
	}
	@Override
	public int compare(EmployeeDecBean arg0, EmployeeDecBean arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(EmployeeDecBean o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
