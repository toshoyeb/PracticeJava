package Day10;

import java.util.Scanner;

public class ArrayOperation {
    static Scanner scn = new Scanner(System.in);
    public static void main( String[] args)
    {
    int[] array = takeinput();
    display(array);
    }
    public static int[] takeinput()
    {
        System.out.println("Size of array?");
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("Enter values for " +i + " index");
            arr[i]= scn.nextInt();
        }
        return arr;
    }
    public static void display(int[] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

}
