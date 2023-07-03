package Day2;

import java.util.Scanner;

public class Pattern5 {

     public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
         int row = 1;
            int sp = 0;
            int str = n;

            while (row <= n)
            {
                int i=1;
                while (i <= sp)
                {
                    System.out.print(" ");
                    i++;
                }
                int j=1;
                while (j <= str)
                {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                str=str-1;
                sp=sp+1;
                row=row+1;

            }
        }
    }
