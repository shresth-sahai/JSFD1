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