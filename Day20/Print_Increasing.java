package Day20;

public class Print_Increasing {

    public static void main(String[] args){
        PD(5);
    }
    public static void PD(int n)
    {
        if(n==0)
        {
            return;
        }

        PD(n-1);
        System.out.println(n);
    }
}
