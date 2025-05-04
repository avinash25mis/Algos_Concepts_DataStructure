package sumRelated;

import java.util.Arrays;

public class SumOfTwoArray {


    /*
    * remember
    *
    *  3 % 10 == 3, use remender to store the sum
    *  3 / 10 == 0,  use actuall divide the get the carry digit
    *
    * */
    public static void main(String[] args) {
        int arr1[]={2,6,6};
        int arr2[]={3,5,5};
        switch (2) {
            case 1:
            getTheSum(arr1, arr2);
            break;

            case 2:
            getTheSumInRealCase(arr1, arr2);
            break;

            default:
            test();
        }


    }


    /*
    *carry gets resetted
    *
    * */
    private static void test() {
        int sum=7;
        int carry=sum/10;
        System.out.println(carry);
    }

//To Do
    private static void getTheSumInRealCase(int[] arr1, int[] arr2) {

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k=Math.max(i,j);


        int sumArray[]= new int[k+1];

        int carry=0;

        while(k>0){
            int sum = carry + arr1[i]+arr2[j];
            carry=sum/10;
            sum=sum % 10;
            sumArray[k]=sum;
            i--;
            j--;
            k--;

        }

        int remaining=0;
        if(i>j){
            remaining=i;
        }else {
            remaining=j;
        }


        while (remaining > 0)
        {
            // Add carry to first array elements.
           int sum = arr1[remaining] + carry;
            sumArray[k] = (sum % 10);
            carry = sum / 10;

            remaining--;
            k--;
        }

        sumArray[k]=carry;



        System.out.println(Arrays.toString(sumArray));

    }

    /*
    * note this solution is going to work only if both array has same length
    * */

    private static void getTheSum(int[] arr1, int[] arr2) {
        int carry=0;
        int max=Math.max(arr1.length,arr2.length);
        int arr3[]= new int[max];
        for(int i=0;i<arr1.length && i<arr2.length;i++){

            int sum=carry+arr1[i]+arr2[i];
            carry=sum/10;
            arr3[i]=sum % 10; //sum to be sorted is the left most bit

        }

        System.out.println(Arrays.toString(arr3));
    }
}
