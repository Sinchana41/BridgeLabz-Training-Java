package keywords.finalkeyword;

public class Employee {

    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
   //if method is final - we can inherit but we can not override it
    public final void display(){
        System.out.println(name+" : "+id);
    }
}
