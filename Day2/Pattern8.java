package Day2;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = 1, nst = n / 2;
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
            for (int str = 1; str <= nst; str++)
            {
                System.out.print("*");
            }
            //prep
            System.out.println();
            if (row <= n / 2)
            {
                nst = nst - 1;
                nsp = nsp +2;
            }
            else
            {
                nst = nst + 1;
                nsp = nsp -2;
            }
        }
    }
}