package Day18;

public class PatterN {

        public static void main(String[] args) {
            int n = 5;
            buildPattern(n);
        }

        private static void buildPattern(int n) {
            if(n <= 0)
                return;

            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if(i == 1 || i == n)
                        System.out.print("*");
                    else{
                        if(j == 1 || j == n)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
