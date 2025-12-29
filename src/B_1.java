// Read N integers into an array and print them.
import java.util.Scanner;
public class B_1 {
    public static void main(String[] args) {

        // Create an integer array of size 5
        int[] numArray = new int[5];
        Scanner sc = new Scanner(System.in);
        // Loops from 0 to 4 (for the 5 indexes in array)
        for (int i = 0; i < numArray.length; i++) {
            // Reads the user integer input
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            // Appends the input to the array
            numArray[i] = n;
        }
        sc.close();
        // Prints the array using a for loop
        System.out.println();
        for (int num: numArray){
            System.out.print(num+", ");
        }
    }
}