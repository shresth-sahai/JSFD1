public class Annotations {
    // meta data to java code 
    // usage is optional
    // we can use this meta data info at run time and it adds certain logic 
    // to code 

    // read -> reflection 


    public interface InnerAnnotations {
            public boolean fly();
        
    }

    public class Eagle implements InnerAnnotations{
        @Override
        public boolean fly(){
            return true;
        }
    }
}

/*
Types of annotations 
Pre defined annotations 
Meta Annotatiosn 
@Target 
@Documented 



Code  -> class & Methods
@Override 


Define our custom annotations 


@Depreciated -> used in class/ method warning 
@SupressWarning-> ignore the warning 

interview specific 
Heap pollution -> Object of one type storing the reference of another type 

eg public class Log{

Object[]  objlist=loglist;

List<String> stringloglist=new ArrayList<>();

stringloglist.add("hello");
objlist[0]=stringloglist;

}
https://medium.com/@vinciabhinav7/why-use-spring-annotations-8d2c0fdc1b6f

1. Which package provides classes for Java Reflection?

a) java.util
b) java.lang.reflect
c) java.io
d) java.net

2. What is Java Reflection primarily used for?

a) Improving application performance
b) Inspecting and modifying classes at runtime
c) Compiling Java code
d) Managing memory in JVM

3. Which class is used to represent a loaded class at runtime in Java?

a) Object
b) Class
c) Runtime
d) Reflect

4. Which method is used to get the Class object of a class by name?

a) getClass()
b) Class.get()
c) Class.forName()
d) loadClass()

5. Which Reflection API is used to access methods of a class?

a) Field
b) Method
c) Constructor
d) Modifier

6. What does the following code do?
Class<?> c = obj.getClass();


a) Creates a new object
b) Gets the runtime class of the object
c) Loads a class dynamically
d) Compiles the class

7. Which method allows access to private fields using Reflection?

a) setFinal(true)
b) setPublic(true)
c) setAccessible(true)
d) setPrivate(true)

8. Which of the following can be accessed using Java Reflection?

a) Methods only
b) Fields only
c) Constructors only
d) Methods, fields, and constructors

9. What is a major disadvantage of using Reflection?

a) Compile-time type safety
b) Increased performance
c) Security risks and slower execution
d) Reduced code flexibility

10. Which of the following is TRUE about Java Reflection?

a) It works only at compile time
b) It cannot access private members
c) It allows dynamic object creation
d) It replaces inheritance
*/
