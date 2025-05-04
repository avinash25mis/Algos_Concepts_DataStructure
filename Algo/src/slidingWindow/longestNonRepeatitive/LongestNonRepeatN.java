package slidingWindow.longestNonRepeatitive;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author avinash.a.mishra
 *
 * the concept here is i & j will start from same position &
 * keep incrementing  j and find length (j-i+1),
 * as soon as repeat is found we move i to the one next position to the last occurance (j-1+1)
 * again loop runs j is increment
 *
 * and keep incrementing j all over again till a repeat is found
 */
public class LongestNonRepeatN {

    public static void main(String[] args) {
        String str="aakvijaasha";
        // String str="vishal";
        getLongestNonRepeatingByArray(str);
        getLongestNonRepeatingByMap(str);
    }

    private static int getLongestNonRepeatingByMap(String str) {

        HashMap<Character, Integer> seen = new HashMap<>();
        int maximum_length = 0;


        int maxStart=-1;
        int maxEnd=-1;

        //  inital point of window to index 0 ie i/i =0
        int i = 0;

        //counter inside the for will be end/j
        for(int j = 0; j < str.length(); j++)
        {
            // Checking if we have already seen the element or not
            if(seen.containsKey(str.charAt(j)))
            {
                // If we have seen the number, move the i pointer
                // to position after the last occurrence
                i = Math.max(i, seen.get(str.charAt(j)) + 1);//
            }

            // Updating the last seen index of the character
            seen.put(str.charAt(j), j);

            if(j - i + 1 > maximum_length){
                maximum_length =j - i + 1;
                maxStart=i;
                maxEnd=j;
            }
          //  maximum_length = Math.max(maximum_length, j - i + 1);
        }

        System.out.println("max length:"+maximum_length);
        System.out.println("indexes :"+maxStart+"-"+maxEnd);
        return maximum_length;
    }


    private static int getLongestNonRepeatingByArray(String str) {

        int longest = 0; // result
        int beginning=-1;
        int ending=-1;
        int [] arr = new int[256];
        Arrays.fill(arr, -1);

        // Initialize start of current window
        int i = 0;
        // Move end of current window
        for (int j = 0; j < str.length(); j++) {
            // Find the last occured index of str[j]
            // if found Update i with next index of current window
             // else  if not found the -1+1=0  which will never be max
            i = Math.max(i, arr[str.charAt(j)] + 1);

            // Update last index of str.charAt(j).
            arr[str.charAt(j)] = j;

            // Update result if we get a larger window
            if(longest<j-i+1){
                beginning=i;
                ending=j;
                longest=j-i+1;
            }
            //longest = Math.max(longest, j - i + 1);

        }
        System.out.println("by array Longest length: "+longest);
        System.out.println("indexes: "+beginning+"-"+ending);
        return longest;
    }
}
