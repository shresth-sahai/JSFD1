import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class ThreadPool {
    
    /*
    
    Executor framework -> 

    Thread Pool -> pool of threads 

    ExecutorService executor = Executors.newFixedThreadPool(3);

    executor.submit(()->{
    System.out.println("Task Executed!")
    })
    
    executor.shutdown();
    
    Types 

    1 newFixedThreadPool() -> fixed
    2 newCachedThreadPool() ->dynamic 
    3 newSingleThreadExecutor() ->one thread 
    4 ScheduledExecutor() -> delayed tasks 



     Callable -> return vakeu 
      & Future 

      Runnable-> no return 
    */
   
    Callable <Integer> task =() -> 10;

    Future<Integer> result= executor.submit(task);
    // mordern java 
    CompletableFuture.supplyAsync(()->10 )
    .thenApply(x -> x*2)
    .thenAccept(System.out::println);

   // async non blockingg
}
