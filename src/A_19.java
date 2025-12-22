// Print a right triangle star pattern of height N

public class A_19 {
    public static void main(String[] args){

        int i = 1;
        while (i <= 5){
            int j = 1;
            while (j <= i){
                System.out.print("*");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
