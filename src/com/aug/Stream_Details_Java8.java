/*

1. What is the Stream.
Ans:
		-> the Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result. 
		-> The more powerful stream operations reduce, collect and flatMap
		
		"A stream represents a sequence of elements and supports different kind of operations to perform computations upon those elements".
		
		List<String> list = Arrays.asList("a1","a2","b1","b2","c1","c2");
		list.stream().filter(s->s.startsWith("c")).map(String :: toUpperCase).sorted().forEach(System.out::println);
		
		
		-> Stream operations are either intermediate or terminal. Intermediate operations return a stream so we can chain multiple intermediate operations without 
		  using semicolons. Terminal operations are either void or return a non-stream result. In the above example filter, map and sorted are intermediate operations 
		  whereas forEach is a terminal operation.


	Different kind of streams:
	
	-> Streams can be created from various data sources, especially collections.
		
		1. stream() = A stream represents a sequence of elements and supports different kind of operations to perform computations upon those elements.
		2. parallelStream() = Parallel streams are capable of operating on multiple threads 

	
	Advanced Operations:
	
	Stream :
	
		1. Collect
			-> Collect is an extremely useful terminal operation to transform the elements of the stream into a different kind of result, e.g. a List, Set or Map. 
			  Collect accepts a Collector which consists of four different operations: a supplier, an accumulator, a combiner and a finisher. This sounds super 
			  complicated at first, but the good part is Java 8 supports various built-in collectors via the Collectors class. So for the most common operations 
			  you don't have to implement a collector yourself.
			  
			  List<Person> filtered =
				    persons
				        .stream()
				        .filter(p -> p.name.startsWith("P"))
				        .collect(Collectors.toList());
				
				System.out.println(filtered);    // [Peter, Pamela]

	   
	   2. FlatMap
	   		-> Map is kinda limited because every object can only be mapped to exactly one other object. But what if we want to transform one object into multiple 
	   		   others or none at all? This is where flatMap comes to the rescue.
	   		   
	   		-> FlatMap transforms each element of the stream into a stream of other objects. So each object will be transformed into zero, one or multiple other 
	   		   objects backed by streams. The contents of those streams will then be placed into the returned stream of the flatMap operation.
	   		   
	   		-> flatMap() helps us to flatten the data structure to simplify further operations:
	   
	   3. Reduce
	   		-> The reduction operation combines all elements of the stream into a single result.
	   		
	   		-> A reduction operation (also called as fold) takes a sequence of input elements and combines them into a single summary result by repeated application 
	   		   of a combining operation. We already saw few reduction operations like findFirst(), min() and max().
	   		
	   			There are three variations of this method, which differ by their signatures and returning types. They can have the following parameters:
	   				1. identity 
	   				2. accumulator 
	   				3. combiner 
	   	4. map
	   			-> map() produces a new stream after applying a function to each element of the original stream.
	   			
	   			
	Parallel Streams:
			-> The API allows creating parallel streams, which perform operations in a parallel mode. When the source of a stream is a Collection or an array 
			   it can be achieved with the help of the parallelStream() method:
			-> If the source of stream is something different than a Collection or an array, the parallel() method should be used:
			
			-> Stream API automatically uses the ForkJoin framework to execute operations in parallel. By default,
			
			-> ForkJoin
			
			-> ExecutorService 
			

	--- Sortng -----
		List<Aug25Bean> list = Arrays.asList(new Aug25Bean("Ravi",103),	new Aug25Bean("Ravindra",102),new Aug25Bean("ARavi",100));
		
		List<Aug25Bean> listResult = list.stream().collect(Collectors.toList());
		System.out.println(listResult);
		
		System.out.println();
		List<Aug25Bean> listSort = list.stream().sorted(Comparator.comparingInt(Aug25Bean::getId)).collect(Collectors.toList());
		System.out.println(listSort);
		
		List<Aug25Bean> listSortName = list.stream().sorted(Comparator.comparing(Aug25Bean::getName)).collect(Collectors.toList());
		//System.out.println(listSort);
		listSortName.forEach(System.out::println);
			
------Distinct
		System.out.println("Remove Duplicate Element");
		List<Aug25Bean> listDup = list.stream()
                .filter( distinctByKey(p -> p.getName()) )
                .collect( Collectors.toList() );
		
		// Let's verify distinct elements
        System.out.println( listDup );
        
        
        //Utility function
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
    
			
	
*/