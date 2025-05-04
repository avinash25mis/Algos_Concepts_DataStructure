package palindrome;

public class LongestPalindromBasicWay {


    public static void main(String[] args) {

    }

    /*
    * even knowing  brute force help us optimise
    *i=j means
    * when i =0 --> j=i ie j=0   Hence we cover from dead left to dead right
    * when i=2  --> j=i  so j=2   here we cover from 2nd index to end right
    * in this way actually cover all the window in brute force
    *
    * In short, we check with every start (s) and consider every end (e) starting with s
    *
    *
    * */

    static int longestPalSubstr(String str) {

        int n = str.length();
        int longest = 1;
        int start = 0;
        int end = 0;


        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                boolean flag = true;

                // on each j increment  we  check by one complete traversal for  the palindrome
                for (int k = 0; k < (j - i + 1) / 2; k++) {
                    if (str.charAt(i + k) != str.charAt(j - k)) {
                        flag = false;
                    }
                }

                // Palindrome length
                if (flag && (j - i + 1) > longest) {
                    start = i;
                    end  =  j;
                    longest = j - i + 1;
                }
            }
        }
    return longest;
    }





}