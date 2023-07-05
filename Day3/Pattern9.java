package Day3;

import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = n/2, nst = 1;
        for (int row = 1; row <= n; row++)
        {
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
            //space
            for (int sp = 1; sp <= nsp; sp++)
            {
                System.out.print(" ");
            }
            //prep
            System.out.println();
            if (row <= n / 2)
            {
                nst = nst + 2;
                nsp = nsp -1;
            }
            else
            {
                nst = nst -2;
                nsp = nsp +1;
            }
        }
    }
}