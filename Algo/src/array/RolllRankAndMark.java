package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author avinash.a.mishra
 * say index is the roll number, value are the marks
 * print roll rank and marks together
 */
public class RolllRankAndMark {

    public static void main(String[] args) {
        int arr[]={12, 15, 7, 87, 89,15, 67, 89, 99};
        printRankAndRoll(arr);
    }

    private static void printRankAndRoll(int[] actualArray) {
        Map<Integer,Integer> rollToMarks= new HashMap<>();

        for(int i=0;i<actualArray.length;i++){
            rollToMarks.put(i,actualArray[i]);
        }

        }


}
