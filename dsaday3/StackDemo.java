class StackusingArray{

    int[] stack =  new int[10];
    int top = -1;

    public void push(int data){
        if(top == stack.length-1){
            System.err.println("Stack is full");
            return;
        }
        stack[++top] = data;
    }


     public int pop(){
        if(top == -1){
            System.err.println("Stack is empty");
            return -1;
        }
        int data = stack[top--];
        return data;
    }

    public int peek(){
        if(top == -1){
            System.err.println("Stack is empty");
            return -1;
        }
        return stack[top];   
    }

    public int size(){ 
        return top + 1;
    }
    
    public boolean isEmpty(){
      return top == -1;
    }

    public void show(){
        if(top == -1){
            System.err.println("Stack is empty");
        }
        for(int i = top ;i > -1; i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }

}


public class StackDemo {

    public static void main(String[] args) {
        StackusingArray  array = new StackusingArray();
        array.push(10);
        array.push(20);
        array.push(30);
        array.push(40);
        array.show();//40 30 20 10 

        System.out.println(array.isEmpty());//false

        System.out.println(array.size());//4

        System.out.println(array.pop());//40
        array.show();//30 20 10 

        System.out.println(array.peek());//30
        array.show();//30 20 10 

        System.out.println(array.peek());//30
        array.show();//30 20 10 

        System.out.println(array.pop());//30
        array.show();//20 10 

        System.out.println(array.pop());//20
        array.show();//10

        System.out.println(array.pop());//10
        array.show();//Stack is empty

        System.out.println(array.pop());//Stack is empty -1
      
        System.out.println(array.size());//0

        System.out.println(array.isEmpty());//true

    }
}
