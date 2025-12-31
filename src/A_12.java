// Check whether a number is palindrome (loops only)

import java.util.Scanner;
public class A_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Gets user input
        System.out.print("Enter an integer: ");
        // Saves the user's input in an int variable 'num'
        int num = sc.nextInt();

        // Store the user input in another variable also
        // Because num value gets changed when checking it is palindrome or not
        int init_val = num;
        // Create a new variable to store reversed number
        int rvrse = 0;
        // While all digits of the user input are scanned, loop runs
        while (num>0){
            // Here, the last digit of user input is fetched using num%10
            // And by rvrse*10, previous digits are shifted to the left
            rvrse = rvrse * 10 + (num % 10);
            // Removes the last digit using integer division
            num = num / 10;
        }
        // Checks whether user input is equal to the reverse
        // If so, that number can be called as a palindrome number
        if (init_val == rvrse){
            System.out.println("Number is palindrome");
        }else{
            // Otherwise, the number is not palindrome
            System.out.println("Number is not palindrome");
        }
        sc.close();
    }
}
