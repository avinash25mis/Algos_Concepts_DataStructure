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


/*    fibonacciRecursion (4)
    It will recursively call fibonacciRecursion function for values 2 and 3
    fibonacciRecursion (2) \\ call for value 0 and 1
    fibonacciRecursion (0) = 0
    fibonacciRecursion (1) = 1
    fibonacciRecursion (3) \\ It will call for 1 and 2
    fibonacciRecursion (1) = 1
    fibonacciRecursion (2) \\ It will call for 0 and 1
    fibonacciRecursion (0) = 0
    fibonacciRecursion (1) = 1

    */


    public static void main(String[] args) {
       int n=12;
       // fibonacciByRecursionMyTry(6);



        for(int i = 0; i < n; i++){
            int result = fibonacciByRecursion(i);
            System.out.println(result);
        }

    }



    private static int fibonacciByRecursion(int n) {
        if(n<=1){
            return n;
        }

        return fibonacciByRecursion(n-1) + fibonacciByRecursion(n-2);
        //again we multiplyihg with the result of the method return
    }


    private static void fibonacciByRecursionMyTry(int n) {
        if(n<0){
            return ;
        }
        fibonacciByRecursionMyTry(--n);
        int p= n-1+n-1;
        System.out.println(p);

    }








}


