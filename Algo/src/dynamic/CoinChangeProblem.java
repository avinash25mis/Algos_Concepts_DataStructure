package dynamic;

import java.util.Arrays;

/**
 *Number of ways to get a sum n
 * by 1,2,3 rupee coin
 *
 * if you have infinite supply of coin
 *
 * say n=5
 * (1,1,1,1,1)
 * (1,1,1,2)
 * (1,1,3)
 * (1,2,2)
 * (2,3)
 *
 * anather question could be find the minimum num of coin required ie 2 in above case
 *
 * if can be solved by recursion but time complexity is higer
 *
 * but if we do it by dynamic programming we can store the result and use it further
 *
 *
 * N = 4 and S = {1,2,3},
 * there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}.
 * So output should be 4.
 * For N = 10 and S = {2, 5, 3, 6},
 * there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}
 */
public class CoinChangeProblem {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int m = arr.length;  // types of coin avaiable
        int n = 4;    //sum we want
        System.out.println(countWays(arr, m, n));
    }

    private static Long countWays(int[] S, int m, int n) {
        //Time complexity of this function: O(mn)
        //Space Complexity of this function: O(n)


        long[] table = new long[n+1];


        Arrays.fill(table, 0);   //O(n)

        table[0] = 1;
        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i=0; i<m; i++) {
            for (int j = S[i]; j <= n; j++) {
                table[j] += table[j - S[i]];
            }
        }

        return table[n];

    }
}
