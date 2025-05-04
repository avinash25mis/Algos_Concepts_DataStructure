package a_Logics;

import java.util.Arrays;

public class MissingNumbersForSumGiven {

    public static void main(String[] args) {

        test();
        getAwayToASum(13, 3);
    }


    /*
     * Find the numbers from dice which will constitute the sum
     *
     * */
    public static void getAwayToASum(int requiredSum, int forgotenCount) {
        //to enable dice conditions and other conditions
        if (forgotenCount == 0 || requiredSum / forgotenCount > 6 || forgotenCount > requiredSum) {
            System.out.println("Not possible");
            return;
        }

        int[] forgotArray = new int[forgotenCount];
        for (int j = 0; j < forgotArray.length; j++) {
            forgotArray[j] = requiredSum / forgotenCount--;
            requiredSum = requiredSum - forgotArray[j];
        }

        System.out.println(Arrays.toString(forgotArray));

    }



/*
* just these two lines has the main logic
*
*     forgotArray[j]=requiredSum/forgotenCount--;
        requiredSum=requiredSum-forgotArray[j];
*
*
*
* */


    private static void test() {
       int count=6;
        System.out.println(count--); //6
        System.out.println(count--); //5


        int num=6;
        System.out.println(--num); //5
        System.out.println(--num); //4


        System.out.println("************************");

    }


}