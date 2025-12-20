// Check whether a number is palindrome (loops only)

import java.util.Scanner;
public class A_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int init_val = num;
        int rvrse = 0;
        while (num>0){
            rvrse = rvrse * 10 + (num % 10);
            num = num / 10;
        }
        if (init_val == rvrse){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
        sc.close();
    }
}
