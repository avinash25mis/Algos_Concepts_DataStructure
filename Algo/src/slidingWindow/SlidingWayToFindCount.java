package slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class SlidingWayToFindCount {


    /*
    * this logic can be used in following set of pattern
    * find longest consecutive repetitive elements
    * find Longest consecutive  increasing/decreasoing sequence (where difference could be 1 or more)
    *
    *
    * */
    public static void main(String[] args) {
     // int arr[]= {2,2,4,4,5,5,6,6,6};
      int arr[]= {2,1,2,3,4,5,6,6,6};

      switch(1){
          case 1:
              findConsecSameNumCount(arr);
          break;

          case 2:
              findLongestConsecutive(arr);
           break;

          case 3:
              findLongestConsecutiveAnother(arr);
            break;

            case 4:
                findLongestConsecutiveforList(arr);
            break;

      }

    }


 /*
 * imp point to note here is we start with i=1 and not i=0
 * and we move forward and compare with previous number
 *
 * Honestly its a better approach
 *
 * */
    public static void findConsecSameNumCount(int arr[]) {
        int count = 1;
        int maxCount = -1;
        int maxCountElement=-1;
        int theNum = arr[0]; //main logic is to choose a number count it occurence and move right
        for (int i = 1; i < arr.length; i++) {
            if (theNum == arr[i]) {
                count++;
            } else {
                count = 1;
                theNum = arr[i];
            }
            if (count > maxCount) {
                maxCount = count;
                maxCountElement=arr[i];
            }

        }

        System.out.println("Max consective count is :"+maxCount);
        System.out.println("The number is :"+maxCountElement);
    }

    private static void findLongestConsecutive(int[] arr) {
        int count=1;  //count and longest has to be 1 by default
        int longest=-1;


        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                count++;
            }else{
                count=1;
            }
            longest= Math.max(longest,count);
        }

        System.out.println("longest length :"+longest);
    }


    private static void findLongestConsecutiveAnother(int[] arr) {
        int count=1;  //count and longest has to be 1 by default
        int longest=-1;

        int theNum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==theNum+1){
                count++;
            }else{
                count=1;
            }
            theNum=arr[i];
            longest= Math.max(longest,count);
        }

        System.out.println("longest length :"+longest);
    }



    private static void findLongestConsecutiveforList(int[] arr) {
        List<Integer> list= new ArrayList<>();

        int longest=1; //count and longest has to be 1 by default
        int count=1;

        //generally this portion is to remove duplicate
        // but here just doing to convert array to arrayList
        for (int i = 0; i < arr.length; i++)
        {
            list.add(arr[i]);

        }


        // i will be from 0 as list  start from 0
        for (int i = 0; i < list.size(); i++)
        {
            // Check if the current element is just one digit greater/smaller than previous element
            if ( i!=0 && (list.get(i) == list.get(i - 1) + 1) ) {
                count++;
            }
            else {
                count = 1;
                //resetting the counter
            }
            // recording the counter at each traversal
            longest = Math.max(longest, count);

        }
        System.out.println("count via list :"+longest);

    }




    /*
   for removing duplicates while generating the list

      for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] != arr[i - 1]){
                list.add(arr[i]);
                }

        }


    * */


}
