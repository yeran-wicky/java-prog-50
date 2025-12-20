// Count digits in a given integer

import java.util.Scanner;
public class A_10 {
    public static void main(String[] args){

        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num == 0){
            count = 1;
        }else{
            while (num != 0){
                num = num / 10;
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}
