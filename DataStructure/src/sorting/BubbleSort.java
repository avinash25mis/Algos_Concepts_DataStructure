package sorting;

import java.util.Arrays;

/**
 * @author avinash.a.mishra
 */
public class BubbleSort {


    public static void sort(int arr[]){


        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1] = temp;

                }
                /*after every inner iteration we put the maxel element at end
                so next time we iterrate till one less   arr.length-i * */
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int [] arr={7,4,5,7,1,2,3};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
