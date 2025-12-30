// Copy one array into another without using clone() or Arrays.copyOf()
public class B_9 {
    public static void main(String[] args){

        // Create an integer array and assign some values to it
        int[] numArray = {34, 21, 87, 89, 45, 5};

        // Create an integer array of same size to store copied elements
        int[] cpyArray = new int[6];

        // Using a for loop, each element of the original array is fetched
        // Then each one appended to the new array
        for (int i = 0; i <= numArray.length -1; i++){
            cpyArray[i] = numArray[i];
        }

        // After whole array is copied, cpyArray is printed using a for loop
        System.out.println("Copied array: ");
        for (int num: cpyArray){
            System.out.print(num+", ");
        }
    }
}
