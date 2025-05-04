package palindrome;

public class LongestPalindromeImprovised {

    public static void main(String[] args) {
        String str="aba";
        findLongestPalindrome(str);

    }




    /*
    * when we look at the basic way we fine that two loops i & j are just used to navigate around
    * and the third loop which is obvious checks if it is a palindrom
    *
    * The trick here is to reduce the upper nested loops (i & j) to one (i)
    * we can start from center and call the check palindrome with only i itself
    *
    * only concern here is that a palindrom can  have odd no of alphabet (kak) as well as
    *  even no of alphabets(akka)
    * so to consider the even no of alphabet we start with taking middle two elements (i,i+1)
    * and to consider the odd no of alphabet we start with  (i,i)
    *
    *
    *
    * */


    private static String  findLongestPalindrome(String str) {

      int start=0;
      int end=0;
        for(int i=0; i<str.length();i++){
            int l1=expand(str,i,i);
            int l2=expand(str,i,i+1);

           int currentLongeest = Math.max(l1,l2);

            if (currentLongeest > end - start) {
                start = i - (currentLongeest - 1) / 2;
                end = i + currentLongeest / 2;
            }
        }
        return str.substring(start, end + 1);
    }

    private static int expand(String str, int start, int end) {

        while(start>=0 && end<str.length() && str.charAt(start)==str.charAt(end)){
            start--;
            end++;
        }

        /*
        * since by the time it got out of the loop we already start-- &&  end++
        * so ideally legnth is end-start+1
        * but here it would be  end-start+1-1-1
        * end-start-1
        * */
     return end-start-1;
    }
}
