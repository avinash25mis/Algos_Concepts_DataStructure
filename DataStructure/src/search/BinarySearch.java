package search;

/**
 * @author avinash.a.mishra
 */
public class BinarySearch {

    public static void main(String[] args) {
        int search=9;
        int index=-56;
        int arr[]={2,4,8,8,9,33,99};
       // index = nonRecursionWay(arr, search);
     index =  byRecursion(arr,0,arr.length-1,search);


        System.out.println(index);

    }

    private static int byRecursion(int[] arr, int i, int j,int search) {

          if(i<=j && j< arr.length){  //here i<=j is crucial as there can be instance when i overlap j

              int m=(i+j)/2;

          if(arr[m]==search){
              return m;
          }
          if(arr[m]>search){
              j=m-1;
              return byRecursion(arr,i,j,search);
          }else{
              i=m+1;
              return byRecursion(arr,i,j,search);
              //sometimes we need to write return statement to just avoid compilation
          }

          }else {
    // We reach here when element is not present in array
              return -1;
              //it also says we can have base cases like here
          }

    }

    private static int nonRecursionWay(int[] arr, int search) {

        int searchIndex=-1;
        int i=0;
        int j=arr.length-1;

        while(i<=j) {  // rember this condition ,break condition
                   // if search element is at higher side thn i will grow larger than j, --->  i=m+1
                    // if search element is at lower side-- then j will grow smaller than i  ---->j=m-1
            int m = (i + j) / 2;    //brackets () are v.imp
            if (arr[m] == search) {
                searchIndex=m;
                break;
            } else if (arr[m] > search) {
                j = m-1; // -1

            } else {
                i = m+1;  //+1
            }

        }


        return searchIndex;
    }

}
