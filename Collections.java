import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Collections {
    /*
     java 1.2 
     collection -> grp of objects 

     util 

     provides us with the architecture to manage these grp of objects 

     Array, vector ,map 

        collection
     Queue.                  List.                          Set. 
    Pq, deque               arraylist vector            sortedset hasheset

        arraydeque                      stack



    */

     int arr[] =new int[4];

     arr[0]=1;

     int val=arr[0];

     Vector<Integer> vector =new Vector();
     vector.add(1);

     vector.get(0);

     List <Integer> values1= new ArrayList<>();
     values.add(1);
     values.add(2);
     Iterator<Integer > valuesIterator=values1.iterator();
     while(valuesIterator.hasNext()){
        int val=valuesIterator.next();
        System.out.print(val);
        if(val==3){
            valuesIterator.remove();
        }
     }

     // foreach 

     values1.forEach((Integer val)-> System.out.print(val));

     /*
     
     It is an interface which provides methods to work on grp of objects 

     size ,isEmpty 
     contians 
     toArray 
     add remove removeall clear 
     equals stream 
     */

List <Integer> values= new ArrayList<>();
values.add(1);
values.add(2);

System.out.print(values.size());
System.out.print(values.isEmpty());
System.out.print(values.contains(1));
values.remove(1);
Stack<Integer> stackValues=new Stack<>();
System.out.print(values.containsAll(stackValues));
System.out.print(values.size());
values.clear()
System.out.print(values.isEmpty(O));

}
