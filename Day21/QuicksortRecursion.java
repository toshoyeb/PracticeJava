package Day21;

public class QuicksortRecursion {
    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 50, 60, 5, 01, 123,123,43,123 ,545,80, 25};

        quicksort(arr, 0, arr.length - 1);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void quicksort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int mid = (lo + hi) / 2;
        int pivot = arr[mid];

        int left = lo;
        int right = hi;

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        //smaller problem
        quicksort(arr, lo, right);
        quicksort(arr, left, hi);
    }
}
