// Print a number pyramid pattern (nested loops)

public class A_20 {
    public static void main(String[] args){

        int i = 1;
        while (i <= 5){
            int k = 1;
            while (k <= 5-i){
                System.out.print(" ");
                k = k + 1;
            }
            int j = 1;
            while (j <= i){
                System.out.print("* ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
