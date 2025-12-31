// Count digits in a given integer

import java.util.Scanner;
public class A_10 {
    public static void main(String[] args){

        // Create a integer variable to store digit count
        int count = 0;
        Scanner sc = new Scanner(System.in);
        // Gets the user input to count its digits
        System.out.print("Enter an integer: ");
        // Assigns user input to a variable 'num'
        int num = sc.nextInt();

        // Checking whether user is inputted 0
        // if so, directly we take it as a count
        if (num == 0){
            count = 1;
        }else{
            // Otherwise while num is not equal to zero,
            while (num != 0){
                // num value is divided (integer division) and can be calculated as a digit
                // by incrementing count variable by +1
                num = num / 10;
                count++;
            }
        }
        // Finally the count, which is the digit count of the user input is printed
        System.out.print(count);
        sc.close();
    }
}
