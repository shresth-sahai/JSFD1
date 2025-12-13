import java.time.Period;

public class MM {
    public static void main(String[] args) {
        int primitiveVariable =10;
        Person pobj =new Person();

        String stringLiteral="12";
        MemoryManagement memObj=new MemoryManagement();
        memObj.memoryManagementTest(pobj);
    }

    private void memoryManagementTest(Person pobj){
        Person pobj2=pobj;
        String str2="24";
        String str3=new String("1");
    }
    
}


stack                                                heap 
str3                                              "1"
str2                                              memObj
pobj2  --> reference                                     pobj
pobj
primitiveVariable


once scope gets deleted they removed from the stack as well 
now stack get cleared but references are gc will delete the unreferenced objects 
of the heap


MCQS:

1. Which part of JVM memory stores local variables and method call details?

a) Heap
b) Stack
c) Method Area
d) Native Method Stack

2. Where are objects created in Java?

a) Stack
b) Heap
c) Register
d) ClassLoader memory

3. Which component is responsible for removing unused objects from memory?

a) JIT Compiler
b) Garbage Collector
c) Class Loader
d) JVM Monitor

4. Which of the following is stored in the Method Area?

a) Object instances
b) Local variables
c) Class metadata (fields, methods, static variables)
d) Thread call information

5. What happens when an object becomes unreachable?

a) It is immediately destroyed
b) It is eligible for Garbage Collection
c) It is moved to stack
d) It is stored in permanent memory

6. Which reference type does NOT prevent an object from being garbage collected?

a) Strong Reference
b) Weak Reference
c) Static Reference
d) Instance Reference

7. What is stored in the stack memory?

a) Objects and arrays
b) Reference variables and primitive values
c) Static variables only
d) Only method return values

8. Which of the following is true about Heap memory?

a) It is thread-specific
b) It stores object references
c) It is shared among all threads
d) It stores local variables

9. Which of these can cause a Memory Leak in Java?

a) Local variables inside methods
b) Forgetting to close database connections
c) Removing object references
d) Using short-lived objects

10. Which of the following is NOT a memory area in JVM?

a) Heap
b) Stack
c) SSD Storage
d) Method Area