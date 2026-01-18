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



     Callable -> return value 
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

/*

Java Concurrency: Executor & Future MCQs
1. Which of the following is a key difference between the Runnable and Callable interfaces? A) Runnable can return a result, whereas Callable cannot. B) Callable can throw checked exceptions, while Runnable cannot. C) Runnable is used for multithreading, while Callable is only for single-thread execution. D) Callable requires a synchronized block to return data.

2. When calling the get() method on a Future object, what happens if the task has not yet finished? A) It throws a RuntimeException immediately. B) It returns a null value. C) The calling thread blocks until the result is available. D) The task is cancelled automatically.

3. Which method in ExecutorService is best suited for submitting a Callable task and obtaining a Future? A) execute() B) submit() C) shutdown() D) invokeAll()

4. What is the primary advantage of CompletableFuture over a standard Future? A) It uses less memory per thread. B) It allows for functional-style callbacks and chaining of asynchronous tasks. C) It is the only way to run tasks in parallel. D) It automatically synchronizes all shared variables.

5. In CompletableFuture, which method would you use to process the result of a stage and return a new value (transformation)? A) thenAccept() B) thenRun() C) thenApply() D) handle()

6. Which ExecutorService method prevents new tasks from being submitted but allows existing tasks to finish? A) shutdownNow() B) stop() C) shutdown() D) awaitTermination()

7. How does CompletableFuture handle an exception thrown during task execution? A) The JVM crashes immediately. B) The exception is swallowed and the future returns null. C) The future completes exceptionally and can be handled using .exceptionally(). D) The thread pool is shut down automatically.

8. Which method is used to combine two independent CompletableFuture stages when you need both results to proceed? A) thenCompose() B) thenCombine() C) applyToEither() D) allOf()

9. What is the difference between thenApply() and thenCompose()? A) thenApply() is for synchronous tasks; thenCompose() is for asynchronous. B) thenApply() transforms the result; thenCompose() flattens a nested CompletableFuture. C) There is no difference; they are aliases. D) thenCompose() only works with Runnable.

10. Which static method is used to create a CompletableFuture that runs a task asynchronously and returns a value? A) CompletableFuture.runAsync() B) CompletableFuture.supplyAsync() C) CompletableFuture.start() D) CompletableFuture.execute()

*/