package stack.core;

import common.MyException;

import java.util.Arrays;

/**
 * @author avinash.a.mishra
 */
public class MyDynamicStack {

protected  int top;
protected  int arr[];

   public MyDynamicStack(int size){
   arr = new int[size];
   }

   public MyDynamicStack(){
    this(4);
   }

    public void push(int value) throws Exception {
        if(top==arr.length) {
            grow();
        }
            arr[top]=value;
            top++;


    }



    public int pop() throws MyException {
        int value=0;
        if(isEmpty()){
            throw new MyException("Stack is Empty");
        }else {
            top--;
            value = peek();
            arr[top] = 0;
            shrink();
        }
        return value;

    }


    private void grow() {
        int length=size();
        int newArr []=new int[length*2] ;
        System.arraycopy(arr,0,newArr,0,length);
        arr=newArr;
    }

    /*
    * say if arr.length=16
    * if size() == 8 ,its ok do not do anything
    * if size() == 4 , make an arr.length=8
    *
    * if we had used wrapper ckass then shirnk could have
    * been replace by arr[top]=null, for garbage collection to work
    * */
    private void shrink() {
    int length=size();
    if(length==arr.length/4){
        int newArr[] = new int[arr.length/2];
        System.arraycopy(arr,0,newArr,0,length);
        arr=newArr;
    }
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
