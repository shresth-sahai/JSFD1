// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Stream;

// public class streams {
    
// }

// /*

// java Streams -> pipeline 

// Arrays String etc -> streams 
// sorting , filtering etc 
// useful dealing with bulk processing 

// Array , String (Collection )

// -> Create Stream 

// -> Intermediate Operation (filter , sorted, map , distinct etc)
// lazy in nature only executed when we require them 
// -> Terminal Operation -> collect , reduce , count etc 

// */

// // List<Integer> salaryList= new ArraytList<>();

// // salaryList.add(400);
// // salaryList.add(4000);
// // salaryList.add(100);

// // // [400,4000,100]

// // long output =salaryList.stream().filter((Integer val)-> val>100).count();

// // System.out.print(output);



// // different ways to create a java stream 
// // List <Integer> l=new Arrays.asList(1,2,3,4);

// // Stream<Integer> streamforList=l.stream();

// // Integer[] salaryArray={1,2,2};
// // Stream<Integer> streamfor=salaryArray.stream();


// // Stream<Integer> streamFromStaticMethod=Stream.of(100,200,2000);
// // // stream builder 

// // Stream.Builder<Integer> streamBuilder=Stream.builder();
// // streamBuilder.add(100).add(122).add(234);
// // Stream<Integer> streamfromBuilder=streamBuilder.build();

// // // stream iterate 
// // Stream<Integer> streamFromIterate= Stream.iterate(1000,(Integer,n)-> n+400)
// // .limit(5);

 
// // 1. What is a Java Stream?

// // a) A data structure that stores elements
// // b) A sequence of elements supporting functional-style operations
// // c) A thread-safe collection
// // d) A class used for file handling

// // 2. Which of the following best describes Java Streams?

// // a) Streams store data permanently
// // b) Streams modify the original collection
// // c) Streams process data from a source
// // d) Streams can be reused multiple times

// // 3. Which package contains the Stream API?

// // a) java.util
// // b) java.util.stream
// // c) java.lang
// // d) java.io.stream

// // 4. Which of the following is TRUE about Java Streams?

// // a) Streams can be iterated multiple times
// // b) Streams are lazy in nature
// // c) Streams always return a List
// // d) Streams work only with arrays

// // 5. What is the role of the filter() method in Streams?

// // a) Converts elements
// // b) Sorts elements
// // c) Selects elements based on a condition
// // d) Terminates the stream

// // 6. What type of functional interface does filter() use?

// // a) Consumer
// // b) Supplier
// // c) Predicate
// // d) Function

// // 7. Which statement about filter() is correct?

// // a) It is a terminal operation
// // b) It modifies the original data source
// // c) It returns a new Stream
// // d) It executes immediately

// // 8. What happens if no elements satisfy the filter() condition?

// // a) Exception is thrown
// // b) Original stream is returned
// // c) An empty stream is returned
// // d) Program terminates

// // 9. Which of the following is a correct Stream usage?

// // a) list.filter(x -> x > 10)
// // b) filter(list, x -> x > 10)
// // c) list.stream().filter(x -> x > 10)
// // d) stream(list).filter(x -> x > 10)

// // 10. Which statement differentiates Streams from Collections?

// // a) Collections are lazy, streams are eager
// // b) Streams do not store data
// // c) Streams allow index-based access
// // d) Streams can be modified after creation


// // map -> used to trnasform each elemet 

// Stream<String> nameStram=Stream.of("Hello","HAHAH");

// Stream<String> filtername=nameStram.map((String name )-> name.toLowerCase());


// 1. What is the purpose of the map() method in Java Streams?

// a) To filter elements
// b) To transform each element of the stream
// c) To sort elements
// d) To remove duplicates

// 2. Which functional interface does map() use?

// a) Predicate
// b) Consumer
// c) Function
// d) Supplier

// 3. What is the return type of the map() method?

// a) List
// b) Set
// c) Stream
// d) Array

// 4. Which of the following is a valid usage of map()?

// a) stream.map(x -> x > 10)
// b) stream.map(x -> x * 2)
// c) stream.map(x -> print(x))
// d) stream.map(x -> x == 5)

// 5. Which statement about map() is TRUE?

// a) It modifies the original collection
// b) It is a terminal operation
// c) It transforms each element of the stream
// d) It can be used only once per stream


// map -> transformation of each elemet 
// Stream -> flat map -> [2d] -> [1d]

List<List<String>> sentencelist=Arrays.asList(
    Arrays.asList("1","2","3") ,
    Arrays.asList("1","2","3"),
    Arrays.asList("1","2","3")
);
Stream<String> word1=sentencelist.stream()
    .flatMap((List<String> sentence)-> sentence.stream());

Stream<String> w2=sentence.stream()
.flatMap((List<String> sen)-> sen.stream().map(String val)->val.toLowerCase());

Integer[] arr={1,4,5,53};
Stream<Integer> arrStream=Arrays.stream(arr).distinct();
Stream<Integer> arrStream=Arrays.stream(arr).sorted();
Stream<Integer> arrStream=Arrays.stream(arr).sorted((Integer val1,Integer val2)-> val2-val1);
