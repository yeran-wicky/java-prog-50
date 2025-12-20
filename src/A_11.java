// Reverse a given integer using loops

import java.util.Scanner;
public class A_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int rvrse = 0;
        while (num>0){
            rvrse = rvrse * 10 + (num % 10);
            num = num / 10;
        }
        System.out.println(rvrse);
        sc.close();
    }
}
