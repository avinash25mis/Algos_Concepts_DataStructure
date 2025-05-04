package thread;

public class EvenOddThread {
    public static void main(String[] args) {
        Printer print= new Printer();
        Thread t1=new Thread(new MyRunnable(false,print, 15),"ThreadOdd");//thread name
        Thread t2=new Thread(new MyRunnable(true,print, 15),"ThreadEven");

        t1.start();
        t2.start();

    }
}

class MyRunnable implements Runnable{

    boolean isEven;
    Printer printer;
    int max; //till what u wanna print

    MyRunnable(boolean isEven,Printer printer,int max){
        this.isEven=isEven;
        this.printer=printer;
        this.max=max;
    }

    @Override
    public void run() {
        int number = isEven ? 2:1;
        while (number < max) {
            if (isEven) {
                printer.printEven(number);
            } else {
                printer.printOdd(number);
            }
            number = number + 2;
        }


    }
}


class Printer {

    private volatile boolean isEven = true;


    public Printer(){

    }

    public synchronized void printOdd(int number){

        while (isEven){  //till the time it does not turn odd , do wait
            try{
                wait();

            }catch (InterruptedException e){

            }
        }
        System.out.println(Thread.currentThread().getName()+" "+number);
        isEven = true; ////make it  back to even and release lock
        notify();
    }


    public synchronized void printEven(int number){
        while (!isEven){   //till the time it does not turn even, do wait
            try{
                wait();

            }catch (InterruptedException e){

            }
        }
        System.out.println(Thread.currentThread().getName()+" "+number);
        isEven = false; //make it  back to odd and release lock
        notify();
    }

}
