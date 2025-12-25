// Demonstrate deep copy of an array (manual loop copy) and prove original doesn’t change.
public class C_4 {
    public static void main(String[] args){

        // Creating an array with elements (original)
        int[] origArray = {1, 2, 3, 4, 5};
        // Creating an empty array to paste the copied elements from original array
        int[] copyArray = new int[5];

        // Printing original array before doing anything
        System.out.println("Original array:");
        for (int i: origArray){
            System.out.print(i+", ");
        }
        System.out.println();

        // Copying each element of origArray to copyArray
        System.out.print("Copying...");
        for (int i = 0; i < 5; i++) {
            copyArray[i] = origArray[i];
        }
        System.out.println();

        // Printing copyArray
        System.out.println("Copied array:");
        for (int i: copyArray){
            System.out.print(i+", ");
        }
        System.out.println();

        // Modifying copyArray
        System.out.println("Modifying...");
        copyArray[0] = 10;

        // Printing copyArray after modification
        System.out.println("Copied array after modification:");
        for (int i: copyArray){
            System.out.print(i+", ");
        }
        System.out.println();

        // Printing origArray after copying and modifying the copied array
        System.out.println("Original array after copying + modifying copied array:");
        for (int i: origArray){
            System.out.print(i+", ");
        }

        // We can see that after copying and even after modifying that copied array,
        // nothing happens to the original array.
    }
}
