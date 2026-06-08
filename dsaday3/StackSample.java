class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList{
    Node head;

    public void addAtStart(int data){

        if(head == null)
            head = new Node(data);
        else{
            Node n = new Node(data);
            n.next = head;
            head = n;
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

class StackUsingList{

 LinkedList list = new LinkedList();
     public void push(int data){
       list.addAtStart(data);
    }


     public int pop(){
        return list.deleteAtStart();
    }

    public int peek(){
        return list.head.data;   
    }

    public int size(){ 
        return list.size();
    }

    public void show(){
        list.show();
    }

    public boolean isEmpty(){
        return list.head == null;
    }

}

public class StackSample {

    public static void main(String[] args) {

        StackUsingList slist = new StackUsingList();
        slist.push(10);
        slist.push(20);
        slist.push(30);
        slist.push(40);
        slist.show();//40 30 20 10 

        System.out.println( slist.isEmpty());//false

        System.out.println(slist.size());//4

        System.out.println(slist.pop());//40
        slist.show();//30 20 10 

        System.out.println(slist.peek());//30
        slist.show();//30 20 10 

        System.out.println(slist.peek());//30
        slist.show();//30 20 10 

        System.out.println(slist.pop());//30
        slist.show();//20 10 

        System.out.println(slist.pop());//20
        slist.show();//10

        System.out.println(slist.pop());//10
        slist.show();//List is empty

        System.out.println(slist.pop());//List is empty 0
      
        System.out.println(slist.size());//list is empty 0
      
        System.out.println( slist.isEmpty());//true
        
    }

}
