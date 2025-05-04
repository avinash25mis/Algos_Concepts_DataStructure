package sumRelated;

public class Fibonacci {

    public static void main(String[] args) {
        int fibonaci = findFibonaci(4);
        System.out.println(fibonaci);
    }


    static int findFibonaci(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}

