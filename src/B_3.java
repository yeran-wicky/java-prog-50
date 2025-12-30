// Find the minimum element in an array
import java.util.Scanner;
public class B_3 {
    public static void main(String[] args){

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

        // Initialize an int variable to store min value of the array
        int min = numArray[0];
        // Loops through the elements of the array
        for (int j: numArray){
            // If each element is less than the previous element,
            // that element is updated to the variable 'min'
            if (j < min){
                min = j;
            }
        }
        // Finally, the min value is printed which is the minimum element of the array
        System.out.print("Minimum element is: "+min);
    }
}