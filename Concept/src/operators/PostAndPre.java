package com.operators;

public class PostAndPre {

    public static void main(String[] args) {
        printingPostIncrementAtSout();
        printingPreIncrementAtSout();

    }


    private static void printingPostIncrementAtSout() {
        int decrement=0;
        System.out.println(decrement--);

        int increment=0;
        System.out.println(increment++);

    }


    private static void printingPreIncrementAtSout() {
        int preIncrement=0;
        System.out.println(++preIncrement);

        int preDecrement=0;
        System.out.println(--preDecrement);

    }


}
