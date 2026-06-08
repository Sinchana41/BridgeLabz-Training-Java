public class QuickSort {

    public static void quickSort(int[] ar, int low ,int high){
        if(low < high){

            int pivot = part(ar,low,high);

            quickSort(ar, low, pivot - 1 );
            quickSort(ar, pivot + 1, high);
        }
    }

    public static int part(int[] ar,int low,int high){
      
        int pivot = ar[high];
        int i = low -1;

        for(int j = low;j < high;j++){
            if(ar[j] < pivot){
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }

        int temp = ar[i + 1];
            ar[i + 1] = ar[high];
            ar[high] = temp;

        return i + 1 ;
    }


    public static void main(String[] args) {
        int[] ar = {6,5,4,3,2,1};
        for(int num : ar){
            System.out.print(num+" ");
        }
        System.out.println();

        quickSort(ar,0,ar.length-1);


        for(int num : ar){
            System.out.print(num+" ");
        }       
    
    }
}

//Time Complexity 
//avarage case - O(nlog(n)) - linearithmic time
//worst case - O(n^2) - Qudratic time

