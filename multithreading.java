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

*/