package com.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author avinash.a.mishra
 */
/*
* Case 1 : if parent method throws an exception then
*
* 1.it is okay if child not throwing any exception
* 2.child can throw a child exception of the parent exception
* 3.child can throw an Exception of other blood line
*  but if parent method thows a runtime exception then child cannot throw a compile time exception
*
*
*  Case 2 : if parent method donot throw any exception
*
* 1. child method can throw a runtime exception
* 2. child method cannot throw a Compile time exception
*
* ie Child can only throw a compile time exception if Parent throws it
*
*
*
* */



class Base {

    public void method()  throws RuntimeException {
        System.out.println("base");
    }


}

class Child extends Base{


    @Override
    public void method() throws RuntimeException {
        System.out.println("child");
    }
}




public class OverridingAndException {
    public static void main(String[] args) throws Exception {
        Base b= new Child();
        b.method();
    }
}
