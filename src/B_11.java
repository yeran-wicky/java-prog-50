// Find the second smallest element in an array
public class B_11 {
    public static void main(String[] args){

        // Create an integer array and assign some values to it
        int[] numArray = {34, 21, 87, 89, 45, 5};

        // Create an integer variable to store min value
        // In the beginning, we assume first index element is the min
        int firstMin = numArray[0];
        // Create an integer variable to store max index
        int minIndex = 0;

        // Loops through the elements of the array
        for (int i = 0; i <= numArray.length -1; i++){
            // If a value is less than firstMin,
            // then firstMin gets updated with that value
            if (numArray[i] < firstMin){
                firstMin = numArray[i];
                // Then we store that value's index to make its value to zero
                // So that it will not be a problem when finding the second minimum number
                minIndex = i;
            }
        }

        // Finding the max value and replace minimum value of the array with it
        // So that it will not be a problem when finding the second smallest number
        int max = numArray[0];
        for (int j: numArray){
            if (j > max){
                max = j;
            }
        }
        // Make the minimum value out of all -> max
        numArray[minIndex] = max;

        // Create an integer variable to store min value
        // In the beginning, we assume first index element is the min
        int secondMin = numArray[0];
        // Then again search through the array and find the smallest number among them like before
        for (int i = 0; i <= numArray.length -1; i++){
            if (numArray[i] < secondMin){
                secondMin = numArray[i];
                // Smallest number we are getting from here is the second smallest number of the array
            }
        }
        // Finally, the second smallest number is printed
        System.out.println("Second smallest element in the array is: "+secondMin);
    }
}
