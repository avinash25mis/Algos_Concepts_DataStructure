package array;

import java.util.*;

public class FindKthLargestElement {

    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 1, 23, 12, 9, 30, 2, 50 };
       // kthLargestElement(arr,3);
        findBySTLApproach(arr,3);
    }


    /*
    * Time Complexity of this solution is O(N Log N)
    * I am afraid about the duplicate element cases which can be removed with a step of hashset/another array
     *
    * */
    public static int kthLargestElement(Integer[] arr, int k)
    {
        /*
        the significance of using Interger[] arr over int [] is that the
        overloaded function of passing the reverseOrder parameter is applicable to only object types
        * */

        Arrays.sort(arr, Comparator.reverseOrder());
       // Arrays.sort(arr, Collections.reverseOrder());
       //both the Comparator.reverseOrder() and Collections.reverseOrder() works well

        // Return k'th element in
        return arr[k - 1];
    }


   /* map based STL approach
   *
   *   Array =7,0,16,0,17  , k=3
   *
   *  map
   *  0  | 2
   *  7  | 1
   * 16  | 1
   * 17  | 1
   *
   * second part
   * -----------------
   * now (freq of 0) + (freq of 7) = 2+1=3
   * so the third largest number is 7
   *
   * here we can ignore duplicates if we count each as 1 or use TreeSet instead
   * only condition here to start with TreeMap which is bydefault sorted
    * */


    static int findBySTLApproach(Integer arr[], int k)
    {

        Map<Integer, Integer> m= new TreeMap<>(Collections.reverseOrder());
        // Map<Integer, Integer> m= new TreeMap<>();
        //Set<Integer> m= new TreeSet<>(Collections.reverseOrder());//if counting each number as unique


        for (int i = 0; i < arr.length; i++) {
          /*  mapping every element with it's frequency
          * this is the shorter way then the conventional way of
          * if(map.get()!=null) then incrementing the  counter & put back
          * */

            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
            /* if present then increase the occurance count by + 1
             if not present then null+1 will give exception hence default 0-- 0+1*/
        }


        int freq = 0;

        for (Map.Entry<Integer,Integer> it : m.entrySet())
        {
            // adding the frequencies of each element
            freq = freq +  it.getValue();

            if (freq >= k) {
                return (int)it.getKey();  //return as soon as you get the count
            }
        }

        return -1; // returning -1 if k>size of the array

    }


}
