package MeanAndAverage;


import java.util.HashMap;
import java.util.Map;

/*
* given an array (A) and an integer (S)
* how many ways one can choose contiguous array so that
* The average/mean of that subarray is S
*
* eq: A=[2,1,3] , S=2
*
* [2],  [1,3] , [2,1,3]
* 3 ways in which mean comes to be 2
*
* A=[7, 9, 8, 9] , S=8
*  {7, 9}, {8}, and {7, 9, 8}
* 3 ways
*
* * A=[2, 2, 2] , S=2
 *
 * 6 ways
 * {2}   {2}  {2}
 * {2,2} , {2,2,2} , {2,2}
*
* */
public class WaysToFindTheAverage {

    public static void main(String[] args) {
        int arr[]={2, 2, 2};
        int s=2;
        solution(arr,s);
    }

     /*
      mean = sum / totalElement
      sum = mean * totalElement
      this is the sum we need to maintain the mean/average as total_element increase
     */


    public static int solution(int[] A, int M) {

        Map<Integer,Integer> map= new HashMap<>();
        int currentSum=0;
        int count=0;

        map.put(0,1);
        for(int i=0;i<A.length;i++){
            currentSum=currentSum+A[i];
            int s = currentSum - (M* (i+1)); //we check is the sum ok with the number of element to get the mean, if yes then it gives 0
            count = count + map.getOrDefault(s,0);
            map.put(s,map.getOrDefault(s,0)+1);
        }

        System.out.printf("No of ways :"+count);
        return count;
    }

    /*
     for [2,1,3] everytime the result of  ( currentSum - mean * total_no_of_element) gives 0
     we increment  value of the map with key 0 map.put(0,1);

    * mean + mean give the mean then
    * even if we remove the mean we still get the mean
    * [2,1,3]
    * 2 gave the mean
    * 2,1,3 gave the mean
    * meaning 1,3 will also give the mean
    *
    * */

}


