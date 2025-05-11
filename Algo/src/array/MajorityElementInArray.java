package array;


import java.util.*;

/*
*
* A majority element in an array A[] of size n
* is an element that appears n/2 or more than n/2 times
*
 * */
public class MajorityElementInArray {

    public static void main(String[] args) {
        int [] arr= {3, 3, 4, 2,  2, 2, 4, 4};
        majority(arr);
        //majorityByMap(arr);


    }


    /*
    *
    * Time Complexity: O(n).
      Auxiliary Space: O(n).
      Since a hashmap requires linear space.
      The trick here is while we are putting elements we are also validating
      * if majority is reached
    * */

    private static void majorityByMap(int[] arr) {

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) +1;
                if (count > arr.length /2) {
                    System.out.println("Majority found :- " + arr[i]);
                    return;// imp return
                } else
                    map.put(arr[i], count);

            }
            else
                map.put(arr[i],1);
        }
    }




 /*  Time Complexity: O(nlogn).
    Auxiliary Space: O(1).
    kind of sliding window
    */

    private static void majority(int[] arr) {
        Arrays.sort(arr);// wasting o(n) here

        int count = 1, maxElementCount = -1, maxElement=0;

        int  temp = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if (temp == arr[i])
            {
                count++;
            }
            else
            {
                count = 1;
                temp = arr[i];
            }

            if (maxElementCount < count)
            {
                maxElementCount = count;
                maxElement = arr[i];

                if (maxElementCount > (arr.length / 2))
                {
                    break;
                }
            }
        }
        System.out.println("The max element is :"+maxElement);
    }
}
