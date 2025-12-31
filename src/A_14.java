// Find GCD of two numbers using loop based Euclid method

import java.util.Scanner;
public class A_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Gets the user input (1st number)
        System.out.print("Enter 1st number: ");
        // Saves it in a new int variable 'a'
        int a = sc.nextInt();
        // Gets the user input (2nd number)
        System.out.print("Enter 2nd number: ");
        // Saves it in a new int variable 'b'
        int b = sc.nextInt();

        // Create a new variable to store final GCD value
        int gcd = 0;
        // As euclid method is defined as GCD of a and b is equal to GCD of a%b and b,
        // first we are calculating the mod of a and b, and assign it to a new int variable 'euc'
        int euc = a % b;
        // Using a for loop, this checks all values from 1 to the smaller value between 'euc' and 'b'
        for (int i = 1; i <= euc && i <= b; i++){
            // If both euc value and b value is divisible by 'i' without a remainder,
            // then that i value can be called as a common factor for both euc and b
            if (euc % i == 0 && b % i == 0){
                // Then change gcd's value with that number.
                // While this process repeats, the last stored number is the largest common factor among them
                gcd = i;
                // That is the greatest common factor
            }
        }
        // Finally gcd value is printed
        System.out.println(gcd);
        sc.close();
    }
}
