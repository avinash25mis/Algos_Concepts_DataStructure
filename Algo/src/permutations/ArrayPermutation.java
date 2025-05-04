package permutations;

import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        int arr[]= {1,2,3};
        printPermutations(arr,0,arr.length-1);
    }

    private static void printPermutations(int[] arr, int l, int r) {
        if(l==r){
            System.out.println(Arrays.toString(arr));
        }

        for(int i=l;i<=r;i++){
            swap(arr,l,i);
            printPermutations(arr,l+1,r);
            swap(arr,l,i);
        }

    }

    private static void swap(int[] arr, int l, int i) {
        int temp=arr[i];
        arr[i]=arr[l];
        arr[l]=temp;
    }
}
