package Day10;

public class array_swap {
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

        // non working swap because a and b
        // are local variable
        System.out.println(arr[i] + "," + arr[j]);
        swap(arr[i], arr[j]);
        System.out.println(arr[i] + "," + arr[j]);

    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    }
