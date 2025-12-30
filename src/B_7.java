// Implement binary search on a sorted array
import java.util.Scanner;
public class B_7 {
    public static void main(String[] args){

        // Create an integer array and assign some values in ascending order
        int[] numArray = {12, 15, 26, 31, 40, 77, 102};
        // Create a boolean variable to determine whether a number is found or not
        boolean isFound = false;

        // Ask the user input until a matching number is inputted
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int userIn = sc.nextInt();

        // Searching the number using binary search method
        // Create two variables to store start and end element indexes
        // (left end element and right end element of the selected part)
        int L = 0;
        int R = numArray.length -1;

        // While the left end index is equal or less than right end index, loop runs
        while (L <= R){
            // Create a new int variable to store middle index of selected part
            int M = (L + R) / 2;

            // Checking whether user's input matches with the value of the element which
            // belongs to the middle index
            if (userIn == numArray[M]){
                // If matched, that means userIn exists in the array. so then isFound variable is
                // toggled to true and breaks the loop
                isFound = true;
                break;
            }
            // Else if user input is less than the middle index element, right end index
            // limit is spread to left side by 1 from middle index
            else if (userIn < numArray[M]){
                R = M - 1;
            }
            // Else, that means user input is greater than the middle index element.
            // If so, limit is spread to right side by 1 from middle index
            else {
                L = M + 1;
            }
        }
        sc.close();

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
