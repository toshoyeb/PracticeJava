package Day17;
import java.util.*;

public class SortArrayOrderO_n
{
    public static void main(String[] args)
    {
            Scanner scn=new Scanner(System.in);
            System.out.println("Input length of array");
            int n = scn.nextInt();
            int[] arr=new int[n];
            System.out.println("Input Array: Each input element x, such that x ∈ { 0, 1, 2 }");
            for (int i = 0; i < n; i++)
                arr[i]=scn.nextInt();
            sortColors(arr);
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }
        public static void sortColors(int[] nums) {
            // Write your code here
            int hi=nums.length-1;
            int low=0;
            int mid=0;
            while(mid<=hi)
            {
                if(nums[mid]==0)
                {
                    int temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                }
                else if(nums[mid]==1)
                {
                    mid++;
                }
                else
                {
                    int temp=nums[mid];
                    nums[mid]=nums[hi];
                    nums[hi]=temp;
                    hi--;
                }
            }
    }
}


