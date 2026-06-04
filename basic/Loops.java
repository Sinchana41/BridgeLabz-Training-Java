package basic;
class Loops{
    public static void main(String[] args){
        int n = 0;
        while(n < 5){
            System.out.println("Hi" +n);
            n++;
        }
        do
        {
            System.out.println("Hi" +n);
            n++;
        }while(n < 5);

        for(int m = 1;m <= 5 ;m++){
            System.out.println("Day" +m);
            for(int j = 1;j <= 9; j++){
                System.out.println(" "+(j + 8)+"-"+(j + 9));
            }
        }
    }
}