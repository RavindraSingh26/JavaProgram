package com.aug;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Class_24_Aug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("a1","a2","b1","b2","c1","c2");
		list.stream().filter(s->s.startsWith("c")).map(String :: toUpperCase).sorted().forEach(System.out::println);
		
		Arrays.asList("a1", "a2", "a3")
	    .stream()
	    .findFirst()
	    .ifPresent(System.out::println);  // a1
		
		list.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println();
		List<Person> pList = Arrays.asList(new Person("Ravindra",101), new Person("Peter", 23),
		        new Person("Pamela", 23),
		        new Person("David", 12));
		
		
		List<Person> filterPerson = pList.stream().filter(p -> p.name.startsWith("R")).collect(Collectors.toList());
		
		System.out.println(filterPerson);
		
		
		Map<Integer, List<Person>> personsByAge = pList
			    .stream()
			    .collect(Collectors.groupingBy(p -> p.age));

			personsByAge
			    .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

			String phrase = pList
				    .stream()
				    .filter(p -> p.age >= 18)
				    .map(p -> p.name)
				    .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

				System.out.println(phrase);	
				
				Person result =
						pList
					        .stream()
					        .reduce(new Person("", 0), (p1, p2) -> {
					            p1.age += p2.age;
					            p1.name += p2.name;
					            return p1;
					        });

					System.out.format("name=%s; age=%s", result.name, result.age);
					
					Integer[] empIds = { 1, 2, 3 };
				    
					List<List<String>> namesNested = Arrays.asList( 
						      Arrays.asList("Jeff", "Bezos"), 
						      Arrays.asList("Bill", "Gates"), 
						      Arrays.asList("Mark", "Zuckerberg"));

						    List<String> namesFlatStream = namesNested.stream()
						      .flatMap(Collection::stream)
						      .collect(Collectors.toList());
	}
	
}
