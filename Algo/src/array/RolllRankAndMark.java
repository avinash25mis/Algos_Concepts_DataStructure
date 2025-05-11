package array;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * assume index is the roll number, value are the marks
 * print roll  and marks and rank together
 */


/*
* hint: if you sort at beginning  then roll number will be gone
* to show the rank you could just print the sequenece
*
* */
public class RolllRankAndMark {

    public static void main(String[] args) {
        int arr[]={12, 15, 7, 87, 89,15, 67, 89};
        //printRankAndRoll(arr);
        printRankAndRoll_2(arr);
    }
    /*
    *

Roll Number: 4, Marks: 89
Roll Number: 7, Marks: 89
Roll Number: 3, Marks: 87
Roll Number: 6, Marks: 67
Roll Number: 1, Marks: 15
Roll Number: 5, Marks: 15
Roll Number: 0, Marks: 12
Roll Number: 2, Marks: 7*/


    private static void printRankAndRoll(int[] actualArray) {
        Map<Integer, Integer> rollToMarks = new HashMap<>();

        for (int i = 0; i < actualArray.length; i++) {
            rollToMarks.put(i, actualArray[i]);
        }

        rollToMarks.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) // Sort by marks in descending order
                .forEachOrdered(entry -> {
                    System.out.println("Roll Number: " + entry.getKey() + ", Marks: " + entry.getValue());
                });
    }

    private static  void printRankAndRoll_2(int[] actualArray) {
        Map<Integer, Integer> rollToMarks = new HashMap<>();

        for (int i = 0; i < actualArray.length; i++) {
            rollToMarks.put(i, actualArray[i]);
        }

        LinkedHashMap<Integer, Integer> collect = rollToMarks.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, //merge function, though not needed here as key will not be dublicated as it is array index
                        LinkedHashMap::new
                ));
        //merge function, In case of a merge, keep only one value in above

        System.out.println(collect);


    }


    // code to sort a map by values
    // Map<Integer, Integer> sortedMap = rollToMarks.entrySet()
    //         .stream()
    //         .sorted(Map.Entry.comparingByValue())
    //         .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,






}
