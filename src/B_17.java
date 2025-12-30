// Rotate an array right by K positions
public class B_17 {
    public static void main(String[] args){
        // Create an integer array and assign some values to it unorganized
        int[] numArray = {34, 21, 87, 89, 45, 5};

        // Create an int variable to store how many times the array should rotate
        int K = 3;
        // Create a counter to check how many rotations done
        int rotateCount = 0;

        // Created a boolean variable to use to check whether rotations are still going on
        // Initially we set its value to 'true' to enter the while loop
        // Once the required rotation count is done, this flag is changed to false in the program below
        boolean isRotate = true;

        // While the rotations finishes (flag -> true), while loop runs
        while (isRotate == true){

            // Create a new int variable and store the last value of the array
            int lastVal = numArray[numArray.length - 1];

            // Loop that shifts each value right
            for (int i = numArray.length - 1; i > 0; i--){
                numArray[i] = numArray[i - 1];
            }

            // Placing the last value at the beginning of the array
            numArray[0] = lastVal;

            // Increment the rotateCount by 1
            rotateCount = rotateCount + 1;

            // If rotateCount equals to K value, that means our required number of rotations are done
            // So we are changing the boolean flag 'isRotate' to false so that while loop no longer runs
            if (rotateCount == K){
                isRotate = false;
            }
        }
        // After 3 rotations, isRotate variable no longer becomes true
        // Then while loop ends and the rotated array is printed using for loop
        System.out.println("Rotated array to the right 3 positions: ");
        for (int num: numArray){
            System.out.print(num+", ");
        }
    }
}
