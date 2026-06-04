package list;

import java.util.*;
public class Simple {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101, "Ram"));
        list.add(new Student(106, "Krishna"));
        list.add(new Student(103, "Abhimanyu"));
        list.add(new Student(104, "Karna"));
        list.add(new Student(102, "Yudhistira"));

        System.out.println(list);//[Student [id=101, name=Ram], Student [id=102, name=Krishna], Student [id=103, name=Abhimanyu], Student [id=104, name=Karna], Student [id=105, name=Yudhistira]]
        Collections.sort(list);
       // System.out.println(list);//[Student [id=101, name=Ram], Student [id=102, name=Yudhistira], Student [id=103, name=Abhimanyu], Student [id=104, name=Karna], Student [id=106, name=Krishna]]

        // Comparator<Student> c = new Comparator<Student>() {
            
        //     @Override
        //     public int compare(Student s1,Student s2){
        //         return s1.getId() > s2.getId() ? 1 :-1;
        //     }
        // };

        // Collections.sort(list,c);
        // System.out.println(list);

        // Comparator<Student> c = (s1,s2) -> s1.getId() > s2.getId() ? 1 :-1;
        // Collections.sort(list,c);
        // System.out.println(list);
            
        //Custom
        Collections.sort(list,(s1,s2) -> s1.getId() > s2.getId() ? 1 :-1);
        System.out.println(list);//[Student [id=101, name=Ram], Student [id=102, name=Yudhistira], Student [id=103, name=Abhimanyu], Student [id=104, name=Karna], Student [id=106, name=Krishna]]
    }

}

//Default Sorting using Comparable interface
class Student implements Comparable<Student>{

    private int id ;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    } 
   
    @Override
    public int compareTo(Student that) {
         return this.getId() > that.getId() ? 1 : -1;
    }
}

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
  
}
