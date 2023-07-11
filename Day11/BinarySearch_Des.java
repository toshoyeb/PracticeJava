package Day11;

import java.util.Scanner;

public class BinarySearch_Des {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
// Always take sorted array, here, in Descending order
        int[] array = {42,41,38,35,29,26,21,19,17,15,11,9,3};
        System.out.println(BinarySearch(array,17));

    }

    public static int BinarySearch(int[] arr, int item)
    {
        int lo = arr.length - 1;
        int hi = 0;

        while(hi<=lo)
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