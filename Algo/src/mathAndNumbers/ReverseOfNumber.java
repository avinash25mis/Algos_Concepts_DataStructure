package mathAndNumbers;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int num=876;
        reverseIt(num);
    }

    private static void reverseIt(int num) {
        int rev=0;
        while(num>0){
            int k =num % 10;
            rev = rev * 10 + k; //main logic
            num = num / 10;

        }
        System.out.println(rev);
    }
}
