package java8.defaultAndStatic;

public class TestMI implements I1,I2{

    @Override
    public void method() {

    }
}

/*
 compiler will do additional checks to avoid ambiguity
 in calling default methods and Diamond problem, which could come
 if a class implements two interfaces that contain the default methods with the same name.


* */


class TestDefault implements I3,I4{


    /*
    * we need to redefine it
    * */
    @Override
    public void method() {
        I3.super.method();
    }
}



class Main{

    public static void main(String[] args) {
        TestMI a= new TestMI();
        TestDefault td= new TestDefault();
        td.method();

    }
}
