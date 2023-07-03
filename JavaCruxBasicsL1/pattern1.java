package JavaCruxBasicsL1;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (count = 1; count <= n; count++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
