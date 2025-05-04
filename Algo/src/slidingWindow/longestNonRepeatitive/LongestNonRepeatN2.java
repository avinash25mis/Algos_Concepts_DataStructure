package slidingWindow.longestNonRepeatitive;
/*
find the longest non repetative
 O(n*n)
* */
public class LongestNonRepeatN2 {

    public static void main(String[] args) {
        String str="aviakanshm";
        // String str="vishal";
        getLongestNonRepeting(str);
    }

    private static void getLongestNonRepeting(String str) {
        int maxLength=0;

        for(int i=0;i<str.length();i++){

            boolean [] arr= new boolean[26];

            for(int j=i;j<str.length();j++){

                if(arr[str.charAt(j)-'a']==true){
                     break;
                }else{
                    arr[str.charAt(j)-'a']=true;
                    maxLength=Math.max(maxLength,j-i+1);
                }

            }

            arr[str.charAt(i)-'a']=false;
        }

        System.out.println("max length :"+maxLength);
    }
}
