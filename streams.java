import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streams {
    
}

/*

java Streams -> pipeline 

Arrays String etc -> streams 
sorting , filtering etc 
useful dealing with bulk processing 

Array , String (Collection )

-> Create Stream 

-> Intermediate Operation (filter , sorted, map , distinct etc)
lazy in nature only executed when we require them 
-> Terminal Operation -> collect , reduce , count etc 

*/

// List<Integer> salaryList= new ArraytList<>();

// salaryList.add(400);
// salaryList.add(4000);
// salaryList.add(100);

// // [400,4000,100]

// long output =salaryList.stream().filter((Integer val)-> val>100).count();

// System.out.print(output);



// different ways to create a java stream 
// List <Integer> l=new Arrays.asList(1,2,3,4);

// Stream<Integer> streamforList=l.stream();

// Integer[] salaryArray={1,2,2};
// Stream<Integer> streamfor=salaryArray.stream();


// Stream<Integer> streamFromStaticMethod=Stream.of(100,200,2000);
// // stream builder 

// Stream.Builder<Integer> streamBuilder=Stream.builder();
// streamBuilder.add(100).add(122).add(234);
// Stream<Integer> streamfromBuilder=streamBuilder.build();

// // stream iterate 
// Stream<Integer> streamFromIterate= Stream.iterate(1000,(Integer,n)-> n+400)
// .limit(5);

 
// 1. What is a Java Stream?

// a) A data structure that stores elements
// b) A sequence of elements supporting functional-style operations
// c) A thread-safe collection
// d) A class used for file handling

// 2. Which of the following best describes Java Streams?

// a) Streams store data permanently
// b) Streams modify the original collection
// c) Streams process data from a source
// d) Streams can be reused multiple times

// 3. Which package contains the Stream API?

// a) java.util
// b) java.util.stream
// c) java.lang
// d) java.io.stream

// 4. Which of the following is TRUE about Java Streams?

// a) Streams can be iterated multiple times
// b) Streams are lazy in nature
// c) Streams always return a List
// d) Streams work only with arrays

// 5. What is the role of the filter() method in Streams?

// a) Converts elements
// b) Sorts elements
// c) Selects elements based on a condition
// d) Terminates the stream

// 6. What type of functional interface does filter() use?

// a) Consumer
// b) Supplier
// c) Predicate
// d) Function

// 7. Which statement about filter() is correct?

// a) It is a terminal operation
// b) It modifies the original data source
// c) It returns a new Stream
// d) It executes immediately

// 8. What happens if no elements satisfy the filter() condition?

// a) Exception is thrown
// b) Original stream is returned
// c) An empty stream is returned
// d) Program terminates

// 9. Which of the following is a correct Stream usage?

// a) list.filter(x -> x > 10)
// b) filter(list, x -> x > 10)
// c) list.stream().filter(x -> x > 10)
// d) stream(list).filter(x -> x > 10)

// 10. Which statement differentiates Streams from Collections?

// a) Collections are lazy, streams are eager
// b) Streams do not store data
// c) Streams allow index-based access
// d) Streams can be modified after creation


