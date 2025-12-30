// Search for a given element (linear search)
import java.util.Scanner;
public class B_6 {
    public static void main(String[] args){

        // Create an integer array and assign some values to it
        int[] numArray = {12, 77, 31, 40, 15, 102, 26};

        // Create a boolean variable to determine whether a number is found or not
        boolean isFound = false;

        // Ask the user input until a matching number is inputted
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int userIn = sc.nextInt();
        // Linear searching through each element whether userIn matches with an element in the array
        for (int i = 0; i < numArray.length; i++){
            // If matched, that means userIn exists in the array. so then isFound variable is
            // toggled to true and breaks the loop
            // Otherwise until a matching number is found, loop continues to run
            if (userIn == numArray[i]){
                isFound = true;
                break;
            }
        }
        // If a matching number has found, then the flag should be toggled to true
        // Then prints that element is found
        if (isFound == true){
            System.out.print("Element found in the array!");
        }
        // As the flag defaults to false, if no matching element is found then
        // prints that element is not found
        else{
            System.out.print("Element is not in the array");
        }
    }
}
