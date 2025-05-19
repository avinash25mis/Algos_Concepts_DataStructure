package stack;

import stack.core.MyDynamicStack;
import stack.core.MyStack;

public class TestStack {

    public static void main(String[] args) throws Exception {
       // fixedStackTest();
      dynamicStackTestGrow();
      //dynamicStackTestShrink();


    }

    private static void dynamicStackTestGrow() throws Exception  {
    MyDynamicStack stack= new MyDynamicStack();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack);
        stack.push(8);
        System.out.println(stack);

    }


    private static void dynamicStackTestShrink() throws Exception  {
        MyDynamicStack stack= new MyDynamicStack();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);

    }

    private static void fixedStackTest() throws Exception {
        MyStack stack = new MyStack();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        //stack.push(9);

       // stack.pop();
        //stack.pop();

        System.out.println(stack);
    }
}
