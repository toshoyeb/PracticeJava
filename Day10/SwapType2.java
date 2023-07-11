package Day10;

public class SwapType2 {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        int i = 0;
        int j = 2;
// This won't work because swap function will get
// popped of and all variables associated will get
// deleted
        int[] other = {100,200,300};
        System.out.println(arr[i] + "," + arr[j]);
        swap(arr , other);
        System.out.println(arr[i] + "," + arr[j]);

    }
    public static void swap(int[] one, int[] two)
    {
        int[] temp = one;
        one = two;
        two = temp;
    }
}
