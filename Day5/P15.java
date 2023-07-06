package Day5;

import java.util.Scanner;

public class P15
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

                for (int st = 1; st <= nst; st++)
                {
                    System.out.print("*");
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
