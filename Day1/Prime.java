package Day1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int div = 2;
        boolean flag = true;
        while (div <= n - 1) {
            if (n % div == 0) {
                System.out.println("Non-Prime Number");
                flag = false;
            }
            div = div + 1;
        }
        if (flag == true) System.out.println("Prime Number");

    }
}