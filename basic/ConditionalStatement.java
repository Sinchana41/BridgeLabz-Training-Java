package basic;
class ConditionalStatement{
    public static void main(String[] args){
        //if
        if(true)
        System.out.println("Sinchana");

        if(2>1)
        System.out.println("Condition True");

        //if else 
        int num = 10;
        if(num % 2 == 0)
        System.out.println(num+" is even");
        else
        System.out.println(num+" is odd");

        //if else block
        int a = 1;
        int b = 4;
        int c = 2;

        if(a > b && a > c )
        System.out.println(a+" is greater");
        else if(b > a && b > c )
        System.out.println(b+" is greater");
        else
        System.out.println(c+" is greater");

        int n = 1;

        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");

        }
        
    }
}