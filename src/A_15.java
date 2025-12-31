// Find LCM of two numbers using loops

import java.util.Scanner;
public class A_15 {
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

        // Create a new variable to store the largest number among a and b
        int maxVal = 0;

        // If condition to check whether a or b is the greater value
        if (a > b) {
            maxVal = a;
        }
        else {
            maxVal = b;
        }

        // As we know, LCM must be equal or greater than the largest number
        // So we start checking for LCM from there
        int lcm = maxVal;

        // While loop runs until either of a or b is gets NOT equal to LCM
        while (lcm % a != 0 || lcm % b != 0){
            // LCM value gets incremented by +1
            lcm = lcm + 1;
        }

        // Finally the LCM value is printed
        System.out.println(lcm);
        sc.close();
    }
}