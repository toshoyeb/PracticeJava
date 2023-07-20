package Day19;
import java.util.Scanner;

public class Fibonacci_RecursionVSLoop {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Input any positive integer N");
        int n = scn.nextInt();
        iteration(n);
        System.out.println("With Recursive Approach");
        for (int i = 0; i < n; i++)
        {
            System.out.println(Recursive(i));
        }
    }

    public static void iteration(int m)
    {
        int a = 0;
        int b = 1;
        int count = 0, sum;
        while (count < m)
        {
            System.out.println(a);
            sum = a + b;
            a = b;
            b = sum;
            count++;
        }
    }

    public static int Recursive(int m)
    {
        if (m <= 1)
            return m;
        return (Recursive(m - 1) + Recursive(m - 2));
    }
}



