package Recursion;

public class IndirectRecursion {

    static void funA(int n)
    {
        if (n > 0) {
            System.out.print(" " +n);

            // Fun(A) is calling fun(B)
            funB(n - 1);
        }
    }

    static void funB(int n)
    {
        if (n > 1) {
            System.out.print(" "  +n);

            // Fun(B) is calling fun(A)
            funA(n / 2);
        }
    }

    // Driver code
    public static void main (String[] args)
    {
        funA(20);
    }
}
