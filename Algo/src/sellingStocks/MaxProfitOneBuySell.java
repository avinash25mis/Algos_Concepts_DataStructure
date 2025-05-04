package sellingStocks;

public class MaxProfitOneBuySell {

    public static void main(String[] args) {
        int arr[]={1,5,2,11,7,82,92};

        maxDiff2(arr, arr.length);
        getMaxPrice(arr, arr.length);

    }




    static int maxDiff2(int arr[], int arr_size)
    {
        if(arr_size<2){
            return -1;
        }

        //initializing max  diff as initial pointers
        int max_diff = arr[1] - arr[0];
        int i = 0;

        for (int j = 1; j < arr_size; j++)
        {
            //we record the maximum difference as we move and check if current max is greater
            if (arr[j] - arr[i] > max_diff) {
                max_diff = arr[j] - arr[i];
            }
            //we keep initializing i to smaller element as we move
            if (arr[j] < arr[i]) {
                i = j;
            }
            //even if we change the i  here, in the next iteration j will be j++
        }
        System.out.println("O(N)-"+max_diff);
        return max_diff;
    }


    static void getMaxPrice(int arr[],int length){
        int maxDiff=-1;
        for(int i=0;i<length-1;i++){
            for (int j=i+1;j<length;j++){
              maxDiff=Math.max(maxDiff,arr[j]-arr[i]);

            }
        }
        System.out.println("O(N*N)-"+maxDiff);

    }

}
