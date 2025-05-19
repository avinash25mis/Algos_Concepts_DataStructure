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
    private static boolean checkPalindrome(String str, int startIndex, int lastIndex) {
        if (startIndex >= lastIndex) {
            return true;
        }
        if (str.charAt(startIndex) != str.charAt(lastIndex)) {
            return false;
        }
        return checkPalindrome(str, ++startIndex, --lastIndex);
    }

    /*
      Recursion time complexity
    * In one function call, we are doing an O(1)
    * recursive call is being done for at most n/2 times
    * Thus the overall complexity will be O(n)
    *
    * */


}
