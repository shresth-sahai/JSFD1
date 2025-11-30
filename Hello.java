
/*

java full stack dev -> front end + backend (server side )(buisness logic) (databases)

frontend -> HTML CSS JS 
Backedn -> java -> Spring & Spring Boot 
Database -> My SQL 
Tools -> Git  Maven 
Java 

JVM -> java virtual machine -> runs java byte code (compiler -> low level code generated
by java compiler from java source code (user / coder ))
code ->WORA -> provide platform independence -> write once run anywhere 

JRE -> java run time env -> contains JVM + libs needed to run java apps 

JDK -> JRE + compiler + development tool -> 
used for writing and compiling java programs 

*/
// public -> access specifier -> class is available to everyone 
// class -> it tells java to create a class (blueprint of the program)
// object -> actual implemntation 
// main -> entry point of java 
// static -> java can run this method without creating object 
// void return type dont return anything 
//String args -> cmd line args 

public class Hello{
    public static void main(String[] args){
        System.out.print("Hello1");
    }
}
// container -> 

// Token -> small unit of a java program -> meaning to the compiler 
// keywords, identifiers, literals , operators 
// keywords -> reserved words -> cannot be used as variable names
// eg class  public 
// variables -> container contains value of specific type 
// identifiers -> names given to a variable method class 
// eg rules -> cannot be a keyword
// literals -> fixed values inside a code
// int age =10;

// + / *  && 
//Data types -> 





// int age =10 ;
// double salary =10.10;

// 2 types -> 
// primitive -> built in 8  -> specific range 
// byte -> 1 byte -> -128 to 127 
// short -> 2 byte -> -32768 to 32767
// int -> 4 bytes -> -2147483 648 to 2147483 647
// long -> 8 byte 
//float ->4 byte  -> 7 decimal rep
//doubel -> 8 byte ->? 15 decimal 
//char -> 2byte  0 to 65535
// boolean -> 1 bit  true/false

// x++ / ++x 
// x++ -> use and change -> x=x+1
//++x -> x=x+1 -> change and use 

public class Solution{
       public static void main(String[] args){
                     byte x = 127;
                     byte y= x+=2;
                    
                     x++;
                     x++;

                     System.out.print(x);
       }
}

// public class Test {
//     public static void main(String[] args) {
//         byte b = -128;
//         b--;
//         System.out.print(b);
//     }
// } 127 

// public class Test {
//     public static void main(String[] args) {
//         byte b = 125;
//         b += 5;   // b=b+5 
//         System.out.print(b);
//     } -126 
// }

// public class Test {
//     public static void main(String[] args) {
//         char c = 65535;
//         c++;
//         System.out.print((int)c);
//     } // 0 
// }
// public class Test {
//     public static void main(String[] args) {
//         short s = 32767;
//         s++;
//         System.out.print(s);
//     } -32768
// }

// public class Test {
//     public static void main(String[] args) {
//         byte b = 100;
//         b = (byte)(b * 3);
//         System.out.print(b);
//     } 
// } //  -128 to 127 (256 values )
// 300 
// -128 -127 -126 ....... 127 
// 44 
// trick 
// 300 -256 = 44
// 129 -256= -127 

// types of conversion 
// widening / automatic conversion ->lower data type to. ahigher data type 
int var=10;
long varLong=var; // automatic converiosn 

//2 narrowing / expliict 
int intvar=10;
byte bvar=(byte) intvar;

// kind of variables 
// 1 member variable -> 
public class Car{
    int year;
    double speed; // member /instance variables
}
// 2 function -> performs a specific task 
// inside a fucntion/method -> local varaibles 

//3 static variables -> only 1 copy all object -> share the memory 

// non prmitive data -> reference types 

// string interface array class

public class Employee{
    int empId;

    public int getEmpId(){
        return empId;
    }
    public void setEmpId(){
        this.empId=empId;
    }
}
public class Student {
    public static void main(String[] args){
        Employee empObj=new Employee(); // new -> allocated memory , heap memory 
    }
    // in java everthing is pass by value 
    
}
// String -> immutable , string literal 
// heap memory -> string constant pool 
String s1="hello";
String s2="hello";

// s1 , s2 -> heap ("hello") string constant pool 
String s3=new String("hello"); // here it will stored as normal obj 


// interface -> 
// public interface InnerHello {
// public String prof(); 
// }

// public class Teacher implements InnerHello{

// }

// public class Swe implements InnerHello{
    
// }

// array -> sequence of memory storing same data tyep 
int [] arr=new int[5];

// arr[0]=10;
// 

// wrapper class -> autobxing , unboxing 


// int ->Integer 
// call by reference ->

Integer a1=10;
int a=10;
Integer b=a; // autoboxing 



