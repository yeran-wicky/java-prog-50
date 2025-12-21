// Calculate the power a^b using loops (no Math pow)

import java.util.Scanner;
public class A_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Base value: ");
        int a = sc.nextInt();
        System.out.print("Power value: ");
        int b = sc.nextInt();

        int result = 1;
        for (int i = 0; i < b; i++){
            result = result * a;
        }
        System.out.println(result);
        sc.close();
    }
}
