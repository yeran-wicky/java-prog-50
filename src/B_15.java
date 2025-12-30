// Merge two arrays into a third array.
public class B_15 {
    public static void main(String[] args){
        // Create two integer arrays and assign some values to them
        int[] numArray1 = {34, 21, 87, 89, 45, 5};
        int[] numArray2 = {62, 99, 14, 21, 53, 70};

        // Create another empty array to store all above elements (third array)
        int[] numArray3 = new int[numArray1.length+numArray2.length];

        // Using a for loop, each element of the numArray1 is fetched
        // Then each one appended to the numArray3
        for (int i = 0; i <= numArray1.length -1; i++){
            numArray3[i] = numArray1[i];
        }

        // Then using another for loop, each element of the numArray2 is fetched
        // Then each one appended to the numArray3
        for (int i = numArray1.length; i <= numArray3.length - 1; i++){
            numArray3[i] = numArray2[i - numArray1.length];
        }

        // After whole array is copied, numArray3 is printed using a for loop
        System.out.println("Merged array: ");
        for (int num: numArray3){
            System.out.print(num+", ");
        }
    }
}
