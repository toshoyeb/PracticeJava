package Day1;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int c = 0,Rev = 0;
        while (num !=0)
        {
            c = num % 10;
            Rev = Rev * 10+ c;
            num = num / 10;


        }
        System.out.println(Rev);
    }
}