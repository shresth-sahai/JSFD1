// public class constructor {
// // used to create an instance -> instance variables -> initialise instance variables 
// // name of constructor ->same as of tthe class
// // return -> no return type 
// // constructor cannot be static , final ,abstract 
// // new keyword tell java to call constructor 
// // WHy ?  ease of dev 
// // do not want overriden 

// // types 
// // default -> do not define java internally provides default constructor 
// // no arg -> it does not take any arg 
// // parametrised constructor -> it takes args and assign them to instance var
// // constructor overload -> multiple constructor with diff parameters 
// // private constructir -> we create a provate constructor but no one outsde class will be able to call it 

// // constructor chaining -> calling one constructor in other , this(). & super()


// String name;
// int empId;
// constructor(){
//     this(10);
// }
// constructor(int empId){
//     this( "ab",empId);
// }
// constructor(String name,int empId){
//     this.name=name;
//     this.empId=empId;
// }
// }
// super -> child class always invokes the constructor of the parent class 
// if we dont write super it will be automatically inserted 
// if the [parent has only a parameterised constructor then it must be
//called uing super (vlaue)] -> otherwise err 
// class Parent{
//     Parent(){
//         System.out.print("Parent Default Constructor");
//     }
// }
// class Child extends Parent{
//     Child(){
//        System.out.print("Child Constructor"); 
//     }
// }
class Parent{
    Parent(String msg){
        System.out.print("ParentConstructor"+msg);   
    }
}
class Child extends Parent{
    Child(){
        super("hellow from child");//always the first value
         System.out.print("ChildConstructor");   
    }
}
public class Main{
    public static void main(String[] args) {
        Child c=new Child();
    }
}
// if both default + parameterised r present -> we can choose 
// super(value )->paramterised one









