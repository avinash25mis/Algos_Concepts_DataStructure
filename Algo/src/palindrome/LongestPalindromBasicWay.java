package palindrome;

public class LongestPalindromBasicWay {

   /*  Palindrome
    a number that remains the same when its digits are reversed.
    For example, 121, 1331
    */

    /*
    * learning
    * number of digits between  two number including both of the edges
    *  eq: an employee work from 10 june to 30 june , how many days he worked ?
    *    or
    *  how many numbers are there between 10 and 30 both inclusive ?
    *  30-10+1 = 21 days
     *
    * */

    public static void main(String[] args) {

    }

    /*
    * even knowing  brute force help us optimise
    * when i = 0 --> j=i ie j is also 0    Hence we cover from dead left to dead right
    * when i=2  --> j=i  so j=2   here we cover from 2nd index to dead right
    * in this way actually cover all the window in brute force
    *
    * In short, we check with every start (s) and consider every end (e) starting with s
    *
    * */

    static int longestPalSubstr(String str) {

        int n = str.length();
        int longest = 1;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                boolean flag = true;

                // on each j increment  we  check by one complete traversal for  the palindrome
                for (int k = 0; k < (j - i + 1) / 2; k++) {
                    if (str.charAt(i + k) != str.charAt(j - k)) { //imp logic compare last and first,
                                                                 // then second last and second and so on
                        flag = false;
                    }
                }

                // Palindrome length
                if (flag && (j - i + 1) > longest) {
                    longest = j - i + 1;
                }
            }
        }
    return longest;
    }





}