package Day11;

import java.util.Scanner;

public class BinarySearch_Des {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args)
    {
// Always take sorted array, here, in Descending5 order
        System.out.println("Size of array?");
        int n = scn.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements in Descending order for");
        for (int i = 0; i < array.length; i++) {

            System.out.println("index " + i);
            array[i] = scn.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = scn.nextInt();

        int index= BinarySearch(array,target);
        if (index != -1)
        {
            System.out.println("Element found at index: " + index);
        }
        else
        {
            System.out.println("Element not found");
        }

    }

    public static int BinarySearch(int[] arr, int item)
    {
        int lo = 0;
        int hi = arr.length - 1;

        while(hi>=lo)
        {
            int mid = (lo + hi) / 2;

            if (arr[mid] > item)
            {
                lo = mid + 1;
            }
            else if (arr[mid] < item)
            {
                hi = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;

    }
}
