package Day21;

public class MergeSortRecursion
{
    public static void main(String[] args)
    {

        int[] arr = {20,10,30,50,6,50,80,25};

        int[] SortedArray= mergeSort(arr,0,arr.length-1);
        for (int val : SortedArray)
        {
            System.out.print(val + " ");
        }
    }

    public static int[] merge(int[] arr1, int[] arr2)
    {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] <= arr2[j])
            {
                merged[k] = arr1[i];
                i++;
                k++;
            } else
            {
                merged[k] = arr2[j];
                j++;
                k++;
            }
        }
        if (i == arr1.length)
        {
            while (j < arr2.length)
            {
                merged[k] = arr2[j];
                j++;
                k++;
            }
        }
        if (j == arr2.length)
            {
                while (i < arr1.length)
                {
                    merged[k] = arr1[i];
                    i++;
                    k++;
                }
            }

        return merged;
    }

    public static int[] mergeSort(int[] xyz, int lo, int hi)
    {
        if(lo == hi)
        {
            int[] br = new int[1];
            br[0] = xyz[lo];
            return br;
        }
        int mid = (lo + hi)/2;
        int[] fh = mergeSort(xyz, lo , mid);
        int[] sh = mergeSort(xyz, mid+1 , hi);
        int[] ans= merge(fh, sh);
        return ans;
    }
}
