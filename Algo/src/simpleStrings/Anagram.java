package simpleStrings;


import java.util.Arrays;

/*
0-127  are the ACII values

         65  A         97  a

         66  B         98  b
         67  C         99  c
         68  D        100  d

         90  Z        122  z

     A-Z => 65-90
     a-z => 97-122
     observe the diff between lowecase a and uppercase A is 32 and so on

     to utilize the arr index from begning  we use  [str.charAt(i)-'a'] so that a is placed at 0 index
     b is placed at 1th index and so on

     however i feel we could also take [str.charAt(i)-'A'] to accommadate
* */
public class Anagram {


    public static void main(String[] args) {
        String str1="aabbcc";
        String str2="abbacc";
        basicWay(str1,str2);
        findIfAnagram(str1,str2);

    }

    /*
    * initializing array with all 0,
    * making the alphabet with index and incrementing with each occurrence
    * in the same loop decrement the index each alphabet occurrence
    * eventually if both strings are anagram then all the increment index will be decremented back to 0
    *
    * */

    private static void findIfAnagram(String str1, String str2) {
        int arr[]= new int[256];

        if(str1.length()!=str2.length()){
            System.out.println("Not a anagram");
        }else{
            for(int i=0;i< str2.length();i++){
                arr[str1.charAt(i)-'a']++;
                arr[str2.charAt(i)-'a']--;
            }

            boolean anagram=true;
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=0){
                    anagram=false;
                }
            }
        }
    }


    private static void basicWay(String str1,String str2){

        if(str1.length()!=str2.length()){
            return;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2= str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for(int i=0;i<str1.length();i++){
            if(charArray1[i]!=charArray2[i]){
                return;
            }
        }
        System.out.println("both are annagram");
    }

}
