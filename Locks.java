import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Locks {

/*
Intrinsinc -> build in java object 
synchronised

Extrinsic Lock -> 
Provided by java.util.concurrent package 
More control on the conditions 

class Counter{
int c=0;

synchronised void incr(){
c++:
}

}


*/

// Lock , Reentrant Lock , ReadWrite Lock , condition 
// avoid deadlock on scale 
// FIFO , high thorughput 
// class Counter{

//     private int count=0;
//     final ReentrantLock lock =new ReentrantLock();

//     void incr(){
//         lock.lock();

//         try{
//             count++;
//         }finally{
//             lock.unlock();
//         }
//     }
//     int get(){
//         return count;
//     }
// }

// read locks -> multiple reader single writer 
// caching 
class DataStore{
    int data;

    final ReadWriteLock rw=new ReentrantReadWriteLock();
    void read(){
        rw.readLock().lock();
        try{
            System.out.print(data);
        }
        finally{
            rw.readLock().unlock();
        }
    }
    void write(){
        rw.writeLock().lock();
        try{
            data=value;

        }
        finally{
            rw.writeLock().unlock();
        }
    }
}
}
