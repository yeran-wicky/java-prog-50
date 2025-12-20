// Print the multiplication table of a number up to 12
import java.util.Scanner;
public class A_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int x = 1;
        String ans = "";

        while (x<=12){
            ans = ans + num + " * " + x + " = " + (num * x) + "\n";
            x = x + 1;
        }
        System.out.println(ans);
    }
}
