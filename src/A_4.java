// Print all odd numbers between 1 and N
public class A_4 {
    public static void main(String[] args){
        // Loops from 1 to 10 (including 10)
        for (int i = 1; i<=10; i++) {
            // Each number is checked whether it is NOT divisible by 2
            // If it is not divisible, that means that number is an odd number
            // Those numbers are printed
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
