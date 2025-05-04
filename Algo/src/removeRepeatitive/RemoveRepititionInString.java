package removeRepeatitive;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author avinash.a.mishra
 */
public class RemoveRepititionInString {

    public static void main(String[] args) {
        String str="AVAI";


        //replaceUsingHashing(str);
        replaceUsingIndexOf(str);
    }


    /*
    * need to note here the str.indexOf() is a overloaded funtion
    * one accepts char(int) and another accepts String
    *
    * and on the contrary str.contains() only accepts string
    *
    * also concat operator "+" make the next elemnt as string no matter what type
    * newStr+str.charAt(i);
    *
    * */

    //we make a new string and only keep uniques chars in that string
    private static void replaceUsingIndexOf(String str) {

      String newStr="";
      for(int i=0;i<str.length();i++){
          if(newStr.indexOf(str.charAt(i)) < 0){
              newStr=newStr+str.charAt(i);
          }
      }
        System.out.println(newStr);
    }

    /*
    * above code could have also been done following way
    *
    *  if(!newStr.contains(Character.toString(str.charAt(i)))){
              newStr=newStr+str.charAt(i);
          }
    * */



    private static void replaceUsingHashing(String str) {
        Set<Character> set= new LinkedHashSet<>();

        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }


        for(Character c:set){
            System.out.print(c);
        }

    }
}
