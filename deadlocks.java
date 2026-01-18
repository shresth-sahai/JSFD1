public class deadlocks {
    
    /*
    two threads -> waiting (third thread) -> not getting unblocked 
    -> be not free for further execution 
    Deadlock 
    */

    class Test{
        static Object A = new Object();
        static Object B =new Object();
        public static void main(String[] args) {
            Thread t1=new Thread(()->{
                synchronized(A){
                    synchronized(B){

                    }
                }
            });

        Thread t2=new Thread(()->{
                synchronized(B){
                    synchronized(A){

                    }
                }
            });

                t1.start();
                t2.start();
        }
    }
}

/*

Thread might be cached -> volatile 

volatile boolean flag = true;

Atomic class 
AtomicInteger count =new AtomicInteger(0);

count.incrementAndGet();



MCQS :



what is the primary cause of the "Visibility Problem" in multithreaded applications? A) Threads sharing the same CPU core. B) Each thread having its own cached version of shared resources. C) Threads being unable to access the RAM. D) The JVM shutting down threads unexpectedly.

2. In the UnsafeCounter example (counter++), why is the counter not thread-safe? A) Because int is not a valid type for multithreading. B) Because it suffers from both visibility and synchronization problems. C) Because the getValue() method is private. D) Because Java does not allow incrementing variables in threads.

3. What specific behavior does the volatile keyword trigger to solve visibility issues? A) It locks the variable so only one thread can see it. B) It copies the variable to every thread's local stack. C) It bypasses local thread caching and reads/writes directly to main memory. D) It converts the variable into an object.

4. Consider this code from the article:

Java

public void increment() {
    counter++; 
}
If counter is declared as volatile, why is this still "unsafe"? A) volatile only works for boolean types. B) The increment operation is not atomic (it involves a read and a write). C) volatile makes the variable read-only. D) The JVM ignores volatile on integer types.

5. What does the article describe as a "Race Condition"? A) When two threads finish at the same time. B) When a thread runs faster than the CPU clock. C) When several threads read a value before another one writes it back, overriding results. D) When the main thread finishes before child threads.

6. Which class is used in the Baeldung "Safe" implementation to ensure both visibility and atomicity? A) volatile Integer B) SynchronizedCounter C) AtomicInteger ) LockedInteger

7. How do Atomic classes ensure the increment operation is thread-safe? A) By using the synchronized keyword internally on every method. ) By ensuring the increment is an atomic operation (all-or-nothing). C) By pausing all other threads in the JVM during the update. D) By storing the value in a file on the hard drive.

8. Based on the article's conclusion, when is the volatile keyword most helpful? A) For increment/decrement operations. B) For complex mathematical calculations. C) For intrinsically atomic operations, like setting a flag. D) Only when using the Spring Framework.

9. Which of the following is a disadvantage of using synchronized instead of Atomic classes mentioned in the text? A) It makes the code too short. B) It might create a bottleneck and is less elegant. C) It is not supported in modern Java versions. D) It only works for private variables.

10. Complete the logic from the theory: "Atomic variables help with handling non-atomic operations like ____." A) Variable declaration B) Thread sleeping C) Increment-decrement D) Method naming




*/