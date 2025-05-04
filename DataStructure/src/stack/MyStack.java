package stack;

import common.MyException;

import java.util.Arrays;

/**
 * @author avinash.a.mishra
 */
public class MyStack {

    int capacity=3;

     int arr[];
     int top;   //setting default as 0 hence top will be a position above

     MyStack(){
         arr =new int[capacity];
     }


     public void push(int value) throws Exception {
      if(top==arr.length){  //top-3==0/ (top==arr.length)/ top==capacity
          throw new MyException("Stack is Full");
      }else{
          arr[top]=value;
          top++;
      }

     }

     public int pop() throws MyException {
         int value=0;
       if(isEmpty()){
     throw new MyException("Stack is Empty");
       }else {
           top--;
           value = peek();
           arr[top] = 0;
       }
         return value;

     }

    public int peek() {
      int length=top;
      int value=arr[length--];
      return  value;
     }



     public int size(){
         return top;
     }


     public boolean isEmpty(){
         return top<=0;
     }

    @Override
    public String toString() {
        return "MyStack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
