package ContructorChaining;

public class B extends A {

    public B(){
        super(3);
        System.out.println("B constructor");
    }

    public B(int n){
        super(3);
        System.out.println("B parameterized constructor");
    }
    
}
