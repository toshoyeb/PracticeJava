package Day1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0,b=1,count=0,sum;
        while (count < n) {
            System.out.println(a);
            sum=a+b;
            a=b;
            b=sum;
            count++;
        }
    }

}


