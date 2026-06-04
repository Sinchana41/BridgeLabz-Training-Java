package basic;
class TypeConversion{
    public static void main(String[] arg){
        //Implicit converion
        int a = 10 ;
        double b = a;
        System.out.println(a);//10
        System.out.println(b);//10.0


        //Explicit TypeConversion
        double c = 123.456;
        int d = (int)c;
        System.out.println(c);//123.456
        System.out.println(d);//123


        //Converting int to byte
        //if value < 256 same value
        //if value > 256  ,value % 256 

        int e = 70;
        int f = 257;
        byte g = (byte)e;
        byte h = (byte)f;
        System.out.println(g);//70
        System.out.println(h);//1, 257 % 256 = 1


        //Type Promtion - Storing byte values in int
        byte i = 90;
        byte j = 30;
        int k = i * j;
        System.out.println(k);//2700

    }
}