public class BubbleSort {

    public static void main(String[] args) {
        int[] ar = {2,5,8,3,9,6};
        int size = ar.length;
        System.out.println("Before Sort");
        for(int i = 0;i < size;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        for(int i = 0;i < size;i++){
           
         for(int j = 0;j < size - i - 1;j++){
           if(ar[j] > ar[j + 1]){
            int temp =ar[j];
            ar[j] = ar[j + 1];
            ar[j + 1] = temp;
           }
         }
        
        }
        System.out.println("After Sort");
        for(int i = 0;i < size;i++){
            System.out.print(ar[i]+" ");
        }

    }

}

//Time Complexity - O(n^2) ->n square - Quadratic time