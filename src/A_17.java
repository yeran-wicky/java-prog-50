// Check whether a number is prime (loop-based)

import java.util.Scanner;
public class A_17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Gets user input to check whether it is a prime or not
        System.out.print("Enter a number: ");
        // Create new variable 'num' to store user input
        int num = sc.nextInt();

        // If the user input is less than 2, it is not a prime
        // Because there's no primes below 2
        if (num < 2){
            // So a message is printed that the user input is not a prime number
            System.out.println(num+" is not a prime number");
        }
        // Else, (If the user input is greater than or equal to 2)
        else{
            // Create a new int variable to check dividing values starting from 2
            int x = 2;
            // Loop that runs until the given condition becomes false
            // This checks if num is divisible by any number from 2 to square root of num value
            while (x * x <= num){
                // If num is divisible by x, then it is not a prime number
                if (num % x == 0){
                    // So a message is printed that num is not a prime number
                    System.out.println(num+" is not a prime number");
                    break;
                }
                // Otherwise, keeps checking by incrementing x value by +1
                else {
                    x = x + 1;
                }
            }
            // If no x value is divisible from num equals to zero, and also square of x is greater than num,
            // then that number is a prime number
            // So a message is printed that num is a prime number
            if ((x * x) > num){
                System.out.println(num+" is a prime number");
            }
        }
        sc.close();
    }
}
