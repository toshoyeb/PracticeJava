package Day3;

import java.util.Scanner;

public class pattern12 {
    public static void  main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int one=1;
        int nsp=n-1;
        for(int row=1;row<=n;row++)
        {
            int x=row;

            for(int sp=1;sp<=nsp;sp++)
            {
                System.out.print(" ");
            }
            //1's
            for(int i=1;i<=one;i++)
            {
                System.out.print(x);
            }
            System.out.println();
            nsp=nsp-1;
            one=one+2;

        }


    }
}
