package com.sep;
/*
 * 1. Comparator and Comparabal
 * 2. Thread 
 * 3. User Defined Exception
 * 4. Interface java 8
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

interface Sep10 {

	public void getList();

	public void getMap();
}

interface Sep13 {

	public void getList();

	public void getMap();
}

class TestSep implements Sep10, Sep13 , Serializable, Runnable, Callable<String>,Comparable<Student>, Comparator<Student>{

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		System.out.println("---- List---Find out First element");

		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(23);
		list.add(12);
		list.add(23);
		list.add(230);
		list.add(223);
		list.add(123);

		Iterator<Integer> itr = list.iterator();
		for (int i = 0; i < list.size(); i++) {

			System.out.println("First Element " + list.get(i));
			break;
		}

		List<Integer> listDis = list.stream().distinct().collect(Collectors.toList());
		System.out.println(listDis);
		System.out.println(listDis.size());

		List<String> listString = new ArrayList<String>();
		listString.add("Ravi");
		listString.add("Ravi1");
		listString.add("ravi");
		listString.add("Ravi");
		listString.add("Ravi");
		List<String> disString = listString.stream().distinct().collect(Collectors.toList());
		System.out.println(disString);

		String disStringeq = listString.stream().filter(i -> i.equalsIgnoreCase("ravsssi")).findAny()
				.orElse("Ravindra");
		System.out.println("Data :  " + disStringeq);
	}

	@Override
	public void getMap() {
		// TODO Auto-generated method stub

		List<Student> studentList = Arrays.asList(new Student(101, "Ravindra", "M", 24),
				(new Student(101, "Ravindra", "F", 24)));
		List maleStudents = studentList.stream().filter(i -> i.getGender().equalsIgnoreCase("M"))
				.collect(Collectors.toList());
		System.out.println("Students Details : " + maleStudents);

		Student student = studentList.stream().filter(s -> s.getName().equalsIgnoreCase("John")).findAny().orElse(null);
		System.out.println("Student with Name john :" + student);
		
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		
		 // Java 8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); //[A, B, C, D]

        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10]
        
      //Java 8
        List<String> collect11 = studentList.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(collect11); 
 	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			
			System.out.println(Thread.currentThread());
			
		}
		
		synchronized (TestSep.class) {
			
			try {
				wait(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

/*
 *  Main Class
 * 
 */
public class Class_10_13_19_Sep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSep objTestSep = new TestSep();
		objTestSep.getList();
		objTestSep.getMap();
		
		List studentList=createStudentList();	
		
		// Filter all male students
		/*
		 * List<Student> maleStudents = studentList.stream().filter(s ->
		 * s.getGender().equalsIgnoreCase("M")) .collect(Collectors.toList());
		 * System.out.println("Male students are :" + maleStudents);
		 * 
		 * // Filter based on name Student student = studentList.stream().filter(s ->
		 * s.getName().equalsIgnoreCase("John")).findAny().orElse(null);
		 * System.out.println("Student with Name john :" + student);
		 */
		
		List<Student> employeesList = Arrays.asList(
                new Student(1, "David", "M",100),
                new Student(2, "Brian","M", 100),
                new Student(3, "Charles","M", 200),
                new Student(4, "David", "M",200),
                new Student(5, "Edward", "M",300),
                new Student(6, "David", "M",300));
		
		List<String> str = employeesList.stream().map(i-> i.getName()).distinct().collect(Collectors.toList());
		
		System.out.println(str);
	}

	public static List createStudentList() {
		List studentList = new ArrayList();
		Student s1 = new Student(1, "Arpit", "M", 19);
		Student s2 = new Student(2, "John", "M", 17);
		Student s3 = new Student(3, "Mary", "F", 14);
		Student s4 = new Student(4, "Martin", "M", 21);
		Student s5 = new Student(5, "Monica", "F", 16);
		Student s6 = new Student(6, "Ally", "F", 20);

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		return studentList;
	}

}

class Student {

	private int id;
	private String name;
	private String gender;
	private int age;

	public Student(int id, String name, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}