package simpleStrings;

/**
 * @author avinash.a.mishra
 */
public class ToggleAlphabetCase {

    /*
    *
    * */
    public static void main(String[] args) {
       // usingBitwiseOperator();
        usingBasicOperator();
    }

    private static void usingBitwiseOperator() {
        String str="I am King";
        StringBuilder result=new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
               char k= str.charAt(i);
                k^= (1 << 5);
                result.append(k);

        }

        System.out.println(result.toString());
    }

    public static void usingBasicOperator() {
        String str="I am Kinga";


        StringBuilder result=new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        { char c = str.charAt(i);
            if(c>='A' && c<='Z')
            {
                c=(char)((int)c+32);
            }
            else if(c>='a' && c<='z')
            {
                c=(char)((int)c-32);
            }
          result.append(c);
        }

        System.out.println(result.toString());
    }
}
