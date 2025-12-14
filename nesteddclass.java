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

