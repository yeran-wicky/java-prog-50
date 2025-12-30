// Count occurrences (frequency) of a given value in an array.
import java.util.Scanner;
public class B_12 {
    public static void main(String[] args){

        // Create an integer array and assign some values to it with repeated values
        int[] numArray = {34, 21, 21, 21, 87, 89, 89, 45, 5, 5, 5, 5, 5, 5};

        // Create an int variable to count occurrences
        int occurCount = 0;

        // Gets the user input to count
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count occurrences: ");
        int userInt = sc.nextInt();
        // Loops through each index of the array
        for (int i = 0; i < numArray.length; i++){
            // If current element is equal to user input, then occurCount is
            // incremented by 1
            if (numArray[i] == userInt){
                occurCount = occurCount + 1;
            }
        } // Likewise the total count is calculated by incrementing occurCount variable

        // Finally if occurCount is positive value, then occurCount is printed
        if (occurCount > 0){
            System.out.print("Number of occurrences: "+occurCount);
        }
        // Otherwise (occurCount is still zero) none of the elements match user's input
        // That means it is not available in the array
        else{
            System.out.print("Number not found");
        }
    }
}
