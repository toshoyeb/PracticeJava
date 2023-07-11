package Day11;

import java.util.Scanner;

public class LinearSearch {


        static Scanner scn = new Scanner(System.in);

        public static void main( String[] args)
        {

            int[] array= {10,23,14,53,234};
            System.out.println(LinearSearch(array,255));

        }

        public static int LinearSearch(int[] arr,int item) {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == item)
                {
                    return i;
                }
            }
            return -1;
        }

}
