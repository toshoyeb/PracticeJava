package Day2;

import javax.swing.*;
import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nr = 2 * n - 1;
        int j=1;
        int row = 1;
        while (row <= nr)
        {
            int i = 1;
            while (i <= j)
            {
                System.out.print("*");
                i++;
            }
            System.out.println();
            if (row <= nr / 2)
            {
                j = j + 1;
            }
            else
            {
                j = j - 1;
            }
            row++;

        }
    }
}
