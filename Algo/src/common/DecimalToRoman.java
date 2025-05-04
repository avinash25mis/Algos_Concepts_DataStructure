package common;

public class DecimalToRoman {

 /* I             1
    IV            4
    V             5
    IX            9
    X             10
    XL            40
    L             50
    XC            90
    C             100
    CD            400
    D             500
    CM            900
    M             1000*/

/*    I II III IV V VI VII VIII IX  X
    XI XII  XIII  XIV  XV

    the reason of taking 4, 9 40,90,400, 900 into consideration is because in Roman we keep on adding unit
    for 3 times (VI VII VIII) and when it is one step away from the milestone(V,X,L,C,D,M)
     we start calling them a unit less than milestone

    therefore donot confuse that the repitition of unit (VI VII VIII) can be both in forward and backword
    it is only forward except for one unit away from milestone(4, 9 40,90,400, 900)
    */

    public static void main(String[] args) {
        int number=3549;
        getTheRoman(number);
    }



    private static void getTheRoman(int number) {
     String romanResult="";
        while(number>0){

            if(number >=1000){
              int k=number/1000;
              number=number % 1000;
              //M
                romanResult =romanAppender(romanResult,"M",k);
            }
            else if(number>=500){

                if(number<900){
                  //D
                   int j=number%500;
                   int k=j/100;
                  romanResult =romanResult+"D";
                  romanResult =romanAppender(romanResult,"C",k);
                  number=number%100;

                }else {
                   // CM
                    romanResult =romanResult+"CM";
                    number=number%100;
                }

            }
            else if(number>=100){

                  if(number<400){

                      int k=number/100;
                      romanResult =romanAppender(romanResult,"C",k);
                      number=number%100;
                      //C
                  }else{
                      //CD
                      romanResult =romanResult+"CD";
                      number=number%100;
                  }

            }
            else if(number>=50){

                if(number<90){
                    //L
                    int j=number%50;
                    int k=j/10;
                    romanResult =romanResult+"L";
                    romanResult =romanAppender(romanResult,"X",k);
                    number=number%10;
                }else{
                    //XC
                    romanResult =romanResult+"XC";
                    number=number%10;
                }

            }
            else if(number>=10){
                if(number<40){
                    //X
                    int k=number/10;
                    romanResult =romanAppender(romanResult,"X",k);
                    number=number%10;
                }else {
                    romanResult =romanResult+"XL";
                    number=number%10;
                    //XL
                }
            }
         else if(number>=5){
              if(number<9){
                 int j=number%5;
                 int k=j/1;
                  romanResult =romanResult+"V";
                  romanResult =romanAppender(romanResult,"I",k);
                  number=0;
                  //V
              }else{
                  //IX
                  romanResult =romanResult+"IX";
                  number=0;
              }


            }
         else{
             if(number<4){
                 int k=number/1;
                 romanResult =romanAppender(romanResult,"I",k);
                 number=0;
             }else{
               if(number==4) {//redudant as this is the only condition left
                   romanResult = romanResult + "IV";
                   number = 0;
               }
             }

            }

        }

        System.out.println(romanResult);

    }




    public static String romanAppender(String str,String key,int repit){
     StringBuilder db= new StringBuilder(str);
      for(int i=1;i<=repit;i++){
          db.append(key);
      }
      return db.toString();
    }
}


