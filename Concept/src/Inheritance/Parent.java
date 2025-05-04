package Inheritance;

public class Parent {

    String name="parent name";

   public Parent() {
        //this("");
        System.out.println("No-argument constructor of parent class");
    }

    public Parent(String name) {
        this.name = name;
        System.out.println("parameterized constructor of parent");
    }

    public void show(){
        System.out.println("parent implementation");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
