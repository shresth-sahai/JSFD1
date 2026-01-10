// // // // import java.util.Arrays;
// // // // import java.util.List;
// // // // import java.util.stream.Stream;

// // // // public class streams {
    
// // // // }

// // // // /*

// // // // java Streams -> pipeline 

// // // // Arrays String etc -> streams 
// // // // sorting , filtering etc 
// // // // useful dealing with bulk processing 

// // // // Array , String (Collection )

// // // // -> Create Stream 

// // // // -> Intermediate Operation (filter , sorted, map , distinct etc)
// // // // lazy in nature only executed when we require them 
// // // // -> Terminal Operation -> collect , reduce , count etc 

// // // // */

// // // // // List<Integer> salaryList= new ArraytList<>();

// // // // // salaryList.add(400);
// // // // // salaryList.add(4000);
// // // // // salaryList.add(100);

// // // // // // [400,4000,100]

// // // // // long output =salaryList.stream().filter((Integer val)-> val>100).count();

// // // // // System.out.print(output);



// // // // // different ways to create a java stream 
// // // // // List <Integer> l=new Arrays.asList(1,2,3,4);

// // // // // Stream<Integer> streamforList=l.stream();

// // // // // Integer[] salaryArray={1,2,2};
// // // // // Stream<Integer> streamfor=salaryArray.stream();


// // // // // Stream<Integer> streamFromStaticMethod=Stream.of(100,200,2000);
// // // // // // stream builder 

// // // // // Stream.Builder<Integer> streamBuilder=Stream.builder();
// // // // // streamBuilder.add(100).add(122).add(234);
// // // // // Stream<Integer> streamfromBuilder=streamBuilder.build();

// // // // // // stream iterate 
// // // // // Stream<Integer> streamFromIterate= Stream.iterate(1000,(Integer,n)-> n+400)
// // // // // .limit(5);

 
// // // // // 1. What is a Java Stream?

// // // // // a) A data structure that stores elements
// // // // // b) A sequence of elements supporting functional-style operations
// // // // // c) A thread-safe collection
// // // // // d) A class used for file handling

// // // // // 2. Which of the following best describes Java Streams?

// // // // // a) Streams store data permanently
// // // // // b) Streams modify the original collection
// // // // // c) Streams process data from a source
// // // // // d) Streams can be reused multiple times

// // // // // 3. Which package contains the Stream API?

// // // // // a) java.util
// // // // // b) java.util.stream
// // // // // c) java.lang
// // // // // d) java.io.stream

// // // // // 4. Which of the following is TRUE about Java Streams?

// // // // // a) Streams can be iterated multiple times
// // // // // b) Streams are lazy in nature
// // // // // c) Streams always return a List
// // // // // d) Streams work only with arrays

// // // // // 5. What is the role of the filter() method in Streams?

// // // // // a) Converts elements
// // // // // b) Sorts elements
// // // // // c) Selects elements based on a condition
// // // // // d) Terminates the stream

// // // // // 6. What type of functional interface does filter() use?

// // // // // a) Consumer
// // // // // b) Supplier
// // // // // c) Predicate
// // // // // d) Function

// // // // // 7. Which statement about filter() is correct?

// // // // // a) It is a terminal operation
// // // // // b) It modifies the original data source
// // // // // c) It returns a new Stream
// // // // // d) It executes immediately

// // // // // 8. What happens if no elements satisfy the filter() condition?

// // // // // a) Exception is thrown
// // // // // b) Original stream is returned
// // // // // c) An empty stream is returned
// // // // // d) Program terminates

// // // // // 9. Which of the following is a correct Stream usage?

// // // // // a) list.filter(x -> x > 10)
// // // // // b) filter(list, x -> x > 10)
// // // // // c) list.stream().filter(x -> x > 10)
// // // // // d) stream(list).filter(x -> x > 10)

// // // // // 10. Which statement differentiates Streams from Collections?

// // // // // a) Collections are lazy, streams are eager
// // // // // b) Streams do not store data
// // // // // c) Streams allow index-based access
// // // // // d) Streams can be modified after creation


// // // // // map -> used to trnasform each elemet 

// // // // Stream<String> nameStram=Stream.of("Hello","HAHAH");

// // // // Stream<String> filtername=nameStram.map((String name )-> name.toLowerCase());


// // // // 1. What is the purpose of the map() method in Java Streams?

// // // // a) To filter elements
// // // // b) To transform each element of the stream
// // // // c) To sort elements
// // // // d) To remove duplicates

