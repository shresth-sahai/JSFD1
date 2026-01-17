class Counter {
    int count = 0;

   synchronized void increment() {
        count++; 
    }
}
class Main {
    public static void main(String[] args) {
        Counter c=new Counter();
        Runnable task = () ->{
            for(int i=0;i<100;i++){
                c.increment();
            }
        };
        Thread t1=new Thread(task);
        Thread t2=new Thread(task);
        t1.start();
        t2.start();
        System.out.print(c.count);
    }
}



class Counter {
    int count = 0;

 synchronized  void increment() {
        count++; 
    }
}
class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        Runnable task = () ->{
            for(int i=0;i<100;i++){
                c.increment();
            }
        };
        Thread t1=new Thread(task);
        Thread t2=new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.print(c.count);
    }
}



// 1. Consider the following code. If two threads call increment() 50 times each, what is the most likely outcome?

// Java

// class Counter {
//     int count = 0;
//     public void increment() {
//         count++; 
//     }
// }
// A) The count will always be exactly 100.

// B) A compilation error occurs because count is not volatile.

// C) The count might be less than 100 due to a Race Condition.

// D) The program will throw an IllegalThreadStateException.

// 2. What happens when a thread enters a synchronized method?

// Java

// public synchronized void update() { ... }
// A) It acquires the "Intrinsic Lock" (Monitor) for that specific object instance.

// B) It prevents all other threads from accessing any variables in the entire program.

// C) It creates a local copy of the object to prevent interference.

// D) It forces the CPU to increase its clock speed for that task.

// 3. In this synchronized block, what does the object lock serve as?

// Java

// private final Object lock = new Object();
// public void doWork() {
//     synchronized(lock) {
//         // critical section
//     }
// }
// A) It is the variable being modified by the threads.

// B) It acts as a "key" or "token"; only the thread holding it can enter the block.

// C) It is a placeholder that does nothing unless the class extends Thread.

// D) it is used to delete the thread once the block is finished.

// 4. Why is the following code considered "Thread Safe"?

// Java

// public synchronized void decrement() {
//     count--;
// }
// A) Because the synchronized keyword makes the count-- operation atomic (all-or-nothing).

// B) Because synchronized methods cannot be interrupted by the OS.

// C) Because it automatically uses the join() method internally.

// D) Because it prevents the variable count from being stored in the CPU cache.

// 5. If thread1 is executing methodA() and thread2 tries to execute methodB() on the SAME object instance, what happens?

// Java

// class Data {
//     public synchronized void methodA() { /* long task */ }
//     public synchronized void methodB() { /* short task */ }
// }
// A) Both execute at the same time because the method names are different.

// B) thread2 is blocked until thread1 finishes methodA() and releases the object's lock.

// C) The JVM creates a second instance of the Data class for thread2.

// D) thread1 is paused to allow thread2 to finish the shorter task.