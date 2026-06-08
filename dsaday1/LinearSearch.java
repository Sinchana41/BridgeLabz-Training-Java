public class LinearSearch {

    public static int linearSearch(int[] ar, int element ){

        for(int i = 0;i < ar.length;i++){
            if(ar[i] == element)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ar = {1,3,4,9,34,48};
        int index = LinearSearch.linearSearch(ar, 48);
        if(index == -1)
            System.out.println("not present");
        else
            System.out.println("48 is present at index: "+index);
    }
 
}
//Time Complexity
//Best - O(1) - constant time
//Worst - O(n) - linear time
