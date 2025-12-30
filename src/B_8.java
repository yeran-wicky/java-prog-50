// Reverse an array in-place
public class B_8 {
    public static void main(String[] args){

        // Create an integer array and assign some values to it
        int[] numArray = {34, 21, 87, 89, 45, 5};

        // Create two variables to store start and end element indexes
        int L = 0;
        int R = numArray.length -1;

        // While the left end index is less than right end index, loop runs
        while (L < R){

            // Store the start value temporary in an int variable
            int tempVal = numArray[L];

            // Assign end value (value at R index) to start value (value at L index)
            numArray[L] = numArray[R];

            // Then assign previously stored tempVal to numArray[R] value
            numArray[R] = tempVal;

            // Moves start value forward by 1 index position
            L = L + 1;

            // Moves end value backward by 1 index position
            R = R - 1;
        }

        // After whole array is reversed, reversed array is printed using a for loop
        System.out.println("Reversed array: ");
        for (int num: numArray){
            System.out.print(num+", ");
        }
    }
}
