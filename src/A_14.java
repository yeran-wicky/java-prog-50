// Find GCD of two numbers using loop based Euclid method

import java.util.Scanner;
public class A_14 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 1st number: ");
       int a = sc.nextInt();
       System.out.print("Enter 2nd number: ");
       int b = sc.nextInt();

       int gcd = 0;
       int euc = a % b;
       for (int i = 1; i <= euc && i <= b; i++){
           if (euc % i == 0 && b % i == 0){
               gcd = i;
           }
       }
       System.out.println(gcd);
       sc.close();
    }
}
