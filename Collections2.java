// // // import java.util.HashMap;
// // // import java.util.stream.Collector;
// // // import java.util.stream.Collectors;

// // // public class Collections2 {



// // //     /*
// // //     Map -> object -> maps -> K to a values 

// // //     add remove search -> o(1)

// // //     Hashmap -> does not maintain order 
// // //     Hashtable -> synchronise the hashmap 
// // //     LinkedinHashmap-> Maintains the insertion order 
// // //     Treemap -> sorts the data internally 



    
// // //     */
    
// // //     HashMap<Integer,String> student= new HashMap<Integer,String>();

// // //    student.put(111,"ABC");
// // //     student.put(11,"AC");
   
// // //     student.forEach((key,value)-> System.out.print(key + " "+ value));

// // //         HashMap<Integer,String> student1= new HashMap<Integer,String>();
// // //         student1.putAll(student); 
// // //          student1.put(1,"1");

// // //          boolean ans= student.containsValue("ABC");


// // //          List<String> valueList=student.keySet().stream().collect(Collectors.toList());


// // //         String val=student.get(1);
// // //         int size=student.size();
// // //         student.replace(1,"123");



// // // }
// // Given a studentNameMarksMap having name of students as keys and their marks in mathematics as values, give required grace marks and pass those students who have scored above 30. Passing marks is 35?


// int [] inputarray={1,5,3,1,4,6,6,5};
// HashMap<Integer,Integer> elemFreq=new HashMap<>();

// for(int i: inputarray){
//     elemFreq.put(i,elemFreq.getOrDefault(i,0)+1); 

// }

// String val="javajavajava";

// HashMap<Character,Integer> charFreq=new HashMap<Character,Integer> ();

// for(char c:val.toCharArray()){
//     if(c!='') charFreq.put(c,charFreq.getOrDefault(c,0)+1);

//     charFreq.forEach((key,val)-> System.out.print(key + "" +val));
// }





// Map<String,List<String>> map=new HashMap<>();

// for(String w:strs){
//     char [] chars=new String(chars);

//     Array.sort(chars);

//     String sortedWOrd=new String(chars);

//     if(!map.containsKey(sortedWOrd)){
//         map.put(sortedWOrd,new ArrayList<>());
//     }
//     map.get(sortedWOrd).add(word);

//     return new ArrayList<>(map.values);
// }