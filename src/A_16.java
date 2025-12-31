// Print first N fibonacci numbers using loops

public class A_16 {

    // Create two variables to store 0th and 1st fibonacci numbers
    private static int fib0;
    private static int fib1;
    public static void main(String[] args){

        // Loop runs from 0 to 10 (including 10) to print fibonacci numbers
        // (from fib0 to fib10)
        for (int n = 0; n <= 10; n++){
            // If n is 0, then it is the first fibonacci number
            if (n == 0){
                // So we directly assign fib0 as 0
                fib0 = 0;
                // And it is printed out
                System.out.println(fib0);
            }
            // If n is 1, then it is the second fibonacci number
            else if(n == 1){
                // So we directly assign fib1 as 1
                fib1 = 1;
                // And it is printed out
                System.out.println(fib1);
            }
            // Else, (that means n is greater than 1) below operation happens
            else {

                // Create two variables and assign first two fibonacci numbers to them for easy access
                // As we know first two fibonacci numbers, using them, rest of the fibonacci numbers can be calculated
                int a = fib0;
                int b = fib1;

                // Loop that runs from 2 to n (including n) to calculate the nth fib number
                for (int i = 2; i <= n; i++) {
                    // Sum of first two fib numbers calculated and assigned to a new int variable 'c'
                    int c = a + b;
                    // Then move b -> a AND c -> b to calculate next fib numbers
                    a = b;
                    b = c;
                }
                // In each iteration, b holds the latest value
                // That is the nth fibonacci number and is printed
                int fibn = b;
                System.out.println(fibn);
                // Likewise, all fibonacci numbers upto nth fibonacci number are printed
            }
        }
    }
}
