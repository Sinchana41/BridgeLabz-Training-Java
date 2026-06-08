public class InsertionSort {

     public static void main(String[] args) {
        int[] ar = {2,5,8,3,9,6};
        int size = ar.length;
        System.out.println("Before Sort");
        for(int i = 0;i < size;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        for(int i = 1;i < size;i++){
        
            int key = ar[i];
            int j = i-1;

            while (ar[j] > key && j >= 0) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = key;         

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

//Time Complexity 
//average case - O(n^2) ->n square - Quadratic time