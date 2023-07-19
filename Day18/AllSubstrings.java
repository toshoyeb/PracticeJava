package Day18;

import java.util.Scanner;

public class AllSubstrings {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scn.nextLine();
        for(int i=0;i<=str.length()-1;i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                String ss= str.substring(i,j);
                System.out.println(ss);
            }
            System.out.println();
        }


    }

}
