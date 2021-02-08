package com.aug;
/*
 * Open and close Principle
 */

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Aug25Bean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int id;

	public Aug25Bean(String name, int id) {
		super();
		this.name = name;
		this.id = id;
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

	@Override
	public String toString() {
		return "Aug25Bean [name=" + name + ", id=" + id + "]";
	}

}

public class Class_25_aug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Aug25Bean> list = Arrays.asList(new Aug25Bean("ARavi",103),	new Aug25Bean("ARavi",104),new Aug25Bean("Ravindra",102),new Aug25Bean("ARavi",100));
		
		List<Aug25Bean> listResult = list.stream().collect(Collectors.toList());
		System.out.println(listResult);
		
		System.out.println();
		List<Aug25Bean> listSort = list.stream().sorted(Comparator.comparingInt(Aug25Bean::getId)).collect(Collectors.toList());
		System.out.println(listSort);
		
		System.out.println();
		List<Aug25Bean> listSort1 = list.stream().sorted(Comparator.comparingInt(Aug25Bean::getId)).collect(Collectors.toList());
		//System.out.println(listSort);
		listSort1.forEach(System.out::println);
		
		System.out.println();
		List<Aug25Bean> listSortName = list.stream().sorted(Comparator.comparing(Aug25Bean::getName)).collect(Collectors.toList());
		//System.out.println(listSort);
		listSortName.forEach(System.out::println);
		
		System.out.println("Remove Duplicate Element");
		List<Aug25Bean> listDup = list.stream()
                .filter( distinctByKey(p -> p.getName()) )
                .collect( Collectors.toList() );
		
		// Let's verify distinct elements
        System.out.println( listDup );
	}
	
	//Utility function
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

}
