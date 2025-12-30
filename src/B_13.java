// Print all duplicate elements in an array
import java.util.Scanner;
public class B_13 {
    public static void main(String[] args){

        // Create an integer array and assign some values to it with repeated values
        int[] numArray = {34, 21, 21, 21, 87, 89, 89, 45, 5, 5, 5, 5, 5, 5};

        // Loop that runs through each element of the numArray
        for (int i = 0; i < numArray.length; i++){

            // Create an int variable to count occurrences
            int occurCount = 0;

            // Loop that runs through each element of the numArray again
            for (int j = 0; j < numArray.length; j++){
                // Here, the current element from outer loop is compared with every element
                // in the array
                if (numArray[i] == numArray[j]){
                    occurCount = occurCount + 1;
                }

            }

            // If the occurCount is greater than 1, that means that element is found
            // more than once
            if (occurCount > 1){

                // To prevent same duplicated element gets printed again, we need to
                // implement additional filtering
                // For that, a flag is used
                // Initially it is set to false
                boolean isPrinted = false;

                // Loops from index 0 to current index (i)
                for (int k = 0; k < i; k++){
                    // If the below condition gets true, that means this value is already
                    // found as a duplicated element
                    if (numArray[i] == numArray[k]){
                        // So we toggle flag to true and break
                        isPrinted = true;
                        break;
                    }
                }

                // If the duplicate value is not found before then it is printed out
                if (isPrinted == false){
                    System.out.println(numArray[i]);
                }
            }
        }
    }
}
