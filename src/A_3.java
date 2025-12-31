// Print all even numbers between 1 and N
public class A_3 {
    public static void main(String[] args){
        // Loops from 1 to 10 (including 10)
        for (int i = 1; i<=10; i++) {
            // Each number is checked whether it is divisible by 2 or not
            // If divisible, they are the even numbers
            // They are printed
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}