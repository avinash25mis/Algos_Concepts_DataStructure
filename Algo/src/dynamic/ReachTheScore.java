package dynamic;

import java.util.Arrays;

/**
 * Also knows as coin change problem
 *
 *
 * Consider a game where a player can score 3 or 5 or 10 points in a move.
 * Given a total score n, find number of ways to reach the given score.
 *
 *
 * Input: n = 20
 * Output: 4
 * There are following 4 ways to reach 20
 * (10, 10)
 * (5, 5, 10)
 * (5, 5, 5, 5)
 * (3, 3, 3, 3, 3, 5)
 *
 *
 * Input: n = 13
 * Output: 2
 * There are following 2 ways to reach 13
 * (3, 5, 5)
 * (3, 10)
 */
public class ReachTheScore {

    public static void main(String[] args) {
      int sum=20;
      int S[]={3,5,10};
      int ways= numberOfWays(sum);
      long ways2= numberOfWays2(S,S.length,sum);
        System.out.println(ways);
        System.out.println(ways2);
    }

    private static int numberOfWays(int n) {

        int table[] = new int[n + 1];
        int i;
        // Initialize all table values as 0
        Arrays.fill(table, 0);

        // Base case (If given value is 0)
        table[0] = 1;


        for (i = 3; i <= n; i++) {
            table[i] += table[i - 3];
        }
        for (i = 5; i <= n; i++) {
            table[i] += table[i - 5];
        }
        for (i = 10; i <= n; i++) {
            table[i] += table[i - 10];
        }

        return table[n];

    }


    private static long numberOfWays2(int[] S, int S_length, int sum) {

        long table[] = new long[sum + 1];

        // Initialize all table values as 0
        Arrays.fill(table, 0);

        // Base case (If given value is 0)
        table[0] = 1;


        for (int i=0; i<S_length; i++)
            for (int j=S[i]; j<=sum; j++)
                table[j] += table[j-S[i]];

        return table[sum];

    }
}
