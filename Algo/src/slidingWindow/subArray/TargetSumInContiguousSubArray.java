package slidingWindow.subArray;

/**
 * @author avinash.a.mishra
 *
 * find the given sum in any sub-array of the array
 */
public class TargetSumInContiguousSubArray {

    public static void main(String[] args) {
        int arr[] = { 16, 2, 4, 8, 9, 5, 10, 23 };
        int sum = 17;
        findSumInSubArray(arr,sum);
    }

    /*
       we keep i (start) at the fist position
    * we keep moving j and add all element from the i till j
    * if we cross the target sum then we move i towards right and find sum till j again
    *
    * */

    private static int findSumInSubArray(int[] arr, int reqSum) {

        int curr_sum = arr[0];
        int i = 0;

        // Pick a starting point
        for (int j = 1; j <= arr.length; j++) {

            // If curr_sum becomes equal to reqSum in last iteration, and we have increment j
            if (curr_sum == reqSum) {
                int end = j - 1;
                System.out.println("Sum found between indexes " + i + " and " + end);
                break;
            }
            if(j<arr.length) {
                curr_sum = curr_sum + arr[j];
            }

            // If curr_sum exceeds the reqSum,
            // then move the starting elements
            while (curr_sum > reqSum && i <= j - 1) {
                curr_sum = curr_sum - arr[i];
                i++;
            }

        }

        return 0;
    }

}
