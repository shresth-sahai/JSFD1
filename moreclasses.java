public class moreclasses {
    // abstract class -> 



    // super and sub classes -> 
    //sub class -> derived class 
    // in absence of any explicit superclass every class is subclass of OBJECT Class 

    // object is the top most class in java

    public static void main(String[] args) {
        Objecttest obj=new Objecttest();
       
        Object obj1=new Person();
        Object obj2-new Audi();
       
        System.out.print(obj1.getClass()); -> class Person 
        System.out.print(obj2.getClass()); -> class Audi 

        // object is parent class of every class in hava and we know the reference of 
        // child class can be kept in parent class
    }
}



