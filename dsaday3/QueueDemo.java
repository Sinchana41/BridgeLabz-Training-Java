class QueueUsingArray{

    int[] queue = new int[10];
    int rear = -1;
    int front = -1 ;
    int count;

    public void enQueue(int data){

        if(rear == queue.length-1){
            System.out.println("queue is full");
            return;
        }

        if(front == -1 ){
            front = 0;
        }
        queue[++rear] = data;
        count++;
    }

    public int deQueue(){

         if(front == -1){
            System.out.println("queue is empty");
            return 0;
        }

        int data = queue[front++];
        count--;

        if(front > rear){
            front = rear = -1;
        }

        return data;

    }

    public int peek(){
        return queue[rear];   
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return front == -1;
    }

     public void show(){

        if(front == -1 && rear ==-1){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = front;i <= rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }

}

public class QueueDemo {

    public static void main(String[] args) {
        QueueUsingArray array = new QueueUsingArray();

        array.enQueue(10);
        array.enQueue(20);
        array.enQueue(30);
        array.enQueue(40);

        array.show();//10 20 30 40 

        System.out.println(array.size());//4
        System.out.println(array.isEmpty());//false
        System.out.println(array.peek());//40
        array.show();//10 20 30 40 

        System.out.println(array.deQueue());//10
        array.show();//20 30 40 

        array.enQueue(50);
        array.show();//20 30 40 50 

        System.out.println(array.deQueue());//20
        array.show();//30 40 50

        System.out.println(array.deQueue());//30
        array.show();//40 50

        System.out.println(array.deQueue());//40
        array.show();//50 

        System.out.println(array.deQueue());//50
        array.show();

        System.out.println(array.size());//Queue is empty 0
        System.out.println(array.isEmpty());//true

    }
}
