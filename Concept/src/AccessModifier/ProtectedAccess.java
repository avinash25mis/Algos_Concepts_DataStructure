package AccessModifier;

import java.util.HashMap;
import java.util.Map;

/**
 * @author avinash.a.mishra
 */

class Parent {
    protected String name;

    Parent(){  //if no defaut const then problem in extending as it has got a parameter constructor

    }

    Parent(String name){
        this.name=name;
    }

    protected  void baseMethod(){
        System.out.println("base method");
    }

}


class Child extends Parent{

    public void childMethod(){
        baseMethod();
        System.out.println(name);
    }
}


public class ProtectedAccess {

    public static void main(String[] args) {
        Child c=new Child();
        System.out.println(c.name);
        c.childMethod();

        Parent p = new Child();
        p.getClass();

        if(p instanceof Parent){
            System.out.println("yes");
        }
        if(p instanceof  Child){
            System.out.println("yiioo");
        }

        String a="a";
        String a1=new String("a");
        String a2=new String("a");
        Map<String,String> map = new HashMap<>();
        map.put(a,"a");
        map.put(a1,"a");
        map.put(a2,"a");
        System.out.println(map.size());
        //c.clone(); // does not allow
    }
}
