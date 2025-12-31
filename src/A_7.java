// Find the factorial of a number using a loop (no recursion)
import java.util.Scanner;
public class A_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Gets the user input to find its factorial
        System.out.print("Enter a number: ");
        // Assigns user input to an int variable 'num'
        int num = sc.nextInt();

        // After that, user input is checked whether it is greater than 0 or not
        if (num > 0){
            // If so, a new variable 'fact' is initialized and store user input in it
            int fact = num;
            // While that value is not equal to 1, each number is multiplied by the nearest number
            // in descending order (process of finding the factorial of a number)
            while (num != 1){
                fact = fact * (num-1);
                num = num - 1;
            }
            // Finally, the factorial is printed
            System.out.println(fact);
        }else{
            // If the user input is less than or equal to zero, we cannot find its factorial
            // So an error message will be printed
            System.out.println("Not available");
        }
        sc.close();
    }
}