// // // // 2. Which functional interface does map() use?

// // // // a) Predicate
// // // // b) Consumer
// // // // c) Function
// // // // d) Supplier

// // // // 3. What is the return type of the map() method?

// // // // a) List
// // // // b) Set
// // // // c) Stream
// // // // d) Array

// // // // 4. Which of the following is a valid usage of map()?

// // // // a) stream.map(x -> x > 10)
// // // // b) stream.map(x -> x * 2)
// // // // c) stream.map(x -> print(x))
// // // // d) stream.map(x -> x == 5)

// // // // 5. Which statement about map() is TRUE?

// // // // a) It modifies the original collection
// // // // b) It is a terminal operation
// // // // c) It transforms each element of the stream
// // // // d) It can be used only once per stream


// // // // map -> transformation of each elemet 
// // // // Stream -> flat map -> [2d] -> [1d]

// // // List<List<String>> sentencelist=Arrays.asList(
// // //     Arrays.asList("1","2","3") ,
// // //     Arrays.asList("1","2","3"),
// // //     Arrays.asList("1","2","3")
// // // );
// // // Stream<String> word1=sentencelist.stream()
// // //     .flatMap((List<String> sentence)-> sentence.stream());

// // // Stream<String> w2=sentence.stream()
// // // .flatMap((List<String> sen)-> sen.stream().map(String val)->val.toLowerCase());

// // // Integer[] arr={1,4,5,53};
// // // Stream<Integer> arrStream=Arrays.stream(arr).distinct();
// // // Stream<Integer> arrStream=Arrays.stream(arr).sorted();
// // // Stream<Integer> arrStream=Arrays.stream(arr).sorted((Integer val1,Integer val2)-> val2-val1);



// // // // 1. What will be the output of the following code?
// // // // List<Integer> list = Arrays.asList(1, 2, 3, 4);
// // // // list.stream()
// // // //     .map(x -> x * 2)
// // // //     .forEach(System.out::print);


// // // // a) 1234
// // // // b) 2468
// // // // c) 2 4 6 8
// // // // d) Compilation error

// // // // 2. What is the result of this stream operation?
// // // // List<String> list = Arrays.asList("a", "bb", "ccc");
// // // // list.stream()
// // // //     .map(String::length)
// // // //     .forEach(System.out::print);


// // // // a) abc
// // // // b) 123
// // // // c) 1 2 3
// // // // d) Compilation error

// // // // 3. What does this code produce?
// // // // List<Integer> list = Arrays.asList(1, 2, 2, 3, 3);
// // // // list.stream()
// // // //     .distinct()
// // // //     .forEach(System.out::print);


// // // // a) 123
// // // // b) 12233
// // // // c) 1 2 3
// // // // d) Runtime exception

// // // // 4. What will be the output?
// // // // List<Integer> list = Arrays.asList(5, 3, 1, 4);
// // // // list.stream()
// // // //     .sorted()
// // // //     .forEach(System.out::print);


// // // // a) 5314
// // // // b) 1345
// // // // c) 5431
// // // // d) Compilation error

// // // // 5. What is the output of the following?
// // // // List<List<Integer>> list = Arrays.asList(
// // // //     Arrays.asList(1, 2),
// // // //     Arrays.asList(3, 4)
// // // // );

// // // // list.stream()
// // // //     .flatMap(l -> l.stream())
// // // //     .forEach(System.out::print);


// // // // a) [1,2][3,4]
// // // // b) 1234
// // // // c) 12 34
// // // // d) Compilation error

// // // // 6. What will this code print?
// // // // List<String> list = Arrays.asList("java", "stream", "api");
// // // // list.stream()
// // // //     .map(s -> s.toUpperCase())
// // // //     .sorted()
// // // //     .forEach(System.out::print);


// // // // a) JAVASTREAMAPI
// // // // b) APIJAVASTREAM
// // // // c) STREAMJAVAAPI
// // // // d) Runtime error

// // // // 7. Which operation is responsible for converting a nested structure into a flat structure?
// // // // List<List<String>> list = ...


// // // // a) map()
// // // // b) filter()
// // // // c) flatMap()
// // // // d) distinct()

// // // // 8. What is the output of the following code?
// // // // List<Integer> list = Arrays.asList(3, 1, 2, 3, 2);
// // // // list.stream()
// // // //     .distinct()
// // // //     .sorted()
// // // //     .forEach(System.out::print);


// // // // a) 31232
// // // // b) 123
// // // // c) 321
// // // // d) Compilation error

