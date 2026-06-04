package interfaces.functionalinterfaces;

@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface B{
     int add(int a, int b);
}

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A(){
          
            @Override
            public void show(){
                System.out.println("from Ananymous class");
            }
        };
        obj1.show();

        A obj2 = () -> System.out.println("from lamda expression");
        obj2.show();

        B obj3 = (i,j) -> i+j;
        System.out.println(obj3.add(4, 8));
    }
}
