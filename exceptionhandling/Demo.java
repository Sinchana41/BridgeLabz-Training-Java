package exceptionhandling;

public class Demo {
    public static void main(String[] args) {
         int i = 0;
         int j = 0;

         int[] ar = {1,2,3,4,5};

         try{
             j = 18/i;
             System.out.println(ar[5]);
             System.out.println("---------"); 
         }
         catch(ArithmeticException e){
             System.out.println("can not divide by zero");
         }
         catch(ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("Stay with in the limit ");
         }
         catch(Exception e){
            e.printStackTrace();
         }
         finally{
            System.out.println(j);
         }
   }
}
