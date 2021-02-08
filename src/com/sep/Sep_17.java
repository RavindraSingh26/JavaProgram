package com.sep;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Open close Principle
interface SepOpenClose17 {

	public void getList();

	public void getStreamList();
}

class A implements SepOpenClose17 {

	@Override
	public void getList() {
		// TODO Auto-generated method stub

		System.out.println("List Method -------");

		// Sum of the number
		List<Integer> sumList = Arrays.asList(120, 34, 55, 66, 10);
		
		int ss = sumList.stream().filter(i -> i > sumList.size()).mapToInt(i -> i).sum();
		System.out.println("Sum : " + ss);
	}

	@Override
	public void getStreamList() {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("A", "B", "C");
		List<String> str = list.parallelStream().collect(Collectors.toList());

		System.out.println(str);

		// Odd and Even Number
		List<Integer> listInt = Arrays.asList(1, 23, 4, 5, 6, 7, 8, 9, 0, 8, 7, 66);
		List<Integer> odd = listInt.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());

		System.out.println(odd);

		List<Integer> even = listInt.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(even);

	}

}

class B implements SepOpenClose17 {

	@Override
	public void getList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getStreamList() {
		// TODO Auto-generated method stub

	}

}

/*
 * Open Close Logic
 */

class OpenCloseSep17 {

	public void getOpenClose(SepOpenClose17 sepOpenClose17) {

		if (sepOpenClose17 == null) {
			throw new InvalidParameterException("Cannot perform operation");

		}
		sepOpenClose17.getStreamList();
		sepOpenClose17.getList();
	}
}

public class Sep_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA = new A();
		objA.getStreamList();

		SepOpenClose17 objSepOpenClose17 = objA;
		OpenCloseSep17 objOpenCloseSep17 = new OpenCloseSep17();
		objOpenCloseSep17.getOpenClose(objSepOpenClose17);

	}

}
