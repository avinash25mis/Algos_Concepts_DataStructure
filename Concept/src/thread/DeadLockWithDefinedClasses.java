package com.thread;

/**
 * @author avinash.a.mishra
 */
public class DeadLockWithDefinedClasses {

    public static void main(String[] args) {
        DeadLockWithDefinedClasses test = new DeadLockWithDefinedClasses();

        final A a = test.new A();  // creating object as A is ExampleDeadLock2
        final B b = test.new B();

        // Thread-1
        Runnable block1 = new Runnable() {
            public void run() {
                synchronized (a) {
                    try {
                        // Adding delay so that both threads can start trying to
                        // lock resources
                        System.out.println("Thread 1: Locked a");
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // Thread-1 have A but need B also
                    synchronized (b) {
                        System.out.println("Thread 1: Locked b");
                    }
                }
            }
        };

        // Thread-2
        Runnable block2 = new Runnable() {
            public void run() {
                synchronized (b) {
                    // Thread-2 have B but need A also
                    synchronized (a) {
                        System.out.println("In block 2");
                    }
                }
            }
        };

        new Thread(block1).start();
        new Thread(block2).start();

    /*    Thread t1= new Thread(block1);
        Thread t2= new Thread(block2);
        t1.start();
        t2.start();*/
    }

    // Resource A
    private class A {
        private int i = 10;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    // Resource B
    private class B {
        private int i = 20;




        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}