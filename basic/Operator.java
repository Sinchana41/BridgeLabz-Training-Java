package basic;
class Operator{
    public static void main(String[] arg){

        //Airthematic operators - +,-,*,/,%,++,--
        int num1 = 20;
        int num2 = 10;
        System.out.println(num1 + num2);//30
        System.out.println(num1 - num2);//10
        System.out.println(num1 * num2);//200
        System.out.println(num1 / num2);//2
        System.out.println(num1 % num2);//0
        System.out.println(num1++);//20
        System.out.println(++num1);//22
        System.out.println(num1--);//22
        System.out.println(--num1);//20

        //Relational Operators - <,>,==,!=,<=,>=
        //output is boolean value true or false
        System.out.println(num1 < num2);//false
        System.out.println(num1 > num2);//true
        System.out.println(num1 == num2);//false
        System.out.println(num1 != num2);//true
        System.out.println(num1 <= num2);//false
        System.out.println(num1 >= num2);//true
      
        //Logical Operators - &&-AND,||-OR,!-NOT
        int x = 30;
        int y = 20;
        boolean result1 = (num1 < num2) && (x < y);
        boolean result2 = (num1 < num2) || (x > y) ;
        System.out.println(result1);//false
        System.out.println(result2);//true
        System.out.println(!result2);//false
        
        //Ternary operators
        System.out.println(x < y ?x+" is Smaller":y+" is Smaller");
    }
}