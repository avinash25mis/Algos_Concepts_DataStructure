package Exception;

import java.io.IOError;
import java.io.IOException;

/**
 * @author avinash.a.mishra
 */
public class Finally {

    public static void main(String[] args) {
        try {
            myMethod();
        }catch (NullPointerException e){
    // need no catch if method being called in try declares throwing unchecked exception
        }

    }

    private static int  myMethod() {
       // int k= 2/0;// if only exception occurs here then finally block will not be exected
        try{
           int t= 2/0; //if excption occurs here then finnaly is executed but "try" and after finally syso is not"
            System.out.println("try");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("after finally");



        return 1;
    }


}
