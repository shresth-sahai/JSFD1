// import nesteddclass.OuterClass;

// public class nesteddclass {
//     // nested class within another class 
//     // 2 type -> static , non static 
//     // static -> no access to non static 
//     class OuterClass{
//         int instanceVariable=10;
//        static int  classVariable=20;

//        static class NestedClass{
//         public void print(){
//             System.out.print(classVariable+"instanceVariable"); // errr 
//         }
//        }
//     }

// }
// class Objecttest{
//     public static void main(String[] args) {
//         OuterClass.NestedClass nestedObj= new OuterClass.NestedClass();
//         nestedObj.print();
//     }
// }
// // static classes can be called directl with the name of the class 
// // so we will need the name of outer class 


// class OuterClass{
//     int instanceVariable=10;


//     static int classVariable=20;
//     private static class NestedClass{
//         public void print(){
//             System.out.print(classVariable);
//         }
//     }
//     public void display(){
//         NestedClass nestedObj=new NestedClass();
//         nestedObj.print();
//     }
// }

// inner class or non statcic nestes class -> it have access to all instance variobales 
// its object can be initiated on after initiating rthe object of outer class 

// class OuterClass{
//     int instanceVariable=10;
//     static int classVariable=20;

//     class InnerClass{
//         public void print(){
//             System.out.print(classVariable+instanceVariable);
//         }
//     }
// }
// OuterClass obj=new OuterClass();
// OuterClass.InnerClass.inobj=obj.new InnerClass();
// inobj.print();


// local inner class 
//these classes are defined in any block 
// cannot be declared as private protected public 

// anoymous inner class

public abstract class Car{
    public abstract void pressBreka();
}
class Test{
    public static void main(String[] args) {
        Car aobj=new Car();

        @Override
        public void pressbreak(){

        }
    }
}
// we cannot crete objext of abstract class but we did 
// sub class get created and name is decided by compiler 
// interfaces as well it works 

1. Which type of class cannot be instantiated directly?

a) Concrete class
b) Abstract class
c) Final class
d) Static nested class

2. Which type of class cannot be extended (cannot have subclasses)?

a) Abstract class
b) Final class
c) Inner class
d) Anonymous class

3. What is TRUE about a static nested class?

a) It can access all members of outer class directly
b) It cannot contain static methods
c) It does not need an instance of the outer class to be used
d) It must be declared abstract

4. An anonymous class is created when:

a) A class is declared without the keyword class
b) A class has no name and is defined at the point of use
c) A class has only abstract methods
d) A class is defined inside an interface

5. Which statement is TRUE about inner classes?

a) They must always be static
b) They cannot access outer class members
c) They are declared inside another class
d) They must implement an interface