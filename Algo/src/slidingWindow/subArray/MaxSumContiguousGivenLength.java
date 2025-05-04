package slidingWindow.subArray;

public class MaxSumContiguousGivenLength {
/*
see intro for detail
in short we finding n consecutive element for maximum sum
* */

    public static void main(String[] args) {
        int arr[] = {2, 9, 10, 10, 0, 99};
        int k = 3;
        logic1(arr, k);

    }

    private static void logic1(int[] arr, int k) {
        int sum = 0;
        int maxSum = 0;

        int i = 0, j = 0;
        //first find the sum of first k
        while ((j - i + 1) <= k) {
            sum = sum + arr[j];
            j++;
        }
        maxSum=sum;

        //substract the last and add the incremented
        while (j < arr.length){
            sum = sum - arr[i];
            sum = sum + arr[j];
            i++;
            j++;
            maxSum = Math.max(sum, maxSum);

        }

        System.out.println(maxSum);


    }

}
