package Day13;
import java.util.Scanner;
public class pattern16 {
        static Scanner scn = new Scanner(System.in);

        public static void main(String[] args)
        {
            System.out.println("Enter Length of pattern");
            int m = scn.nextInt();
            System.out.println("Enter Breadth of pattern");
            int n = scn.nextInt();
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= m; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
