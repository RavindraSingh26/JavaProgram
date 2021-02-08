/**
 * 
 */
package com.july;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ravindra.singh02
 *
 */

class ProductDemo{
	
	private String name;
	private int id;
	private int sum;
	
	
	public ProductDemo(String name, int id, int sum) {
		
		this.name = name;
		this.id = id;
		this.sum = sum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}	
}

/*
 * Main Class
 */
public class Class_2_to_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<ProductDemo> list = new ArrayList<ProductDemo>();
		list.add(new ProductDemo("Ravindra1", 101, 100));
		list.add(new ProductDemo("Ravindra2", 101, 100));
		list.add(new ProductDemo("Ravindra3", 101, 100));
		list.add(new ProductDemo("Ravindra4,", 101, 344));
		list.add(new ProductDemo("Ravindra5", 101, 345));
		
		list.stream().filter(pro-> pro.getSum() > 200).forEach(pro->System.out.print(pro.getName()));
	}

}
