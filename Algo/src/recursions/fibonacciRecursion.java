package recursions;

public class fibonacciRecursion {


    /*
     * at last it will find the  sum 0+1
     * */


/*                       fib(5)
                     /            \
               fib(4)               fib(3)
            /        \              /       \
        fib(3)        fib(2)       fib(2)   fib(1)
            /    \       /    \        /      \
       fib(2)   fib(1)  fib(1) fib(0) fib(1) fib(0)
        /   \
    fib(1) fib(0)*/


/*
   let us understand it
   ---------------------------

   fibonacciRecursion (4)
    It will recursively call fibonacciRecursion function for values 2 and 3
    now fibonacciRecursion (2) \\ call for value 0 and 1 and so on
    ------
    fibonacciRecursion (3) \\ It will call for 1 and 2 and so on
    ------
    -----finally------
    fibonacciRecursion (0) = 0
    fibonacciRecursion (1) = 1

    */


    public static void main(String[] args) {
       int n=8;

        for(int i = 0; i < n; i++){
            int result = fibonacciByRecursion(i);
            System.out.println(result);
        }

    }


    /*
    * the logic follows the reverse order
    * */

    private static int fibonacciByRecursion(int n) {
        if(n<=1){
            return n;
        }

        return fibonacciByRecursion(n-1) + fibonacciByRecursion(n-2);
        //case where we add  the result of the method return
    }


    /*
    * problem here
    * it keeps solving same small problem again and again
    *
    * */











}


