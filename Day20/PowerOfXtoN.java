package Day20;

import java.util.Scanner;

public class PowerOfXtoN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input Number");
        int x = scn.nextInt();
        System.out.println("Input Power");
        int n = scn.nextInt();
        System.out.println(Power(x,n));
    }

    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int m = x * Power(x, n - 1);
        return m;

    }
}