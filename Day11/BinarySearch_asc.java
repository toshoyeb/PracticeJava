package Day11;

import java.util.Scanner;

public class BinarySearch_asc {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
// Always take sorted array, here, in ascending order
        int[] array = {7,14,45,152,252,325,451,2522,4545,6565,9898};
        System.out.println(BinarySearch(array,451));

    }

    public static int BinarySearch(int[] arr, int item)
    {
        int lo = 0;
        int hi = arr.length - 1;

        while(hi>=lo)
        {
            int mid = (lo + hi) / 2;

            if (arr[mid] < item)
            {
                lo = mid + 1;
            }
            else if (arr[mid] > item)
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
