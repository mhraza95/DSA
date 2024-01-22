package Recursion;

public class TailRecursion {

    // Recursion function
    static void fun(int n)
    {
        if (n > 0)
        {
            System.out.print(n + " ");

            // Last statement in the function
            fun(n - 1);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int x = 3;
        fun(x);
    }
}
