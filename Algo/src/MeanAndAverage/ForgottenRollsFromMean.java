package MeanAndAverage;

import java.util.Arrays;

/**
 * @author avinash.a.mishra
 *
 * rolling a dice n number of time, calculated the mean m but
 * forgot certain elements k from the rolls
 */


/*
  /*   mean = sum / totalElement
      sum = mean * totalElement
* this is a little tricky as forgotten number is more than 1
*

 */
public class ForgottenRollsFromMean {
  public static void main(String arg[]){
       int[] remembered={3,2,4,3};
       int forgot=2;
       int actualMean=4;  //12+/6
/*         function should return [6,5]*/
      solution(remembered,forgot,actualMean);

  }
    public static int[] solution(int[] A, int forgotenCount, int mean) {
        int currentSum=0;
        int forgotArray[]=new int[forgotenCount];
        int notPossible[]=new int[1];
        int totalElement=forgotenCount+A.length;
        for(int i=0;i<A.length;i++){
            currentSum=currentSum+A[i];
        }

        if(forgotenCount<1|| mean<1|| mean>6){
            return notPossible;
        }
        System.out.println("forgotenCount :"+forgotenCount);
     /*   mean = sum / totalElement
        sum = mean * totalElement   */
        int requiredSum=(mean*totalElement)-currentSum;
        System.out.println("requiredSum "+requiredSum);
        //required sum of forgotten dices
        if(forgotenCount>requiredSum || requiredSum/forgotenCount>6){
            return notPossible;
        }

        // tring to find all the forgotten number one by one
        // say we forgot 3 number and the required sum is 9 then first number
        // will be 9/3=3 since we got 3 then required sum now 9-3=6
        // now we have 2 number left and the required sum is 6
        // so the second number will be 6/2=3
        // now we have 1 number left and the required sum is 3
        // so the third number will be 3/1=3
        for(int j=0;j<forgotArray.length;j++){
            forgotArray[j]=requiredSum/forgotenCount;
            forgotenCount--;
            requiredSum=requiredSum-forgotArray[j];

        }

        System.out.println(Arrays.toString(forgotArray));
        return forgotArray;
    }






}
