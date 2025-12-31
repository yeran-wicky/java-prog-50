// Find the sum of first N natural numbers
public class A_5 {
    public static void main(String[] args){
        // Create an int variable to store sum of N numbers
        int sum = 0;
        // Loops from i = 0 to 10 (including 10)
        for (int i = 0; i<=10; i++) {
            // In each iteration, i value is added to the sum
            sum = sum + i;
        }
        // Finally the sum, which is the sum of the first N natural numbers is printed
        System.out.println(sum);
    }
}
