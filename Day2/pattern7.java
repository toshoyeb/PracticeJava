package Day2;

import java.util.Scanner;

public class pattern7
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i, j;
        for (i = n; i >= 1; i--)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 2; i <= n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}