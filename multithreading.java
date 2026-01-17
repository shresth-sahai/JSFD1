public class multithreading {
    /*
    Thread- > lightweight process 
    Multiple threads share same memory 
    Ability to execute multiple threads simulteneously 
    Why ? 
    -> Better CPU utlisation 
    -> Faster Execution 
    -> Responsive Application 
    -> Parellel Tasks r completed 


    Process  VS THread. 
    */
 // define thread 
    class MyThread extends Thread{
        public void run(){
            System.out.print("THread running");
        }
    }
    class Main {
        public static void main(String[] args) {
            MyThread t=new MyThread();
            t.start();
        }
    }
}

// second way  -> supports multiple inheritence / seperation of task and thread 
class MyTash implements Runnable{
    public void run(){
        System.out.print("THread running"); // thread logic 
    }
}
public class Main{
    public static void main(String[] args) {
        Thread t=new Thread(new MyTash());
        t.start();
    }
}

// Lifecycle -> NEW -> Runnable -> Blocking/waiting -> termination 
// sleep()
//join() wait for thread 
// yield()-> pause and give chance 
// getname()
//setPriority() ->?MIN , NORM , MAX 

    class MyThread extends Thread{
        public void run(){
             t1.join();
            System.out.print("THread running");
        }
    }
    class Main {
        public static void main(String[] args) {
            MyThread t1=new MyThread();
            MyThread t2=new MyThread();
            t1.start();
            t2.start();
        
        }
    }


/*
 what is the primary memory characteristic of threads? A) Each thread has its own isolated memory space. B) Multiple threads share the same memory. C) Threads use virtual memory instead of RAM. D) Threads do not require memory to execute.

Which of the following is NOT listed as a reason to use multithreading in Java? A) Better CPU utilization. B) Faster execution. C) Reduced code complexity. D) Responsive applications.

When defining a thread by extending the Thread class, which method must you override to provide the thread's logic? A) start() B) main() C) execute() D) run()

What is a specific advantage mentioned for using the Runnable interface over extending the Thread class? A) It makes the code run significantly faster. B) It automatically handles thread synchronization. C) It supports multiple inheritance and separation of task from thread. D) It allows the use of the yield() method which Thread does not.

In the Runnable implementation provided, how is the thread actually started? A) By calling new MyTash().run(); B) By calling new Thread(new MyTash()).start(); C) By calling new MyTash().start(); D) By calling Thread.execute(new MyTash());

Which sequence correctly represents the Thread Lifecycle as listed in the notes? A) NEW -> Running -> Waiting -> Dead B) Created -> Runnable -> Blocked -> Finished C) NEW -> Runnable -> Blocking/waiting -> termination D) Start -> Execute -> Sleep -> End

What is the purpose of the join() method? A) To merge two different memory spaces into one. B) To force a thread to stop immediately. ) To wait for a specific thread to finish its execution. D) To combine two threads into a single process.

According to the notes, what does the yield() method do? A) It kills the current thread. B) It pauses the current thread to give a chance to other threads. C) It puts the thread into a permanent waiting state. D) It increases the priority of the current thread.

Which of the following are listed as valid priority levels for setPriority()? A) LOW, MEDIUM, HIGH B) 1, 5, 10 C) START, RUN, END D) MIN, NORM, MAX

In the final code snippet provided, if t1.join() is called inside a thread's run() method, what is the expected behavior? A) The thread will wait for t1 to complete before proceeding. B) The thread will terminate t1 immediately. C) The thread will share its CPU time equally with t1. D) Both threads will stop and wait for the main method.




1. Consider the following code. What will be the result?

Java

MyThread t1 = new MyThread();
t1.run(); 
A) A new call stack is created and a new thread starts. B) The run() method is executed by the current (main) thread like a normal method. C) A compilation error occurs because start() was not called. D) The thread moves directly to the WAITING state.

2. Which code snippet correctly implements the "Second Way" (Runnable) mentioned in your notes? A) Thread t = new Thread(new MyTash()); t.start(); B) Thread t = new MyTash(); t.start(); C) MyTash t = new MyTash(); t.start(); D) Thread t = new Thread(); t.start(new MyTash());

3. In your snippet, class MyTash implements Runnable. What is the primary reason to choose this over extends Thread? A) It allows MyTash to extend another class, like Applet or BaseService. B) It is the only way to use the sleep() method. C) It automatically synchronizes the run() method. ) It prevents the thread from ever entering the BLOCKED state.

4. Study this lifecycle logic. Which method call moves a thread from NEW to Runnable? A) t.run() B) t.yield() C) t.start() D) t.resume()

5. Look at the following code. What is the most likely outcome?

Java

Thread t1 = new Thread(new MyTash());
t1.start();
t1.start();
A) The thread runs twice. B) Two separate threads are created. C) It throws an IllegalThreadStateException at runtime. D) The second start() call is simply ignored by the JVM.

6. What is the effect of the following line in a program with multiple threads? Thread.currentThread().setPriority(Thread.MAX_PRIORITY); A) It guarantees the current thread will finish before any others start. B) It gives the current thread a higher preference for CPU time in the scheduler. C) It prevents other threads from using the shared memory. D) It doubles the execution speed of the run() method.

7. If t1 is a running thread, what happens when the main thread executes t1.join()? A) The main thread stops until t1 completes its task. B) t1 stops and waits for the main thread to complete. C) Both threads are terminated immediately. D) The two threads begin sharing the exact same call stack.

8. In your code snippet, you have System.out.print("Thread running"). If five threads are started at once, why might the output be unpredictable? A) Because threads do not have access to System.out. B) Because the OS scheduler decides the order of execution, not the code order. C) Because print statements cause threads to move to the TERMINATED state. D) Because the Runnable interface does not support printing.

9. What is the correct way to put the current thread to sleep for 1 second? 
A) Thread.sleep(1); B) Thread.sleep(1000); C) this.wait(1000); D) Thread.yield(1000);

10. Which statement about the "Process vs Thread" section of your notes is TRUE? A) Processes share the same memory; threads have separate memory. B) A process is a lightweight thread. C) Multiple threads exist within the context of a single process. D) Threads are more "heavyweight" than processes.
*/