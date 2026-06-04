package innerclasses.Ananymousinnerclass;

public class B {
    
    public static void main(String[] args) {
        A a = new A();
        a.display();//From class A
        A obj = new A(){

            @Override
            public void display(){
                System.out.println("From Ananymous inner class");
            }
        };
        obj.display();//From Ananymous inner class
    }

}
