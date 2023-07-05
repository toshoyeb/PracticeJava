package Day3;

import java.util.Scanner;

public class pattern14
{
    public static void  main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int num=1;
        int nsp=n-1;
        for(int row=1;row<=n;row++)
        {
            int x=1;
            for(int sp=1;sp<=nsp;sp++)
            {
                 System.out.print(" ");
            }
            //number

            for(int i=1;i<=num;i++)
            {
                System.out.print(x);
                if(i<=(num/2)+1)
                {
                    x++;
                }
                else
                {
                    x--;
                }
            }
            System.out.println();
            nsp=nsp-1;
            num=num+2;

        }


    }
}
