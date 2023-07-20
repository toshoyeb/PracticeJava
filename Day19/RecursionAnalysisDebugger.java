package Day19;

public class RecursionAnalysisDebugger {

    public static void main(String[] args){
        PD(5);
    }
    public static void PD(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        PD(n-1);
    }
}
