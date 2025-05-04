import java.util.Arrays;
import java.util.HashMap;

public class QuickQuestions {

    public static void main(String[] args) {

        switch (3){
           case 1:
                getCharCountByArray();
             break;

           case 2:
               findForgotenNumberByCount();
             break;

           case 3:
                 printPermutations(new int [] {1,2,3},0,2);
             break;

           case 4:
                 maxDiffStocks(new int [] {2,7,2,1},4);
             break;

           case 5:
               getLongestNonRepeating("avinash");
             break;

        }
    }



    public static void palindromeForSubString(int i,int j,String str){
        boolean flag=true;
        for (int k = 0; k < (j - i + 1) / 2; k++) {
            if (str.charAt(i + k) != str.charAt(j - k)) {
                flag = false;
            }
        }
        System.out.println(flag);
    }



    public static boolean palindromeForSubString(String str){
        for (int i = 0; i < str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1- i)) //comparison  can be done via single i
                return false;
        }
        return true;
    }


    /*
    * the logic is more like hashing
    * */
    static void getCharCountByArray()
    {
        String str="avinash";

        int arr[]= new int[256];

        int k=-1;
        char x='\0';

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }

        //here also we are following the order of str
        for (int i = 0; i < str.length(); i++) {
            if(arr[str.charAt(i)]==1){
                k=i;
                x=str.charAt(i);
                break;
            }
        }

        System.out.println(k);
        System.out.println(x);
    }


    public static void findForgotenNumberByCount(){
       int forgotenCount = 2;
       int requiredSum = 11;
        int forgotArray[]=new int[forgotenCount];
        for(int j=0;j<forgotArray.length;j++){
            forgotArray[j] = requiredSum/forgotenCount--;
            requiredSum = requiredSum-forgotArray[j];
        }
        System.out.println(Arrays.toString(forgotArray));
    }


    private static void printPermutations(int[] arr, int l, int r) {
        if(l==r){
            System.out.println(Arrays.toString(arr));
        }

        for(int i=l;i<=r;i++){ //starting with l to r
            swap(arr,l,i);
            printPermutations(arr,l+1,r); //keep fixing one left digit
            swap(arr,l,i);
        }
    }

    private static void swap(int[] arr, int l, int i) {
        int temp=arr[i];
        arr[i]=arr[l];
        arr[l]=temp;
    }


    static int maxDiffStocks(int arr[], int arr_size)
    {
        if(arr_size<2){
            return -1;
        }
        //initializing max  diff as initial pointers
        int max_diff = arr[1] - arr[0];
        int i = 0;

        for (int j = 1; j < arr_size; j++)
        {
            //we record the maximum difference as we move and check if current max is greater
            if (arr[j] - arr[i] > max_diff) {
                max_diff = arr[j] - arr[i];
            }
            //we keep initializing i to smaller element as we move
            if (arr[j] < arr[i]) {
                i = j;
            }
            //even if we change the i  here, in the next iteration j will be j++
        }
        System.out.println("O(N)-"+max_diff);
        return max_diff;
    }


    private static void replaceRepititionFromString(String str) {

        String newStr="";
        for(int i=0;i<str.length();i++){
            if(newStr.indexOf(str.charAt(i)) < 0){
                newStr=newStr+str.charAt(i);
            }
        }
        System.out.println(newStr);
    }



    private static int getLongestNonRepeating(String str) {

        HashMap<Character, Integer> seen = new HashMap<>();
        int maximum_length = 0;


        int maxStart=-1;
        int maxEnd=-1;

        //  inital point of window to index 0 ie i/i =0
        int i = 0;

        //counter inside the for will be end/j
        for(int j = 0; j < str.length(); j++)
        {
            // Checking if we have already seen the element or not
            if(seen.containsKey(str.charAt(j)))
            {
                // If we have seen the number, move the i pointer
                // to position after the last occurrence
                i = Math.max(i, seen.get(str.charAt(j)) + 1);
            }

            // Updating the last seen index of the character
            seen.put(str.charAt(j), j);

            if(j - i + 1 > maximum_length){
                maximum_length =j - i + 1;
                maxStart=i;
                maxEnd=j;
            }
            //  maximum_length = Math.max(maximum_length, j - i + 1);
        }

        System.out.println("max length:"+maximum_length);
        System.out.println("indexes :"+maxStart+"-"+maxEnd);
        return maximum_length;
    }


}
