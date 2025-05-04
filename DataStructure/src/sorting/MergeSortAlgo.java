package sorting;

import java.util.Arrays;

/**
 * @author avinash.a.mishra
 */
public class MergeSortAlgo {


    public static void mergeSort(int arr[],int n){
       if(n<2){
           return;
       }
        int mid=n/2;

        int [] left = new int[mid];
        int [] right= new int[n-mid];

        for(int i=0;i<mid ;i++){
            left[i]=arr[i];
        }

        for(int i=mid,k=0;i<n ;i++){
            right[k]=arr[i];
            k++;
        }

        mergeSort(left,mid);
        mergeSort(right,n-mid);
        merge(arr,left,right,mid, n-mid);
    }

    private static void merge(int[] arr, int[] left, int[] right, int leftLength, int rightLength) {
     int i=0,j=0,k=0;
     while (i< leftLength && j<rightLength){
         if(left[i] > right[j]){
             arr[k]=right[j];
             j++;
             k++;
         }else{
             arr[k]=left[i];
             i++;
             k++;
         }
     }

     while(i<leftLength){
         arr[k]=left[i];
         k++;
         i++;
     }

        while(j <rightLength){
            arr[k]=right[j];
            k++;
            j++;
        }

    }




    public static void main(String[] args) {
        int [] arr={7,4,5,7,1,2,3};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
