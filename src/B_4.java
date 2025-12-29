// Compute the sum and average of array elements
import java.util.Scanner;
public class B_4 {
    public static void main(String[] args){

        // Create two variables to store sum and average values
        int sum = 0;
        int avg = 0;
        // Create an integer array of size 5
        int[] numArray = new int[5];
        Scanner sc = new Scanner(System.in);
        // Loops from 0 to 4 (for the 5 indexes in array)
        for (int i = 0; i < numArray.length; i++) {
            // Reads the user integer input
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            // If user enters a negative number, it should skip
            if (n < 0){
                System.out.println("Negative numbers not allowed");
                // Cancels that iteration count by subtracting one
                // This allows the user to input 5 positive numbers discarding his negative inputs
                i = i - 1;
                continue;
            }else {
                // Appends the input to the array
                numArray[i] = n;
            }
        }
        sc.close();

        // Loops through the elements of the array
        for (int j: numArray){
            // Adds each element and assign to the variable 'sum'
            sum = sum + j;
        }
        // Calculates the average using the sum
        avg = sum/5;
        // Finally, the sum and average is printed
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+avg);
    }
}
