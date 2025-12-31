// Reverse a given integer using loops

import java.util.Scanner;
public class A_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Gets user input to reverse it
        System.out.print("Enter an integer: ");
        // Assigns it to an int variable 'num'
        int num = sc.nextInt();

        // Create a new int variable to store the reverse of the user input
        int rvrse = 0;
        // Inside the while loop, while num value is greater than 0, this continues to loop
        while (num>0){
            // Here, the last digit of user input is fetched using num%10
            // And by rvrse*10, previous digits are shifted to the left
            rvrse = rvrse * 10 + (num % 10);
            // Removes the last digit using integer division
            num = num / 10;
        }
        // Finally, the reversed number is stored to 'rvrse' and it is printed here
        System.out.println(rvrse);
        sc.close();
    }
}
