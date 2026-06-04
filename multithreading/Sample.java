package multithreading;

class C extends Thread{

    public void run(){
       for(int i = 0 ; i < 10 ;i++){
        System.out.println("Hi");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       }
    }
}

class D extends Thread{
    public void run(){
       for(int i = 0 ; i < 10 ;i++){
        System.out.println("Hello");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       }
    }
}

public class Sample {

    public static void main(String[] args) {
        C obj1 = new C();
        D obj2 = new D();

        System.out.println(obj1.getPriority());//5 default priority
        //10 max priority  ,1 min priority
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    
    }
}

