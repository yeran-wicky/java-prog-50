// Calculate the power a^b using loops (no Math pow)

import java.util.Scanner;
public class A_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Gets the base value from the user
        System.out.print("Base value: ");
        // Put that value to an int variable
        int a = sc.nextInt();
        // Gets the power value from the user
        System.out.print("Power value: ");
        // Assign that value also, to another int variable
        int b = sc.nextInt();

        // Create a new variable to store result
        // Initially we set it to 1 other than 0 otherwise multiplying by
        // this variable remains 0
        int result = 1;
        // Loop runs from 1 to b (excluding b)
        for (int i = 0; i < b; i++){
            // Result is multiplied by base value in each iteration
            result = result * a;
        }
        // Finally, base value has multiplied by itself, power times.
        // That is the final result and is printed below
        System.out.println(result);
        sc.close();
    }
}
