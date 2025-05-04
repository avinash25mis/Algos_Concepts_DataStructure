package sorting;

import java.util.Arrays;

/**
 * @author avinash.a.mishra
 */
public class HeapSort {


    static void  heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1;
        int r = 2*i + 2;

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;


        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root  (if largest is i then it becomes the base case)
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void sort(int arr[])
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract an element from heap
        for (int i=n-1; i>0; i--)
        {
            // swap current root with end  & delete end  ()
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int [] arr={7,4,5,7,1,2,3};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
