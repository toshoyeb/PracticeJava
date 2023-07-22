package Day21;
import java.util.Scanner;

public class IsSorted
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Size of array?");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("Enter values for " +i + "th index");
            arr[i]= scn.nextInt();
        }
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int[] arr, int si) {
        if (si == arr.length - 1) {
            return true;
        }
        if (arr[si] > arr[si + 1])
        {
            return false;
        } else {
            return isSorted(arr, si + 1);
        }
    }
}
