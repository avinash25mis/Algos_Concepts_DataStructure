package string;

public class StringTests {

    public static void main(String[] args) {
        //poolIntern();
       bufferBuilderString();
    }

    private static void bufferBuilderString() {
        String s1="ABC";

        StringBuffer s2=new StringBuffer("ABC");
        StringBuffer s3=new StringBuffer("ABC");

        StringBuilder s4=new StringBuilder("ABC");
        StringBuilder s5=new StringBuilder("ABC");

        System.out.println("String & Buffer :"+s1.equals(s2));
        System.out.println("String & Builder :"+s1.equals(s4));
        //using tostring method
        System.out.println("String & Buffer toString :"+s1.equals(s2.toString()));
        System.out.println("String & Builder toString :"+s1.equals(s4.toString()));


        System.out.println("Buffer & Buffer :"+s2.equals(s3)); //
        System.out.println("Builder & Builder :"+s4.equals(s5)); //

    }

    private static void poolIntern() {

        String s1="ABC";
        String s2="ABC";
        String s3=new String("ABC");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
