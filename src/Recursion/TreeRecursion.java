package Recursion;

public class TreeRecursion {

    // Recursive function
    static void fun(int n)
    {
        if (n > 0) {
            System.out.print(" "+ n);

            // Calling once
            fun(n - 1);

            // Calling twice
            fun(n - 1);

            //calling thrice
            fun(n-1);
        }
    }

    // Driver code
    public static void main(String[] args)
    {

        fun(3);
    }
}
