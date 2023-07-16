package Day13;
import java.util.Scanner;

public class Duplicate {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] nums = takeinput();
        boolean c = CheckDuplicate(nums);
        System.out.println(c);
    }

    public static boolean CheckDuplicate(int[] nums)
    {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < nums.length - 1; k++) {
            if (nums[k] == nums[k + 1]) {
                return true;
            }
        }
        return false;
    }

    public static int[] takeinput() {
        System.out.println("Size of array?");
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter values for " + i + " index");
            arr[i] = scn.nextInt();
        }
        return arr;
    }
}
