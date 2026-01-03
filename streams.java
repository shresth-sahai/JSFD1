import java.util.List;

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

List<Integer> salaryList= new ArraytList<>();

salaryList.add(400);
salaryList.add(4000);
salaryList.add(100);

// [400,4000,100]

long output =salaryList.stream().filter((Integer val)-> val>100).count();

System.out.print(output);

