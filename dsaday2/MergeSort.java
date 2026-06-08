public class MergeSort {

    public static void mergeSort(int[] ar,int left,int right){

        if(left < right){
            int mid = (left + right)/2;
            mergeSort(ar, left, mid);
            mergeSort(ar, mid + 1, right);

            merge(ar,left,mid,right);
        }
    }

    public static void merge(int[] ar,int left,int mid,int right){
     
     int leftAraySize = mid - left + 1; 
     int n1 = leftAraySize;
     int rightAraySize = right - mid;
     int n2 = rightAraySize;

     int[] leftAray = new int[leftAraySize];
     int[] rightAray = new int[rightAraySize];

     for(int x = 0 ;x < n1;x++){
        leftAray[x] = ar[left + x];
     }
     for(int x = 0 ;x < n2;x++){
        rightAray[x] = ar[mid + 1 + x];
     }

     int i = 0;
     int j = 0;
     int k = left;

     while(i < n1 && j < n2){

        if(leftAray[i] <= rightAray[j]){
            ar[k++] = leftAray[i++];
        }
        else{
            ar[k++] = rightAray[j++];
        }
    }
    while(i < n1){
        ar[k++] = leftAray[i++];
    }
     while(j < n2){
        ar[k++] = rightAray[j++];
    }
    }


    public static void main(String[] args) {
        int[] ar = {6,5,4,3,2,1};
        for(int num : ar){
            System.out.print(num+" ");
        }
        System.out.println();

        mergeSort(ar,0,ar.length-1);


        for(int num : ar){
            System.out.print(num+" ");
        }       
    
    }
}


