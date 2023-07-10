package Day10;

public class Working_swap {
    public static void main(String[] args) {
        int[] arr = null;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int i = 0;
        int j = 2;
        // here the swap function made changes to the heap
        // so it worked
        System.out.println(arr[i] + "," + arr[j]);
        swap(arr, i, j);
        System.out.println(arr[i] + "," + arr[j]);

    }
    public static void swap(int[] xyz, int a, int b)
    {
        int temp = xyz[a];
        xyz[a] = xyz[b];
        xyz[b] = temp;
    }
}
