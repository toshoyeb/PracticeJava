package Day11;

import java.util.Scanner;

public class SelectionSort {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = takeinput();
        display(array);
        selectionsort(array);
        display1(array);
    }

    public static int[] takeinput() {
        System.out.println("Size of array?");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter values for");
        for (int i = 0; i < arr.length; i++) {

            System.out.println("index " + i);
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr) {
        System.out.print("Unsorted Array :  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i] + " ");
        }
    }

    public static void selectionsort(int[] unsorted)
    {

        for (int i = 0; i < unsorted.length - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j <= unsorted.length - 1; j++)
            {
                if (unsorted[j] < unsorted[min])
                    min = j;
            }
            int temp = unsorted[min];
            unsorted[min] = unsorted[i];
            unsorted[i] = temp;
        }


    }



    public static void display1(int[] arr)
    {
        System.out.println();
        System.out.print("sorted Array :  ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(+arr[i] + " ");
        }
    }
}