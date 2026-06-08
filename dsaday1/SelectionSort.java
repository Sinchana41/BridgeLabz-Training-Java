public class SelectionSort {
    
    public static void main(String[] args) {
        int[] ar = {2,5,8,3,9,6};
        int size = ar.length;
        System.out.println("Before Sort");
        for(int i = 0;i < size;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        for(int i = 0;i < size - 1;i++){
         int minIndex = i;
         for(int j = i+1;j < size;j++){
                if(ar[minIndex] > ar[j] )
                    minIndex = j;
         }
         int temp = ar[i];
         ar[i] = ar[minIndex];
         ar[minIndex] = temp;

        //  for(int num : ar){
        //     System.out.print(num+" ");
        //  }
        // System.out.println();
        }

        System.out.println("After Sort");
        for(int i = 0;i < size;i++){
            System.out.print(ar[i]+" ");
        }

    }

}

//Time Complexity - O(n^2) ->n square - Quadratic time


