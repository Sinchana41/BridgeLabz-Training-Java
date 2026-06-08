class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList{
    Node head;

    public void addAtEnd(int data){

        if(head == null)
            head = new Node(data);
        else{
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
         }
        temp.next = new Node(data);
        }
    }

    public int deleteAtStart(){

        if(head == null){
            System.out.println("list is empty");
            return 0;
        }  
        else{
           int data = head.data;
           head = head.next;
           return data;
        }
    }

    public int size(){

        int count = 0;
        if(head == null)
        {
            System.out.println("list is empty");
            return 0;
        }
        else{
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
         }
        return count;
        }
    }

    public void show(){

        if(head == null)
            System.out.println("List is empty");
        
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
    
            temp = temp.next;
        }
        System.out.println();
    }

}

class QueueList{

    LinkedList list = new LinkedList();

     public void enQueue(int data){
       list.addAtEnd(data);
    }

    public int deQueue(){
       return list.deleteAtStart();
    }

    public int peek(){
        return list.head.data;   
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

     public void show(){
        list.show();
    }
}

public class QueueSample {

     public static void main(String[] args) {
        QueueList qList = new QueueList();

        qList.enQueue(10);
        qList.enQueue(20);
        qList.enQueue(30);
        qList.enQueue(40);

       qList.show();//10 20 30 40 

        System.out.println(qList.size());//4
        System.out.println(qList.isEmpty());//false
        System.out.println(qList.peek());//40
        qList.show();//10 20 30 40 

        System.out.println(qList.deQueue());//10
        qList.show();//20 30 40 

        qList.enQueue(50);
        qList.show();//20 30 40 50 

        System.out.println(qList.deQueue());//20
        qList.show();//30 40 50

        System.out.println(qList.deQueue());//30
        qList.show();//40 50

        System.out.println(qList.deQueue());//40
        qList.show();//50 

        System.out.println(qList.deQueue());//50
        qList.show();

        System.out.println(qList.size());//list is empty 0
        System.out.println(qList.isEmpty());//true


     }
}
