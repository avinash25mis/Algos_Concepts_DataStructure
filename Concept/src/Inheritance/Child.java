package Inheritance;

public class Child extends Parent {

    public String name="child name";

    public Child() {
        System.out.println("No-argument constructor of child");
    }


    public Child(String name) {
        //super(name);
        this.name=name;
        System.out.println(" parameterized constructor of child");
    }

    public void show(){
        System.out.println("child implementation");
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
