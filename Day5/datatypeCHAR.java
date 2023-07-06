package Day5;

import java.util.Scanner;



public class datatypeCHAR {
    public static void main(String[]args)
    {
    Scanner s = new Scanner(System.in);
    char ch = s.next().charAt(0);
    System.out.println(ch);

    if(ch>=97&&ch<=122)

    {
        System.out.println("Lower case");
    }
    else if(ch>=65&&ch<=90)

    {
        System.out.println("Upper case");
    }
    else

    {
        System.out.println("Invalid character input");
    }
}
}