// // // // 9. What will be printed?
// // // // List<String> list = Arrays.asList("a", "bb", "ccc");
// // // // list.stream()
// // // //     .flatMap(s -> Stream.of(s.length()))
// // // //     .forEach(System.out::print);


// // // // a) abc
// // // // b) 123
// // // // c) 1 2 3
// // // // d) Compilation error

// // // // 10. Which of the following statements is TRUE?

// // // // a) map() removes duplicates
// // // // b) flatMap() returns Stream<Stream<T>>
// // // // c) distinct() uses equals() and hashCode()
// // // // d) sorted() modifies the original collection


// // // // peek ->helps in finidng intermediate results 

// // // List<Integer>  numbers= Arrays.asList(2,1,3,4,6);
// // // Stream<Integer> numberStream=numbers.stream().
// // //                     filter((Integer val)-> val>2) 
// // //                     .peek((Integer val)-> System.out.print(val)) // 3 4 6 
// // //                     .map((Integer val)->1 +val);


// // // Stream<Integer> numberStream1=numbers.stream().limit(3);      // 2 1 3 
// // // List<Integer> numberans=numberStream1.collect(Collectors.toList());


// // // // skip 
// // // Stream<Integer> numberStream1=numbers.stream().skip(3); // 4,6 



// // // 1. What will be the output of the following code?
// // // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
// // // list.stream()
// // //     .skip(2)
// // //     .forEach(System.out::print);


// // // a) 12345
// // // b) 345
// // // c) 12
// // // d) 2345

// // // 2. What is the result of this code?
// // // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
// // // list.stream()
// // //     .limit(3)
// // //     .forEach(System.out::print);


// // // a) 345
// // // b) 123
// // // c) 15
// // // d) Compilation error

// // // 3. What will be printed by the following code?
// // // List<Integer> list = Arrays.asList(10, 20, 30, 40);
// // // list.stream()
// // //     .peek(x -> System.out.print(x))
// // //     .limit(2)
// // //     .forEach(x -> {});


// // // a) 10203040
// // // b) 1020
// // // c) No output
// // // d) Runtime exception

// // // 4. What is the main purpose of peek() in Java Streams?

// // // a) To transform stream elements
// // // b) To remove elements
// // // c) To debug or inspect elements in the stream pipeline
// // // d) To terminate the stream

// // // 5. Which of the following statements is TRUE?

// // // a) skip() modifies the original collection
// // // b) limit() is a terminal operation
// // // c) peek() does not work without a terminal operation
// // // d) peek() replaces forEach()

// // Problem:
// // Given a list of integers with duplicates, use Java Streams to:

// // Remove duplicates

// // Sort the elements in ascending order

// // Print the result

// // Input:
// // [5, 3, 1, 3, 2, 5, 1]

// // Expected Output:
// // 1 2 3 5



// // Problem:
// // Given a List<List<Integer>>, write a Stream program to:

// // Flatten it into a single list

// // Print all elements

// // Input:
// // [[1, 2], [3, 4], [5]]

// // Expected Output:
// // 1 2 3 4 5






// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online
// import java.lang.classfile.ClassFile.Option;
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
        
        
//         // List<Integer> list=Arrays.asList(1,2,34,0,34);
        
//         // list.stream().
//         //     distinct().
//         //     sorted().
//         //     forEach(System.out::println);
        
//         // List<List<Integer>> list=Arrays.asList(
//         //     Arrays.asList(1,2,3),
//         //     Arrays.asList(4,2,3)
//         //     );
//         //     list.stream().
//         //         flatMap(innerList-> innerList.stream())
//         //             .forEach(n -> System.out.println(n));



//         List<String> numbers=Arrays.asList("2","1","2");

//         IntStream nstream=numbers.stream().mapToInt((String val)-> Integer.parseInt(val));


//         // WHy ? Intermiediate lazy ope-> 
//         // count -> 
//   List<Integer> number1=Arrays.asList(1,2);

//         Optional<Integer> reducedVal=numbers1.stream()
//                 .reduce((Integer val1,Integer val2)-> (val1*2/10+100+val2));

//                 // collect -> used to collect elements and store them as List 

//                 // anyMatch -> checks id any any in steam mathcing the return boolean 

//                 // allMatch 
//                 // noneMatch 

//                 // findFIrst 
//                 //findRandom

//                 // one terminal operation is used and it closed then the stream cannot be reused 



//                 // parellel stream -> 
//                 //concurrently 
//                 // tkae advantage od core cpu 

        
//     }
// }