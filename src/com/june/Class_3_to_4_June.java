package com.june;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class ABCBean {

	private String name;
	private int sal;

	public ABCBean() {

	}

	public ABCBean(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "ABCBean [name=" + name + ", sal=" + sal + "]";
	}

}

class ComExample implements Comparable<ABCBean>, Comparator<ABCBean> {

	@Override
	public int compare(ABCBean d1, ABCBean d2) {
		// TODO Auto-generated method stub

		return d1.getSal() - d2.getSal();
	}

	@Override
	public int compareTo(ABCBean d) {
		// TODO Auto-generated method stub
		return (d.getName()).compareTo(d.getName());
	}

}

public class Class_3_to_4_June {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		List<ABCBean> list = new ArrayList<ABCBean>();

		list.add(new ABCBean("Shaggy", 3));
		list.add(new ABCBean("Lacy", 2));
		list.add(new ABCBean("Roger", 10));
		list.add(new ABCBean("Tommy", 4));
		list.add(new ABCBean("Tammy", 1));

		//Collections.sort(list);// Sorts the array list using Comparable

		for (ABCBean a : list)// printing the sorted list of names
			System.out.print(a.getName() + ", ");

		// Sorts the array list using comparator
		//Collections.sort(list, new ABCBean());
		System.out.println(" ");
		for (ABCBean a : list)// printing the sorted list of ages
			System.out.print(a.getName() + "  : " + a.getName() + ", ");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
       // Calendar c = Calendar.getInstance();
        String pattern = "dd MMM yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse("12-01-2018");
        //simpleDateFormat.add(Calendar.DAY_OF_MONTH, 2);
        String newDate = sdf.format(simpleDateFormat);
        System.out.println("Date after Addition: "+newDate);
        
        String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		
		String s3 = "ABC";
		String s4 = "ABC";
		
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		
	}

}
