package com.june;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

class SerialClass implements Serializable, Callable<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	private transient int id;

	public SerialClass(String name, String address, int id) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "SerialClass [name=" + name + ", address=" + address + "]";
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

class SerialExtends extends SerialClass {

	public SerialExtends(String name, String address, int id) {
		super(name, address, id);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

public class Class_June_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SerialExtends objSerialExtends = new SerialExtends("", "", 101);

		objSerialExtends.toString();

		List<String> list = new ArrayList<String>();
		list.add("ABS");
		list.add("ABS1");
		list.add("ABS2");
		list.add("ABS3");
		list.add("ABS");

		for (String str : list) {

			System.out.println("List :" + str);
		}

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("ITR : " + itr.next());
		}

	}

}
