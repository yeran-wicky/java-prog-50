// Sort an array using selection sort
public class B_19 {
    public static void main(String[] args){

        // Create an integer array and assign some values to it unorganized
        int[] numArray = {34, 21, 87, 89, 45, 5};

        // Create an integer variable 'index' and assign 0 to it
        // This is used to start from the 1st value (0 index) of the array
        int index = 0;

        // Until covering each index, this while loop runs
        while (index < numArray.length - 1) {

            // Create a new variable and assign index's value to it
            int min = index;

            // At the first run, starting from 0 index to the end of the array, this for loop runs
            // It checks whether there's any other value less than array's first element.
            // If so, that element's index is assigned to min variable
            // As the index is incremented in a below line, next iteration does this same process
            // starting from 1st index, because the minimum value element is now on 0 index because of the
            // code block after this code block does the swapping job. So there's nothing to do with that element
            for (int i = index + 1; i < numArray.length; i++) {
                if (numArray[i] < numArray[min]) {
                    min = i;
                }
            }

            // Sorting happens here
            // If min!=index, which means a change has happened to min value in the above code block
            if (min != index) {
                // So, a new variable is created and the value of current index is assigned to it
                int mem = numArray[index];
                // Then the value of current index is altered by value of min index
                // which means the relative minimum value from the elements to the right is
                // placed to the place where it should be in the sorted array
                numArray[index] = numArray[min];
                numArray[min] = mem;
            }
            // index variable is incremented once so that means we are going to
            // find the value which needs to be in the 2nd place of the sorted array
            index = index + 1;
            // This process repeats until all the indexes of the array are covered (sorted)
        }

        // Then while loop ends and the sorted array is printed using for loop
        System.out.println("Sorted array using selection sort: ");
        for (int num: numArray){
            System.out.print(num+", ");
        }
    }
}
