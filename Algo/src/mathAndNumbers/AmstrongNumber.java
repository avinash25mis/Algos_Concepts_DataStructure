package mathAndNumbers;


/*
 amstrong number
 (sum of all digit  to the power) ^ (number of digits)


*
* 153
* number of digit is 3 here
*  1^3 + 5^3 + 3^3 =>
*   1 + 125+ 27 = 153
*
* 1634
*  1^4 + 6^4 + 3^4 + 4^4
* 1 + 1296 + 81 + 256 = 1643
* */

/*% remainder operator gives the last digit
/ dive operator  changes the second last digit to last digit    */
public class AmstrongNumber {

    public static void main(String[] args) {
        int num= 1634;
        findIfAmstrong(num);
    }

    private static void findIfAmstrong(int num) {
    int temp=num;
    int temp2=num;
    //let us first find number of digits
        int digits=0;
        while(temp>0){
            digits++;
            temp=temp/10;
        }

        int sum=0;

        while(temp2>0){
            int k=temp2%10;
            sum=sum+(int)(Math.pow(k,digits));
            temp2=temp2/10;
        }

        if(num==sum){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }

}
