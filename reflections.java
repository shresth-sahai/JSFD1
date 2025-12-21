public class reflections {
    // it is used to examine the class methods and fileds interface at run time 
/*
for eg -> what are all methoda present in class 
what all field etc 
what return type 
what is access modifer 
interfaces 
changes the values of public and private

steps -> 
we first need to get the object of the class 
class Class -> instance of class that is geenrated during run time 
JVM creates one class object for each every class during run time 
*/

// 3 ways 
Class birdClass = Class.forName("reflections");

Class birdClass1 = reflections.class;

Bird obj=new Bird() ;
Class birClass=obj.getClass();

}

