package Day18;

public class StringVsStringBuilder {
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        String s = appendStringSB(10000);
        System.out.println(s);
        long end =System.currentTimeMillis();
        System.out.println(end - start);
    }
    public static String appendStringSB(int n)
    {
        StringBuilder s = new StringBuilder();
        for(int i=0; i<=n; i++)
        {
            s.append(i);
        }
        return s.toString();
    }
}

