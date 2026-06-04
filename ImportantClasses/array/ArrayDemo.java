package ImportantClasses.array;
class ArrayDemo{

    public static void main(String[] args){

        int[] ar1 = new int[6];

        for(int i = 0;i < ar1.length ;i++){

            ar1[i] = (int)(Math.random()*10);
            System.out.print(ar1[i]+" ");
        }

        System.out.println();

         for(int num:ar1){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("---------------------");

        int[][] ar2 = new int[4][4];
        for(int i = 0;i < 4 ;i++){

             for(int j = 0;j < ar2.length ;j++){

             ar2[i][j] = (int)(Math.random()*10);
             System.out.print(ar2[i][j]+" ");
             }
             System.out.println();
        }
        for(int[] row : ar2){
            for(int value : row){
            System.out.print(value+" ");
            }
            System.out.println();
        }

        int[] ar3 = {1,2,3,4};
        for(int num : ar3){
            System.out.print(num+" ");
        }  
    }
}