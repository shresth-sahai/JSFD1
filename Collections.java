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

/*
Exception handling 

OBject -> throwables -> err 
                    -> excetion -> checked(compile ,try catch throws)(IO,SQL,Filefound) , 
                    unchecked-> Run time -> Nullpointer, Arithmatic,array index of bound
     try-> code that may cause exception
     catch-> hadnles exception
     finaaly always executes 
     throw explictly throws expection 
     throws -> declare exceptio n





int a=1;int b=0;
try{

}
catch(ArthimeticException e){

}
finally{
}

if(age<18 ){
throw new Exception ("")}


void filename() throws IOexpection{
}
*/
}

class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String message){
        super(message);
    }
}
class NameNotValidException extends Exception{
    public NameNotValidException(String message){
        super(message);
    }
}

class Student{
int rollno;
int age;
String course;

Student(int rollno,int age,String name,String course)
{
        if(age<15 || age>21){
            throw new AgeNotWithinRangeException("")
        }
        if(!name)
}


}


class VOter{

    int voterId;
    int age;
    String name;
    VOter(int voterId,String name,int age){
        if(age<!8){
            throw new IllegalArgumentException("Invalid age!");
        }
        this.voterId=voterId;
        this.name=name;
        this.age=age;
    }
}