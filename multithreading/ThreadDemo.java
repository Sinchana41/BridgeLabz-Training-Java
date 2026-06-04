package multithreading;

class Counter{

    int count;

    //synchronized -> one thread will not interfear untill other completes
    public synchronized void increment(){
        count++;
    } 
}

public class ThreadDemo {


    public static void main(String[] args) throws Throwable {
        Counter counter = new Counter();
        //override run() using lamda expression
        Runnable obj1 = () ->
        {
            for(int i = 0 ; i < 10000 ;i++){
             counter.increment();
            }
        };

        Runnable obj2 = () ->
        {
           for(int i = 0 ; i < 10000 ;i++){
             counter.increment();
            }
        };

        //Runnable do not have start() ,we need to create thread object and pass Runnable reference
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        //start() -> executes run()
        t1.start();
        t2.start();
        //join() ->main thread will not interfear untill  t1 and t2  completes
        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
