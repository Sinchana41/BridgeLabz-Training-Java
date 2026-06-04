package innerclasses;

public class A {
    int num = 10;

    public void display(){
        System.out.println("From class A");
    }

    public class B{

        public void displayInformation(){
            System.out.println("from class B");
        }
    }

    public static void main(String[] args) {
        
        A obj = new A();
        obj.display();

        //creating object for inner class B
        A.B object = obj.new B();
        object.displayInformation();
    }


}
