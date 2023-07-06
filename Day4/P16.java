package Day5;

import java.util.Scanner;

public class P16
{

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int row = 1;
        int nr = 2 * n - 1;
        int nst = 1;
        for (row = 1; row <= nr; row++)
        {
            int val=row;
            for (int st = 1; st <= nst; st++)
            {
                if(st%2==0)
                {
                    System.out.print("*");
                }
                else if(row<=n)
                {
                System.out.print(val);
                }
                else
                {
                System.out.print(nr-row+1);
                }
            }
            System.out.println();
            if (row <= nr / 2)
            {
                nst = nst + 2;
            }
            else
            {
                nst = nst - 2;
            }
        }
    }


}
