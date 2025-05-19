package slidingWindow.subArray;

/**
 * @author avinash.a.mishra
 *
 * find the maximum continuous sub array sum from the array
 * this question in most cases means there are negative numbers too
 * if the array contains all positive element then max sum any way equal to total sum
 * (which has no difficulty unless it is the question of finding max sum with given length)
 *
 * Also such question do not want index only the max sum
 *
 */
public class MaxSumContiguous {

    public static void main(String[] args) {
        int[] a = {60, -3, -4, 10,20 ,5, -1, -5, -3};
        maxSubArraySum(a);
    }

/*
 Kaden's Algorithm
* Kadane's Algorithm only works for arrays with at least one positive number.
 If all numbers in the array are negative, the algorithm will return 0
 as the maximum subarray sum
* */

    static int maxSubArraySum(int a[]) {
        int size = a.length;
        int max = 0;
        int currentSum = 0;

        for (int i = 0; i < size; i++) {
            currentSum = currentSum + a[i];

            if (max < currentSum) {
                max = currentSum;

            }
            if (currentSum < 0) {   //once we get negative current sum we again start from 0 from next
                currentSum = 0;
            }
        }

        System.out.println("Maximum contiguous sum is " +currentSum);
        return max;



    }
}
