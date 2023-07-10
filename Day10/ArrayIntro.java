package Day10;

public class ArrayIntro {

    public static void main(String [] args)
    {
     int[] arr= null;
     System.out.println(arr);
        arr= new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
     System.out.println(arr);
     for(int i=0;i < arr.length; i++)
     {
         System.out.println(arr[i]);
     }
    for(int val: arr)
    {
        System.out.println(val);
    }
    }
}
