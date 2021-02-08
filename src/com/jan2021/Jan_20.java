package com.jan2021;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class SingJan20 {

	private static SingJan20 instance;

	private SingJan20() {

	}

	/**
	 * @return the instance
	 */
	public static SingJan20 getInstance() {

		if (instance == null) {
			synchronized (SingJan20.class) {
				if (instance == null) {
					instance = new SingJan20();
				}
			}
		}
		return instance;
	}

}

interface factInterface {

	public void getList();

}

class AList implements factInterface {

	@Override
	public void getList() {
		// TODO Auto-generated method stub

	}

}

class BList implements factInterface {

	@Override
	public void getList() {
		// TODO Auto-generated method stub

	}

}

class FactMain {

	public factInterface getTest(String str) {

		if (str == null) {
			return null;
		} else if (str.equalsIgnoreCase("A")) {

			return new AList();
		} else if (str.equalsIgnoreCase("B")) {
			return new BList();
		}
		return null;
	}

}

interface opencloseInterface {

	public void data();
}

class AOpen implements opencloseInterface {

	@Override
	public void data() {
		// TODO Auto-generated method stub

	}

}

class BOpen implements opencloseInterface {

	@Override
	public void data() {
		// TODO Auto-generated method stub

	}

}

class OpenMain{
	
	public void getData(opencloseInterface sss) {
		
		if(sss == null) {
			throw new InvalidParameterException("Cannot perform operation");
		}
		sss.data();
	}
}

public class Jan_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BOpen obhBOpen = new BOpen();
		opencloseInterface oo = obhBOpen;
		OpenMain objOpenMain = new OpenMain();
		objOpenMain.getData(oo);
		FactMain objFactMain = new FactMain();
		factInterface aa = objFactMain.getTest("A");
		aa.getList();
		Predicate<String> pre = s -> s.isEmpty();
		List<String> strList = Arrays.asList("Ravindra", "", "Singh", "Om", "Singh", "Anjali", "ANUP", "", "");
		List<String> res = strList.stream().filter(pre).collect(Collectors.toList());
		System.out.println(res);

		List<StudentBean> list = Arrays.asList(new StudentBean("Ravi", "Singh", 100, "Pune", 2000),
				new StudentBean("mar", "Singh", 1001, "Pune", 20001));
		List<StudentBean> disList = list.stream().collect(Collectors.toList());
		System.out.println("Display List : " + disList);

		long countLenthmore3 = list.stream().filter(i -> i.getName().length() > 3).collect(Collectors.counting());
		System.out.println("Lenght of the string : " + countLenthmore3);

		Predicate<StudentBean> startPre = i -> i.getName().startsWith("R");
		List<StudentBean> startwithR = list.stream().filter(startPre).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(startwithR);

		List<String> teamIndia = Arrays.asList("Virat", "Dhoni", "Jadeja");
		List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith");
		List<String> teamEngland = Arrays.asList("Alex", "Bell", "Broad");
		List<String> teamNewZeland = Arrays.asList("Kane", "Nathan", "Vettori");
		List<String> teamSouthAfrica = Arrays.asList("AB", "Amla", "Faf");
		List<String> teamWestIndies = Arrays.asList("Sammy", "Gayle", "Narine");
		List<String> teamSriLanka = Arrays.asList("Mahela", "Sanga", "Dilshan");
		List<String> teamPakistan = Arrays.asList("Misbah", "Afridi", "Shehzad");

		List<List<String>> playersInWorldCup2016 = new ArrayList<>();
		playersInWorldCup2016.add(teamPakistan);
		playersInWorldCup2016.add(teamSriLanka);
		playersInWorldCup2016.add(teamIndia);
		playersInWorldCup2016.add(teamAustralia);
		playersInWorldCup2016.add(teamNewZeland);
		playersInWorldCup2016.add(teamEngland);
		playersInWorldCup2016.add(teamSouthAfrica);
		playersInWorldCup2016.add(teamWestIndies);

		List<String> flat = playersInWorldCup2016.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
		System.out.println(flat);

		List<Integer> mul = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> mulres = mul.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println("Table : " + mulres);

		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(stats);

		Optional<StudentBean> maxSal = list.stream()
				.collect(Collectors.maxBy(Comparator.comparingInt(StudentBean::getSal)));
		System.out.println("Max : " + maxSal);

	}

}
