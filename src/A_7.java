// Find the factorial of a number using a loop (no recursion)
import java.util.Scanner;
public class A_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0){
            int fact = num;
            while (num != 1){
                fact = fact * (num-1);
                num = num - 1;
            }
            System.out.println(fact);
        }else{
            System.out.println("Not available");
        }
        sc.close();
    }
}