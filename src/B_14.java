// Remove duplicates from an array (create new array)
public class B_14 {
    public static void main(String[] args){

        // Create an integer array and assign some values to it with repeated values
        int[] numArray = {34, 21, 21, 21, 87, 89, 89, 45, 5, 5, 5, 5, 5, 5};

        // Create another empty array that has the same size as numArray
        // This is used to store the result array which duplicates are removed
        int[] newArray = new int[numArray.length];

        // Create a new int variable to store the number of elements found
        // without duplicates for last for loop
        int count = 0;

        // Loop that runs through each element of the numArray
        for (int i = 0; i < numArray.length; i++){

            // To prevent same duplicated element gets selected again, we need to
            // implement additional filtering
            // For that, a flag is used
            // Initially it is set to false
            boolean isFound = false;

            // Loops from index 0 to current index (i)
            for (int k = 0; k < i; k++){
                // If the below condition gets true, that means this value is already
                // found as a duplicated element
                if (numArray[i] == numArray[k]){
                    // So we toggle flag to true and break
                    isFound = true;
                    break;
                }
            }

            // If the duplicate value is not found before, then it is stored in the newArray
            if (isFound == false){
                newArray[count] = numArray[i];
                count = count + 1;
            }
        }
        // Finally the newArray is printed out using a for loop
        System.out.println("New array without duplicated elements:");
        for (int i = 0; i < count; i++){
            System.out.print(newArray[i]+", ");
        }
    }
}
