// // import java.util.HashMap;
// // import java.util.stream.Collector;
// // import java.util.stream.Collectors;

// // public class Collections2 {



// //     /*
// //     Map -> object -> maps -> K to a values 

// //     add remove search -> o(1)

// //     Hashmap -> does not maintain order 
// //     Hashtable -> synchronise the hashmap 
// //     LinkedinHashmap-> Maintains the insertion order 
// //     Treemap -> sorts the data internally 



    
// //     */
    
// //     HashMap<Integer,String> student= new HashMap<Integer,String>();

// //    student.put(111,"ABC");
// //     student.put(11,"AC");
   
// //     student.forEach((key,value)-> System.out.print(key + " "+ value));

// //         HashMap<Integer,String> student1= new HashMap<Integer,String>();
// //         student1.putAll(student); 
// //          student1.put(1,"1");

// //          boolean ans= student.containsValue("ABC");


// //          List<String> valueList=student.keySet().stream().collect(Collectors.toList());


// //         String val=student.get(1);
// //         int size=student.size();
// //         student.replace(1,"123");



// // }
// Given a studentNameMarksMap having name of students as keys and their marks in mathematics as values, give required grace marks and pass those students who have scored above 30. Passing marks is 35?