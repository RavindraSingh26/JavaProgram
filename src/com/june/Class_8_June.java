/**
 * 
 */
package com.june;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ravindra.singh02
 *
 */

class ABC {

	private String name;
	public DEF def;

	
	public ABC(String name, DEF def) {
		super();
		this.name = name;
		this.def = def;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DEF getDef() {
		return def;
	}

	public void setDef(DEF def) {
		this.def = def;
	}

	@Override
	public String toString() {
		return "ABC [name=" + name + ", Address=" + def.getAddress() + "]";
	}
}

class DEF {

	private String address;

	public DEF(String address) {
		super();
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

public class Class_8_June {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		DEF def = new DEF("Pune");
		
		list.add(123);
		list.add(1223);
		list.add(12333);
		list.add(12);
		list.add(1223453);

		System.out.println(list.get(list.size() - 2));
		
		ABC abc = new ABC("Ravindra",def);
		System.out.println(abc.toString());

	}

	{
		System.out.println("Hello");
	}
}
