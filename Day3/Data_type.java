package Day3;

public class Data_type {
    public static void main(String[] args)
    {
        int Fmin=0;
        int Fmax=300;
        int Fcur=0;
        while(Fcur<=Fmax)
        {
            int cel = (int) ((5.0 / 9) * (Fcur - 32));
            System.out.println(Fcur +"\t"+ cel);
        Fcur=Fcur+20;
        }
    }
}
