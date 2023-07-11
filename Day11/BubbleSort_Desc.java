package Day11;

import java.util.Scanner;
// For sorting in Descending order
public class BubbleSort_Desc {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = takeinput();
        display(array);
        bubbleSortArray(array);
        display1(array);
    }

    public static int[] takeinput() {
        System.out.println("Size of array?");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter values for");
        for (int i = 0; i < arr.length; i++) {

            System.out.println("index " +i);
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr) {
        System.out.print("Unsorted Array :  ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(+arr[i] +" ");
        }
    }

    public static void bubbleSortArray(int[] unsorted)
    {

        for (int i = 0; i < unsorted.length - 1; i++) {
            for (int j = 0; j < unsorted.length - 1 - i; j++) {
                if (unsorted[j] < unsorted[j + 1]) {
                    //All the changes here will be in heap
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                }

            }
        }
    }
    public static void display1(int[] arr)
    {
        System.out.println();
        System.out.print("sorted Array :  ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(+arr[i] +" ");
        }
    }

}


