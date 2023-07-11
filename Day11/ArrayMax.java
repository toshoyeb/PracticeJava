package Day11;

import java.util.Scanner;

    public class ArrayMax {
        static Scanner scn = new Scanner(System.in);

        public static void main( String[] args)
        {
            int[] array = takeinput();
            display(array);
            System.out.println(arraymax(array));
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
        public static int arraymax(int[] arr) {
            int max = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length;i++)

            {
                if( arr[i] > max);
                {
                    max = arr[i];
                }
            }
            return max;
        }
        }