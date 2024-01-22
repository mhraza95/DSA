package Recursion;

public class HeadRecursion {

    // Recursive function
    static void fun(int n)
    {
        if (n > 0) {

            // First statement in the function
            fun(n - 1);

            System.out.print(" "+ n);
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int x = 3;
        fun(x);

    }
}
