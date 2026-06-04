package LVTI;

class Student{

}

//Local Variable Type Inference
public class Demo {

    int num;
    //var num1; -->error -  we can not use out side local scope

    public static void main(String[] args) {
        
        int a = 10;
        var b = 20;//we can store all type of data

        System.out.println(b);//20

        var num1 = new int[10]; //we can use to create array
        num1[0] = 10;
        var student = new Student();//we can store object

        System.out.println(student+" "+a+" "+num1[0]);//LVTI.Student@28a418fc 10 10
    }

}
