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


