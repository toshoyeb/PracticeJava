package Day1;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int c= 1,sum=0;
        while(c<=n)
        {
            sum = sum + c;
            c = c + 1;
        }
        System.out.println(sum);


    }
}
