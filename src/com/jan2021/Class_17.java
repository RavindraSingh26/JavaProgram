package com.jan2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


interface fuunctionTest{
	
	public void testdta();
	
}
public class Class_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<StudentBean> list = Arrays.asList(new StudentBean("ARavi","pune",100,"Pune",2000),new StudentBean("Ravi","Singh",1001,"Pune",20001));
		List<StudentBean> disList = list.stream().collect(Collectors.toList());
		System.out.println("Display List : " + disList);
		
		//Lambda Expression
		
		
		
		//Predicate example
		Predicate<Integer> listInteger = x -> x > 5;
		List<Integer> listD = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> res= listD.stream().filter(listInteger).collect(Collectors.toList());
		System.out.println(res);
		
		Predicate<StudentBean> pre = x -> x.getName().equalsIgnoreCase("R");
		
		List<StudentBean> llBean = list.stream().filter(pre).collect(Collectors.toList());
		System.out.println(llBean);
		
		List<StudentBean> sss = list.stream().filter(i -> i.getName().startsWith("R")).collect(Collectors.toCollection(ArrayList::new));
		Iterator itr = sss.iterator();
	
		while(itr.hasNext()) {
			
			StudentBean ss = (StudentBean) itr.next();
			System.out.println(ss.getLaddress());
			System.out.println(ss.getName());
		}
		//System.out.println(sss);
		
		// list.stream().filter(i -> i.getName().startsWith("R")).forEach(System.out::println);
		
	}

}









