// Check whether a number is prime (loop-based)

import java.util.Scanner;
public class A_17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 2){
            System.out.println(num+" is not a prime number");
        }else{
            int x = 2;
            while (x * x <= num){
                if (num % x == 0){
                    System.out.println(num+" is not a prime number");
                    break;
                }
                x = x + 1;
            }
            if ((x * x) > num){
                System.out.println(num+" is a prime number");
            }
        }
        sc.close();
    }
}
