package Day3;

import java.util.Scanner;

public class pattern13
{
    public static void  main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int one=1;
        int nsp=n-1;
        int x=1;
        for(int row=1;row<=n;row++)
        {

            for(int sp=1;sp<=nsp;sp++)
            {
                System.out.print("\t");
            }
            //1's
            for(int i=1;i<=one;i++)
            {
                System.out.print(x + "\t");
                x=x+1;
            }
            System.out.println();
            nsp=nsp-1;
            one=one+2;

        }


    }
}
