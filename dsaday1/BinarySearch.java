public class BinarySearch {

    //BinarySearch in sorted array
    public static int binarySearch(int[] ar, int element ){
        int start = 0;
        int end = ar.length - 1;

        while (start <= end) {

            int mid = (start + end)/2;

            if( element == ar[mid])
                return mid;
            else if(element < ar[mid])
                end = mid - 1;
            else
                start = mid + 1;
  
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ar = {1,3,4,48,9,34,56,78};
        int index = BinarySearch.binarySearch(ar, 48);
        if(index == -1)
            System.out.println("not present");
        else
            System.out.println("48 is present at index: "+index);
    }

}

//Time Complexity
//Best - O(1) - constant time
//Worst - O(log(n)) - logarithmic time
