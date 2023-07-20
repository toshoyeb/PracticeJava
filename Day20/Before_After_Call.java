package Day20;
public class Before_After_Call {
    public static void main(String[] args){
        PD(5);
    }
    public static void PD(int n)
    {
        if(n==0)
        {
            return;
        }
        //In recursion, Stack remains until the return statement is found and when the stack starts falling, we can write
        //more statement required to the program
        System.out.println(n);
        PD(n-1);
        System.out.println(n);
    }

}
