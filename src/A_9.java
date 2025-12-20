// Print multiplication tables from 1 to 10 (nested loops)
public class A_9 {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 12; j++){
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
