// Sort an array using bubble sort.
public class B_18{
    public static void main(String[] args){

        // Create an integer array and assign some values to it unorganized
        int[] numArray = {34, 21, 87, 89, 45, 5};

        // Created a boolean variable to use to check whether any numbers were swapped
        // Initially we set its value to 'true' to enter the while loop
        boolean isSwapped = true;

        // While the numbers gets swapped (flag -> true), while loop runs
        while (isSwapped == true){
            // Change flag to false for now, and becomes true only if there's a swap
            isSwapped = false;

            // Loop that runs through each index of the array
            for (int i = 0; i < numArray.length - 1; i++){
                // Checking whether current value in the 'i' index is greater than next index's value
                if (numArray[i] > numArray[i + 1]){
                    // If so, then the two numbers gets swapped
                    int temp = numArray[i];
                    numArray[i] = numArray[i + 1];
                    numArray[i + 1] = temp;
                    // Then the flag is changed to true
                    isSwapped = true;
                }
            }
        }
        // After going through each index's value and swapping, isSwapped variable no longer becomes true
        // when all values are sorted in ascending order
        // Then while loop ends and the sorted array is printed using for loop
        System.out.println("Sorted array using bubblesort: ");
        for (int num: numArray){
            System.out.print(num+", ");
        }
    }
}
