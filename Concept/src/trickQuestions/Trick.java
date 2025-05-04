package trickQuestions;

import Inheritance.Child;
import Inheritance.ClassUsingInfaceVariable.TheInterface;
import Inheritance.ClassUsingInfaceVariable.TheClass;
import Inheritance.Parent;

public class Trick {
    public static void main(String[] args) {
        Trick t = new Trick();
        t.instanceOFOperation();
    }

    /*
    *
    * child class object is always instance of parent class
    * but parent class object is not an instance of child class
    *
    * Reference do not matter in instance of
    *
    * */
    private  void instanceOFOperation() {
        //null is not an instance of String or Object
        System.out.println(null instanceof String);
        System.out.println(null instanceof Object);
        System.out.println("--------- child obj---------");
        Parent c= new Child("t");
        System.out.println(c instanceof Child);
        System.out.println(c instanceof Parent);

        System.out.println("---------parent obj---------");
        Parent p = new Parent();
        System.out.println(p instanceof Child);
        System.out.println("---------interface instanceof---------");
        TheClass theClass= new TheClass();
        System.out.println(theClass instanceof TheInterface);


    }
}
