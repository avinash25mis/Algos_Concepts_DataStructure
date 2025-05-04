package MeanAndAverage;

/**
 * @author avinash.a.mishra
 *
 * rolling a dice n number of time, calculated the mean m but
 * forgot certain elements k from the rolls
 */
public class ForgottenRollsFromMean {
  public static void main(String arg[]){
       int[] remembered={3,2,4,3};
       int forgot=2;
       int actualMean=4;  //12+/6
/*         function should return [6,5]*/
      solution(remembered,forgot,actualMean);

  }
    public static int[] solution(int[] A, int forgotenCount, int M) {
        int currentSum=0;
        int forgotArray[]=new int[forgotenCount];
        int notPossible[]=new int[1];
        int totalElement=forgotenCount+A.length;
        for(int i=0;i<A.length;i++){
            currentSum=currentSum+A[i];
        }

        if(forgotenCount<1|| M<1|| M>6){
            return notPossible;
        }
    /*   mean = sum / totalElement
      sum = mean * totalElement   */
        int requiredSum=(M*totalElement)-currentSum;
        //required sum of forgotten dices
        if(forgotenCount>requiredSum || requiredSum/forgotenCount>6){
            return notPossible;
        }

        for(int j=0;j<forgotArray.length;j++){
            forgotArray[j]=requiredSum/forgotenCount--;
            requiredSum=requiredSum-forgotArray[j];
        }
        return forgotArray;
    }






}
