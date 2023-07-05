package Day4;

import java.util.Scanner;

public class Pattern10 {
        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            int nsp = 2*n-3; int nst = 1;
            for (int row = 1; row <= n; row++)
            {
                //star
                for (int str = 1; str <= nst; str++)
                {
                    System.out.print("*");
                }
                //space
                for (int sp = 1; sp <= nsp; sp++)
                {
                    System.out.print(" ");
                }
                //star
                int str=1;
                if(row==n)
                {
                    str=2;
                }
                for (; str <= nst; str++)
                {
                    System.out.print("*");

                }
                //prep
                System.out.println();
                    nst = nst + 1;
                    nsp = nsp -2;
            }
        }
    }
