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

    public void addAtIndex(int data,int index){

        if(index > size()){
            System.out.println("index out of bound");
            return;
        }

        if(index == 0){
            addAtStart(data);
        }
        else{
        Node temp = head;
        
        for(int i = 0;i < index-1;i++){
            temp = temp.next;
        }
        Node n = new Node(data);
        n.next = temp.next;
        temp.next = n;
        }
    }

    public void addAtStart(int data){

        if(head == null)
            head = new Node(data);
        else{
            Node n = new Node(data);
            n.next = head;
            head = n;
        }
    }

    

    public int deleteAtEnd(){

        if(head == null){
           System.out.println("List is empty");
           return 0;
        }

        if(head.next == null){
            int data = head.data;
            head = null;
            return data;
        }

        else{
        Node temp = head;
        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;     
        }
        int data = temp.data;
        prev.next = null;
        return data;
        }
    }

    public int deleteAtIndex(int index){

        if(index > size()){
            System.out.println("index out of bound");
            return 0;
        }
        if(index == 0){
           return deleteAtStart();
            
        }
        else{
        Node temp = head;    
        for(int i = 0;i < index-1;i++){
            temp = temp.next;
        }
        int data = temp.next.data;
        temp.next = temp.next.next;
        return data;
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
          
            if(temp.next != null)
            System.out.print("->");

            temp = temp.next;
        }
        System.out.println();
    }

}

public class LinkedListDemo {

   public static void main(String[] args) {
      LinkedList list = new LinkedList();
     list.addAtEnd(10);
     list.addAtEnd(20);
     list.addAtEnd(30);
     list.addAtEnd(40);

     list.show();//10 ->20 ->30 ->40 

     list.addAtStart(5);
     list.addAtStart(4);
     list.addAtStart(3);

     list.show();//3 ->4 ->5 ->10 ->20 ->30 ->40 

    System.out.println( list.deleteAtEnd());//40
    list.show();//3 ->4 ->5 ->10 ->20 ->30 
    System.out.println( list.deleteAtEnd());//30
    list.show();//3 ->4 ->5 ->10 ->20 

    System.out.println( list.deleteAtStart());//3
    list.show();//4 ->5 ->10 ->20 

    System.err.println(list.size());//4

    list.addAtIndex(8, 2);
    list.show();//4 ->5 ->8 ->10 ->20 

    list.addAtIndex(3, 1);
    list.show();//4 ->3 ->5 ->8 ->10 ->20 

    list.addAtIndex(1, 0);
    list.show();//1 ->4 ->3 ->5 ->8 ->10 ->20 

    list.addAtIndex(11, 8);
    list.show();//index out of bound

    list.addAtIndex(11, 7);
    list.show();//1 ->4 ->3 ->5 ->8 ->10 ->20 ->11 

    System.out.println(list.deleteAtEnd());//11
    list.show();//1 ->4 ->3 ->5 ->8 ->10 ->20 

    System.out.println(list.deleteAtStart());//1
    list.show();//4 ->3 ->5 ->8 ->10 ->20 

    System.out.println(list.deleteAtIndex(1));//3
    list.show();//4 ->5 ->8 ->10 ->20

    System.out.println(list.deleteAtIndex(3));//10
    list.show();//4 ->5 ->8 ->20 
   }
}
