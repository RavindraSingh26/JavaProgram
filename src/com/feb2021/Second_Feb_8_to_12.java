package com.feb2021;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Second_Feb_8_to_12 {

	public static void main(String[] args) {

		// TODO : find First element from List
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> opt = list.stream().findFirst();
		System.out.println(opt);
	}

}
