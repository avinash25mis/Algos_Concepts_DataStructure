package unCommon;

public class RomanToDecimal {

/*
* roman number values are derived by adding each digit unlike decimal numbers
* eq XV is (10+5) 15  digit-1(10) > digit-2 (5)
* eq XVIII (10+5+1+1+1) = 18
*
*  III
* digit-1(1) = digit-2 (1)
* I+1=2
* again 2+1=3
*
* but the catch is when digit_1 < digit_2
*  IV,  IX ,  XL  , XC
*  in those cases the number is digit-2 - digit-1
*  luckily this cases max can cover 2 digit ie we do not have something like
*  IIIV   or  IIIX or  XXXC  though we have VIII , XIII etc but that's different
*
* */

 /*   main logic

       if(s1>=s2){
       result=result+s1;
      }else{
       result=result+s2-s1;
           i++;
         }

 * */



    public static void main(String[] args) {
        String roman="XVIII";
        getIntegetFromRoman(roman);

    }

    private static void getIntegetFromRoman(String roman) {
        int result=0;
        for(int i=0;i<roman.length();i++){
            int s1 = getInteger(roman.charAt(i));

            if(i+1<roman.length()){
                int s2 = getInteger(roman.charAt(i+1));

                if(s1>=s2){
                    result=result+s1;
                }else{
                    result=result+s2-s1;
                    i++;
                }

            }else{
                result=result+s1;
            }
        }
        System.out.println(result);
    }

    public static int getInteger(Character code){
        int number=0;
        if(code.equals('I')){
            return 1;
        }
        else if(code.equals('V')){
            return 5;
        }
        else if(code.equals('X')){
            return 10;
        }
        else if (code.equals('L')){
            return 50;
        }
        else if (code.equals('C')){
            return 100;
        }
        else if (code.equals('D')){
            return 500;
        }
        else if (code.equals('M')){
            return 1000;
        }

        return 0;
    }


}
