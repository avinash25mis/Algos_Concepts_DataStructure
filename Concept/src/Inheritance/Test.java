package Inheritance;

/**
 * @author avinash.a.mishra
 */
public class Test {


        public static void main(String args[]) {

            System.out.println("--------------constructor call--------------------");
            Child childRefChildObj = new Child("child");
            Parent parentRefChildObj= new Child("child");

            System.out.println("--------------variable call--------------------");

            System.out.println("Child class reference :"+childRefChildObj.name);
            System.out.println("Base class reference :"+parentRefChildObj.name);

            System.out.println("--------------method call--------------------");

            System.out.print("Child class reference :");
            childRefChildObj.show();
            System.out.print("Base class reference :");
            parentRefChildObj.show();

            System.out.println(parentRefChildObj.getName());



        }




        /*
        * method of child object is called but if child do not have that method then parent method will be called
        *
        *
        * */

}


