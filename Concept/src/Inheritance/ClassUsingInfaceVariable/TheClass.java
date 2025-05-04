package Inheritance.ClassUsingInfaceVariable;

public class TheClass implements TheInterface {

    public static void main(){
        System.out.println(a);
       // a=100;  //gives a compile time Exception
    }

    @Override
    public void show() {

    }
}
