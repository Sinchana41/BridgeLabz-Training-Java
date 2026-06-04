package methodreference;

import java.util.*;

public class Demo {

   public static void main(String[] args) {
    
    List<String> names = Arrays.asList("Ram","Shyam","Sundhar","Sharath");
    //method reference
     names = names.stream()
                .map(String::toUpperCase)
                .toList();
     names.forEach(n -> System.out.println(n));

    List<Student> students = new ArrayList<>();

    // for (String name : names) {
    //     students.add(new Student(name));
    // }


    // System.out.println(students);

   //  students = names.stream()
   //                  .map(name -> new Student(name))
   //                  .toList();

   //  students.forEach(n -> System.out.println(n));
     
     students = names.stream()
                    .map(Student::new)
                    .toList();

     students.forEach(System.out::println);
     
   }
}
