// Find the second largest element in an array.
public class B_10 {
    public static void main(String[] args){

        // Create an integer array and assign some values to it
        int[] numArray = {34, 21, 87, 89, 45, 5};

        // Create an integer variables to store max values
        // In the beginning, we assume first index element is the max
        int firstMax = numArray[0];
        int secondMax = numArray[0];
        // Create an integer variable to store max index
        int maxIndex = 0;

        // Loops through the elements of the array
        for (int i = 0; i <= numArray.length -1; i++){
            // If a value is greater than firstMax,
            // then firstMax gets updated with that value
            if (numArray[i] > firstMax){
                firstMax = numArray[i];
                // Then we store that value's index to make its value to zero
                // So that it will not be a problem when finding the second largest number
                maxIndex = i;
            }
        }

        // Make the maximum value out of all -> 0
        numArray[maxIndex] = 0;

        // Then again search through the array and find the largest number among them like before
        for (int i = 0; i <= numArray.length -1; i++){
            if (numArray[i] > secondMax){
                secondMax = numArray[i];
                // Largest number we are getting from here is the second largest number of the array
            }
        }
        // Finally, the second largest number is printed
        System.out.println("Second largest element in the array is: "+secondMax);
    }
}
