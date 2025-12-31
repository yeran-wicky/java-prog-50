// Print the multiplication table of a number up to 12
import java.util.Scanner;
public class A_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Gets the user's input to print its multiplication table
        System.out.print("Enter a number: ");
        // Assign user input to a new int variable
        int num = sc.nextInt();
        // Create a new int variable to mark the starting value of the multiplication table
        int x = 1;
        // Create a new string variable to print out the multiplication table in a formatted way
        String ans = "";

        // While x <= 12, multiplies of user input is prepared (from 1 to 12)
        while (x<=12){
            ans = ans + (num + " * " + x + " = " + (num * x) + "\n");
            x = x + 1;
        }
        // Finally, formatted multiplication table is printed
        System.out.println(ans);
        sc.close();
    }
}
