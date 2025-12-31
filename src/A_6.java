// Find the sum of all even numbers up to N
public class A_6 {
    public static void main(String[] args){
        // Create an int variable to store sum of even numbers upto N numbers
        int sum = 0;
        // Loops from 0 to 10 (including 10)
        for (int i = 0; i<=10; i++) {
            // Each number is checked whether divisible by 2 or not
            // If divisible, the sum of those numbers are calculated
            if (i % 2 == 0) {
               sum = sum + i;
            }
        }
        // Finally the total (sum) is printed (sum of all even numbers upto N)
        System.out.println(sum);
    }
}
