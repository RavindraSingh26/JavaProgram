package com.jan2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Sin {

	private static Sin instance;

	private Sin() {

	}

	public static Sin getInstance() {

		if (instance == null) {

			synchronized (Sin.class) {

				if (instance == null) {
					instance = new Sin();
				}
			}
		}
		return instance;
	}
}

interface AbstractFacInterface {

	public void dis();
}

class AFact implements AbstractFacInterface {

	@Override
	public void dis() {
		System.out.println("A.....");

	}

}

class BFact implements AbstractFacInterface {

	@Override
	public void dis() {
		System.out.println("B.....");

	}

}

class FacttoryMain {

	public AbstractFacInterface getData(String str) {

		if (str == null) {
			return null;
		}
		if (str.equalsIgnoreCase("A")) {
			return new AFact();

		} else if (str.equalsIgnoreCase("B")) {
			return new BFact();

		}
		return null;
	}
}

public class Class_18 {

	public static void main(String[] args) {

		FacttoryMain shapeFactory = new FacttoryMain();

		AbstractFacInterface shape1 = shapeFactory.getData("A");

		shape1.dis();

		// get an object of Rectangle and call its draw method.
		AbstractFacInterface shape2 = shapeFactory.getData("B");
		shape2.dis();
		
		List<StudentBean> list = Arrays.asList(new StudentBean("Ravi","Singh",100,"Pune",2000),new StudentBean("Ravi","Singh",1001,"Pune",20001));
		List<StudentBean> disList = list.stream().collect(Collectors.toList());
		System.out.println("Display List : " + disList);
		
		//convert List to ArrayList
		List<StudentBean> converList = list.stream().collect(Collectors.toCollection(ArrayList :: new));
		System.out.println("Display in ArrayList : " + converList);
		
		//Sort the data based on the list for name.
		List<StudentBean> sortList = list.stream().sorted(Comparator.comparing(StudentBean :: getName)).collect(Collectors.toList());
		System.out.println("Disp sorted date : " + sortList);
		
		//sum of the number.
		List<Integer> listInteger = Arrays.asList(1,2,3,4,5);
		Integer sumResu = listInteger.stream().reduce(0, Integer::sum);
		System.out.println("Sum of the Number : " + sumResu);
		
		List<String> disNa = list.stream().map(s->s.getName()).collect(Collectors.toList());
		System.out.println("Display only Name : " + disNa);
		
		
	}

}
