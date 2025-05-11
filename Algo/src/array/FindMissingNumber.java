package array;

import java.util.stream.Stream;

/**
 *
 * find the missing number in the sequence of number
 *
 * sum of n numbers is = n * (n + 1) / 2;
 */
public class FindMissingNumber {


    // Driver code
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 4, 5, 6 };
        int n = a.length + 1;
        int miss = getMissingNo(a, n);

        System.out.print(miss);
    }


    static int getMissingNo(int a[], int n)
    {
        Stream.of(1,2,3,4,5,6,7).skip(5).forEach(num-> System.out.println(num+""));
        System.out.println("tttt");
        int idealSum = n * (n + 1) / 2;
        int sum = 0;

        for(int i = 0; i < n - 1; i++)
            sum += a[i];

        return idealSum - sum;
    }
}
