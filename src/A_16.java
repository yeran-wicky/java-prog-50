// Print first N fibonacci numbers using loops

public class A_16 {
    private static int fib0;
    private static int fib1;
    public static void main(String[] args){

        for (int n = 0; n <= 10; n++){
            if (n == 0){
                fib0 = 0;
                System.out.println(fib0);
            }
            else if(n == 1){
                fib1 = 1;
                System.out.println(fib1);
            }else {

                int a = fib0;
                int b = fib1;

                for (int i = 2; i <= n; i++) {
                    int c = a + b;
                    a = b;
                    b = c;
                }
                int fibn = b;
                System.out.println(fibn);
            }
        }
    }
}
