package JavaCruxBasicsL1;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n - 1;
        int str = 1;
        int row = 1;
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
            str=str+1;
            sp=sp-1;
            row=row+1;

        }
    }
}

