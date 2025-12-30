// Count how many even and odd numbers are in an array
public class B_5 {
    public static void main(String[] args){

        // Create an integer array and assign some values to it (odd and even mixed)
        int[] numArray = {12, 77, 31, 40, 15, 102, 26};

        // Create two integer variables to count odd numbers and even numbers
        int oddCount = 0;
        int evenCount = 0;

        // Each array element is fetched using a for loop
        for (int num: numArray){
            // If each num value mod 2 = 0; that means that value is divisible by 2
            if (num % 2 == 0){
                // So then +1 is added to even numbers counter
                evenCount = evenCount + 1;
            }
            // If num mod 2 != 0; that means that value is not divisible by 2
            else{
                // So +1 is added to odd numbers counter
                oddCount = oddCount + 1;
            }
        }
        // Finally total number of even numbers and odd numbers of the numArray is printed
        System.out.print("Even numbers count: "+evenCount);
        System.out.println();
        System.out.print("Odd numbers count: "+oddCount);
    }
}