package polymorphism.ctp;

public class Calculator {

    public void add(int num1,int num2){
       System.out.println(num1+num2);
    }

    public void add(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }

    public void add(int num1,int num2,int num3,int num4){
         System.out.println(num1+num2+num3+num3);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5, 9);//14
        calculator.add(5, 9,5,8);//24
        calculator.add(5, 9,8);//22
    }
}
