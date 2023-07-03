package JavaCruxBasicsL1;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count;
        while (n > 0) {
            for (count = 1; count <= n; count++) {
                System.out.print("*");
            }
            n--;
            System.out.print("\n");

        }
    }
}
