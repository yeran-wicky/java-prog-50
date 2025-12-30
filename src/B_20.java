// Sort an array using insertion sort
public class B_20 {
    public static void main(String[] args){

        // Create an integer array and assign some values to it unorganized
        int[] numArray = {34, 21, 87, 89, 45, 5};

        // Assuming that the first number is already sorted, starts from the
        // 2nd value of the array (which is the index 1)
        for (int i = 1; i < numArray.length; i++){
            // Get the index 'i' number and assign it to a new int variable 'now'
            int now = numArray[i];

            // Moves the values to the right if it is bigger than selected (now) number
            while (i - 1 >= 0 && numArray[i - 1] > now){
                numArray[i] = numArray[i - 1];
                i = i - 1;
            }

            // Here, the selected number is placed in the correct place (place it should be in after sorting)
            numArray[i] = now;
            // This process repeats until all the numbers are sorted
        }
        // Then for loop ends and the sorted array is printed using another for loop
        System.out.println("Sorted array using insertion sort: ");
        for (int num: numArray){
            System.out.print(num+", ");
        }
    }
}
