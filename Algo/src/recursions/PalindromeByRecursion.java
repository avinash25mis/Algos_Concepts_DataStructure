package recursions;

public class PalindromeByRecursion {

    public static void main(String[] args) {
        String str = "abc";
        boolean isPalindrome = checkPalindrome(str, 0, str.length() - 1);
        System.out.println(isPalindrome);
    }


    /*
     * by recursion
     * */
    private static boolean checkPalindrome(String str, int i, int l) {
        if (i >= l) {
            return true;
        }
        if (str.charAt(i) != str.charAt(l)) {
            return false;
        }
        return checkPalindrome(str, ++i, --l);
    }

    /*
      Recursion time complexity
    * In one function call, we are doing an O(1)
    * recursive call is being done for at most n/2 times
    * Thus the overall complexity will be O(n)
    *
    * */


}
