import java.util.Arrays;

public class MinimumSwap {

    public static void main(String[] args) {
        int arr[]={1,1,0,0};
        System.out.println(Arrays.toString(arr));
       int count= countSwaps(arr);
        System.out.println(count);
    }

    private static int countSwaps(int[] arr) {
        int count=0;
        int oneCount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                oneCount++;
            }
        }
        if(oneCount<2){
            return 0;
        }


        int min=Integer.MAX_VALUE;
        int currentZeroCount=0;

        int firstIndex=0;
        int secondIndex=oneCount;



            while (firstIndex<secondIndex){
                if(arr[firstIndex]==0){
                    currentZeroCount++;

                }
                firstIndex++;
             }


            return currentZeroCount;

    }
}
