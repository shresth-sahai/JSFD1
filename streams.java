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

 



