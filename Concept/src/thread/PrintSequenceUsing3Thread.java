package com.thread;

public class PrintSequenceUsing3Thread {


    public static void main(String[] args) {
        NumbersGenerator numbersGenerator = new NumbersGenerator(3, 10);

        Thread t1 = new Thread(new MyRunnable2(numbersGenerator, 1), "THREAD-1");
        Thread t2 = new Thread(new MyRunnable2(numbersGenerator, 2), "THREAD-2");
        Thread t3 = new Thread(new MyRunnable2(numbersGenerator, 0), "THREAD-3");

        t1.start();
        t2.start();
        t3.start();
    }


}



 class MyRunnable2 implements Runnable {

    private NumbersGenerator numbersGenerator;
    private int threadSeq;

    public MyRunnable2(NumbersGenerator numbersGenerator, int threadSeq) {
        this.numbersGenerator = numbersGenerator;
        this.threadSeq = threadSeq;
    }

    @Override
    public void run() {
        numbersGenerator.printNumber(this.threadSeq);
    }
}





class NumbersGenerator {
    private int currNumber = 1;
    private int numOfThreads;
    private int max;

    public NumbersGenerator(final int numOfThreads, final int max) {
        this.numOfThreads = numOfThreads;
        this.max = max;
    }

    public void printNumber(int threadSeq) {
        synchronized (this) {
            while(currNumber < max-1) {
                while (currNumber % numOfThreads != threadSeq) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName() + " : " +currNumber);
                currNumber++;
                notifyAll();
            }
        }
    }
}
